package com.arthur.app.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import com.arthur.app.service.utilities.Conversation;
import com.arthur.app.service.utilities.Message;
import com.arthur.app.service.utilities.Role;

/**
 * @author Arthur Riechert
 * @version 1.0.0
 */

@Controller
@RequestMapping("conversation")
public class RestService {

    public static void main(String[] arguments) {
        // SpringApplication.run(RestService.class, arguments);
    }

    @GetMapping(value = "/{id}",  produces = "application/json")
    public @ResponseBody Conversation getConversation(@PathVariable String id) {
        return new Conversation(
            new Message(Role.USER, "Hello, " + id + "!")
        );
    }
}