package com.pentalog.razvan.Spring5JokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class NormalJokesService implements JokesService {
    private List<String> jokes = new ArrayList(12);

    public NormalJokesService() {
        this.jokes.add("Did you know that dolphins are so smart that within a few weeks of captivity, they can train people to stand on the very edge of the pool and throw them fish?");
        this.jokes.add("If you think nobody cares if you’re alive, try missing a couple of payments.");
        this.jokes.add("I want to die peacefully in my sleep, like my grandfather.. Not screaming and yelling like the passengers in his car");
        this.jokes.add("The last thing I want to do is hurt you. But it’s still on the list.");
        this.jokes.add("We live in a society where pizza gets to your house before the police.");
        this.jokes.add("Evening news is where they begin with ‘Good evening’, and then proceed to tell you why it isn’t.");
        this.jokes.add("Light travels faster than sound. This is why some people appear bright until you hear them speak.");
        this.jokes.add("Knowledge is knowing a tomato is a fruit; Wisdom is not putting it in a fruit salad.");
        this.jokes.add("If I agreed with you we’d both be wrong.");
        this.jokes.add("The early bird might get the worm, but the second mouse gets the cheese.");
        this.jokes.add("Politicians and diapers have one thing in common. They should both be changed regularly, and for the same reason.");
        this.jokes.add("Children: You spend the first 2 years of their life teaching them to walk and talk. Then you spend the next 16 years telling them to sit down and shut-up.");
    }

    @Override
    public String tellJoke() {
        return this.jokes.get(ThreadLocalRandom.current().nextInt(1, this.jokes.size()));
    }
}
