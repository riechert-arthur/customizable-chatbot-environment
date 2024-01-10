/**
 * A basic enumeration of all supported AI service models.
 *
 * NOTE:
 * - Support for other models will be available in the future.
 *
 * @author Arthur Riechert
 * @version 1.0.0
 */
public enum Model {
    GPT_4_0613("gpt-4-0613"),
    GPT_35_TURBO_16K_0613("gpt-3.5-turbo-16k-0613");

    /** The string representation that will be used in the API call. */
    private final String value;

    /**
     * Constructs a model with corresponding string representation.
     *
     * @param value The string to be used in the API call.
     */
    public Model(String value) {
        this.value = value;
    }

    public String getValue() { return value; }
}