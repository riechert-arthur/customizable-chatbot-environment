package com.arthur.app.service.utilities;

/**
 * Denotes the specific origins that a message may have.
 *
 * @author Arthur Riechert
 * @version 1.0.0
 */

public enum Role {
    SYSTEM("system"),
    USER("user"),
    ASSISTANT("assistant");

    /** The string representation of the enum. */
    private final String value;

    /**
     * Constructs an individual role enum with associate values.
     *
     * @param value The value to associate with the role.
     */
    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}