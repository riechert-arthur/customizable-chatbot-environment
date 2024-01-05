package com.arthur.app.service.utilities;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A list that stores all messages. 
 *
 * @author Arthur Riechert
 * @version 1.0.1
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
        conversation = new ArrayList<Message>(Arrays.asList(messages));
    }

    /**
     * Creates an empty conversation.
     */
    public Conversation() {
        this();
    }

    /**
     * Copies a conversation by creating a new object.
     *
     * @param conversation The conversation to copy.
     */
    public Conversation(Conversation object) {
        this(object.conversation.toArray())
    }

    public ArrayList<Message> getConversation() {
        return new ArrayList<Message>(conversation);
    }

    @Override
    public String toString() {

        StringBuilder conversation = new StringBuilder();

        for (Message message : this.conversation) {
            conversation.append(message.toString() + "\n");
        }

        return conversation.toString();
    }
}