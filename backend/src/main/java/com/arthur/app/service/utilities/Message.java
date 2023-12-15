package com.arthur.app.service.utilities;
/**
 * Stores messages for large language models by the origin
 * of the message and the content.
 * 
 * NOTE: Messages are immutable.
 *
 * @author Arthur Riechert
 * @version 1.0.0
 */
public class Message {

    /** The entity that created the message. */
    private final String role;

    /** The message itself. */
    private final String content;

    /**
     * Constructs a custom message.
     *
     * @param role The entity that created the message.
     * @param content The message itself.
     */
    public Message(String role, String content) {
        this.role = role;
        this.content = content;
    }

    /**
     * Constructs a copy of an existing message.
     *
     * @param message The message to be copied.
     */
    public Message(Message message) {
        this.role = message.role;
        this.content = message.content;
    }

    public String getRole() {
        return role;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return String.format("Role: %s | Content: %s", role, content);
    }
}