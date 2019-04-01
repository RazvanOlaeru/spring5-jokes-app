package com.pentalog.razvan.Spring5JokesApp;

import com.pentalog.razvan.Spring5JokesApp.controllers.ChuckNorricJokesController;
import com.pentalog.razvan.Spring5JokesApp.controllers.NormalJokesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5JokesAppApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Spring5JokesAppApplication.class, args);
		ChuckNorricJokesController chuckNorricJokesController = (ChuckNorricJokesController) ctx.getBean("chuckNorricJokesController");
		NormalJokesController normalJokesController = (NormalJokesController) ctx.getBean(NormalJokesController.class);

		System.out.println("Normal Jokes: ");
		System.out.println(normalJokesController.getJoke());
		System.out.println(normalJokesController.getJoke());
		System.out.println(normalJokesController.getJoke());

		System.out.println("Chuck Norris Jokes: ");
		System.out.println(chuckNorricJokesController.getJoke());
		System.out.println(chuckNorricJokesController.getJoke());
		System.out.println(chuckNorricJokesController.getJoke());
	}
}
