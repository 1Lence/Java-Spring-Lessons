package org.example.javaspringlessons.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping( "/first")
public class HttpController {

    @GetMapping
    public String getHeaders(@RequestHeader Map<String, String> headers, Model model) {
        model.addAttribute("headers", headers);
        return "respons";
    }
}