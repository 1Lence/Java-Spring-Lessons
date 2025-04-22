package org.example.javaspringlessons.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String admin(@AuthenticationPrincipal UserDetails user) {
        return "Current user: " + user.getUsername() + " Role: " + user.getAuthorities().toString();
    }
}
