package org.example.javaspringlessons.contorller;

import lombok.RequiredArgsConstructor;
import org.example.javaspringlessons.annotation.RateLimited;
import org.example.javaspringlessons.service.SomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aop")
public class SomeController {
    private final SomeService someService;

    @GetMapping
    @RateLimited
    public String get() {
        int count = 0; //Заглушка, не понял как по другому
        return someService.job(count);
    }
}
