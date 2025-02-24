package net.vladitandlplater.mystic_forgery.systems.attributes;

/**
 * Represents an attribute that stores a float value (e.g., damage).
 */
public class FloatAttribute extends ComponentAttribute {
    private float value;

    /**
     * Constructs a FloatAttribute with the specified value.
     *
     * @param value The float value to store in this attribute.
     */
    public FloatAttribute(float value) {
        this.value = value;
    }

    /**
     * Retrieves the value stored by this FloatAttribute.
     *
     * @return The float value this attribute stores.
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of this FloatAttribute.
     *
     * @param value The new float value to store in this attribute.
     */
    public void setValue(float value) {
        this.value = value;
    }
}
