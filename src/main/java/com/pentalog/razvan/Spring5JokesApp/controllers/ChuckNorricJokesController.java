package com.pentalog.razvan.Spring5JokesApp.controllers;

import com.pentalog.razvan.Spring5JokesApp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ChuckNorricJokesController {
    private JokesService jokesService;

    @Autowired
    public ChuckNorricJokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    public String getJoke() {
        return jokesService.tellJoke();
    }

    @RequestMapping("/chuck-jokes")
    public String getJokes(Model model) {
        List<String> jokesList = new ArrayList<>(12);
        for (int i = 0; i < 12; i++) {
            jokesList.add(jokesService.tellJoke());
        }
        model.addAttribute("jokesList", jokesList);
        return "chuck-jokes";
    }

    @RequestMapping("/")
    public String getChuckJokes(Model model) {
        model.addAttribute("joke", jokesService.tellJoke());
        return "chucknorris";
    }
}
