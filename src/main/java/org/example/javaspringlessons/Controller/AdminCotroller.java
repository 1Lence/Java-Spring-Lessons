package org.example.javaspringlessons.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminCotroller {

    @GetMapping
    public String admin(@AuthenticationPrincipal UserDetails user) {
        return "Current user: " + user.getUsername() + " Role: " + user.getAuthorities().toString();
    }
}
