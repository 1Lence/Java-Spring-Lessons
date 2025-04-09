package org.example.javaspringlessons.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity(jsr250Enabled = true)
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/public/**").hasRole("USER")
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String userPass = encoder.encode("user");
        String adminPass = encoder.encode("admin");
        String supportPass = encoder.encode("support");

        UserDetails user = User.builder()
                .username("user")
                .password(userPass)
                .roles("USER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .password(adminPass)
                .roles("ADMIN")
                .build();

        UserDetails support = User.builder()
                .username("support")
                .password(supportPass)
                .roles("SUPPORT")
                .build();

        return new InMemoryUserDetailsManager(user, admin, support);
    }
}
