package net.writeacode.demos.iademo.controller;

import net.writeacode.demos.iademo.service.GreetingsAiMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    public GreetingController(GreetingsAiMessage greetingsAiMessage) {
        this.greetingsAiMessage = greetingsAiMessage;
    }

    private GreetingsAiMessage greetingsAiMessage;

    @GetMapping("v1/greetings")
    String greetingsController(){
        return greetingsAiMessage.greetings();
    }
}
