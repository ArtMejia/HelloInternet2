package com.mejia.helloInternet2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RootController {

    @GetMapping ("/")
    private String helloCareerDevs() {
        return "You requested the root route";
    }

    @GetMapping ("/hello")
    private String helloRoute() {
        return "Hello CareerDevs!!!";
    }

    @GetMapping("/random")
    private int randomRoute() {
        return (int) (Math.random() * 100) + 1;
    }

    @GetMapping("/joke")
    private String jokeRoute() {
        String[] jokes = {"Where do fruits go on vacation?\nPear-is!",
                "I asked my dog what's two minus two. He said nothing.",
                "Where do you learn to make a banana split?\nSundae school.",
                "What has more letters than the alphabet?\nThe post office!"
        };
        int jokeIndex = (int) (Math.random() * jokes.length);
        return jokes[jokeIndex];
    }

    @GetMapping("/joke/{id}")
    private String getJokeById(@PathVariable int id) {
        String[] jokes = {"Where do fruits go on vacation?\nPear-is!",
                "I asked my dog what's two minus two. He said nothing.",
                "Where do you learn to make a banana split?\nSundae school.",
                "What has more letters than the alphabet?\nThe post office!"
        };
        return jokes[id];
    }

}
