package com.arthur.app.service.utilities;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A list that stores all messages. 
 *
 * @author Arthur Riechert
 * @version 1.0.0
 */
public class Conversation {
    
    /** A list to store all messages. */
    private ArrayList<Message> conversation;

    /**
     * Takes in a dynamic number of messages, and converts them
     * into a list that is the conversation.
     *
     * @param messages A variable number of messages.
     */
    public Conversation(Message... messages) {
        conversation = Arrays.asList(messages);
    }

    /**
     * Creates an empty conversation.
     */
    public Conversation() {
        conversation = new ArrayList<>();
    }

    public ArrayList<Message> getConversation() {
        return new ArrayList<Message>(conversation);
    }

    @Override
    public String toString() {

        StringBuilder conversation = StringBuilder(this.conversation);

        for (Message message : this.conversation) {
            conversation.append(message.toString() + "\n");
        }

        return conversation.toString();
    }
}