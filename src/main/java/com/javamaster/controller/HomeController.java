package com.javamaster.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/entrance")
    public String home(@RequestParam("login") Optional<String> login, @RequestParam("password")  Optional<String> password, Model model) {
        model.addAttribute("login", login);
        model.addAttribute("password", password);

        return "home_page";
    }
}
