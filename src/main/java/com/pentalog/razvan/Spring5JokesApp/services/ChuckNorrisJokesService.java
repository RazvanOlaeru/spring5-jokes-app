package com.pentalog.razvan.Spring5JokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ChuckNorrisJokesService implements JokesService {
    private final ChuckNorrisQuotes chuckNorricJokes;

    @Autowired
    public ChuckNorrisJokesService(ChuckNorrisQuotes chuckNorricJokes) {
        this.chuckNorricJokes = chuckNorricJokes;
    }

    @Override
    public String tellJoke() {
        return chuckNorricJokes.getRandomQuote();
    }
}
