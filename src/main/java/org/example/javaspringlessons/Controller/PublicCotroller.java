package org.example.javaspringlessons.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/public")
public class PublicCotroller {

    @GetMapping
    public String publicUser(@AuthenticationPrincipal UserDetails user) {
        return "UserName: " + user.getUsername() + "; Roles: " + user.getAuthorities().toString();
    }
}
