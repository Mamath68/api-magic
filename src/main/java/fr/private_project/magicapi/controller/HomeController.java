package fr.private_project.magicapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    public HomeController() {
        System.err.println("HOME CONTROLLER A DEMARRE");
    }

    @GetMapping("/")
    public String hello() {
        return "<h1>Hello world</h1>";
    }
}
