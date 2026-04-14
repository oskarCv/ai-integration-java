package net.writeacode.demos.iademo.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface GreetingsAiMessage {
    @UserMessage("""
            Generate a greetings message for the write a code users.
            the message should not be longer than 120 chars.
            the message should be in a polite and professional tone
            """)
    String greetings();
}
