
package org.acme.rest.json.webhookevent;



/**
 * Entity Property
 * <p>
 * 
 * 
 */
public class Property {

    private String key;
    private Object value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Property{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
