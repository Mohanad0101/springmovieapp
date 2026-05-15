package com.example.springmovieapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Перенаправление с главной страницы на список фильмов.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "redirect:/api/movies";
    }
}
