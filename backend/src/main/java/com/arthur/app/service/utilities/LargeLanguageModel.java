package com.arthur.service.utilities;

/**
 * A class to model the requirements that subclasses should fulfill
 * in order to properly interact with various types of large language
 * models, regardless of provider.
 *
 * @author Arthur Riechert
 * @version 1.0.0
 */

public abstract class LargeLanguageModel {

    /** The context limit of the model. */
    private int maxTokens;

    /** The temperature of the model. */
    private double temperature;

    /** The system message of the model. */
    private Message systemMessage;

    /** The company that provides this model. */
    private Provider provider;

    /** The recent context history with the model. */
    private Conversation conversation;

    /**
     * Constructs a custom instance of a large language model.
     *
     * @param maxTokens The context limit of the model.
     * @param temperature The predictability of the model.
     * @param systemMessage The initial message to define model behavior.
     * @param provider The company providing API access.
     * @param conversation The recent context history with the model.
     */
    public LargeLanguageModel(
        int maxTokens,
        double temperature,
        Message systemMessage,
        Provider provider,
        Conversation conversation
    ) {
        this.maxTokens = maxTokens;
        this.temperature = temperature;
        this.systemMessage = new Message(systemMessage);
        this.provider = provider;
        this.conversation = new Conversation(conversation);
    }

    /** Implements a method to get completions based on context history. */
    public abstract Message getCompletion(Conversation conversation);

    /** Implements a method to get completions based on a single message. */
    public abstract Message getCompletion(Message message);

    /** Implements a method to get completions based on conversation and new message. */
    public abstract Message getCompletion(Conversation conversation, Message message)

    public int getMaxTokens() {
        return maxTokens;
    }

    public double getTemperature() {
        return temperature;
    }

    public Message getSystemMessage() {
        return systemMessage;
    }

    public Provider getProvider() {
        return provider;
    }

    public Conversation getConversation() {
        return new Conversation(conversation);
    }
}