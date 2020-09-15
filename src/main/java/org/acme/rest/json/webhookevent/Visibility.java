
package org.acme.rest.json.webhookevent;

import java.util.HashMap;
import java.util.Map;


/**
 * Visibility
 * <p>
 * 
 * 
 */
public class Visibility {

    private Type type;
    private String value;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Visibility{" +
                "type=" + type +
                ", value='" + value + '\'' +
                '}';
    }

    public enum Type {

        GROUP("group"),
        ROLE("role");
        private final String value;
        private final static Map<String, Type> CONSTANTS = new HashMap<String, Type>();

        static {
            for (Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Type fromValue(String value) {
            Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
