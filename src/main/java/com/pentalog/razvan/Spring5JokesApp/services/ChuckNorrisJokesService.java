package com.pentalog.razvan.Spring5JokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ChuckNorrisJokesService implements JokesService {
    private ChuckNorrisQuotes chuckNorricJokes;

    public ChuckNorrisJokesService() {
        chuckNorricJokes = new ChuckNorrisQuotes();
    }

    @Override
    public String tellJoke() {
        return chuckNorricJokes.getRandomQuote();
    }
}
