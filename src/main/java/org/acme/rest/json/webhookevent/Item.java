
package org.acme.rest.json.webhookevent;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private String field;
    private String fieldtype;
    private String from;
    private String fromString;
    private String to;
    private String toString;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getFieldtype() {
        return fieldtype;
    }

    public void setFieldtype(String fieldtype) {
        this.fieldtype = fieldtype;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFromString() {
        return fromString;
    }

    public void setFromString(String fromString) {
        this.fromString = fromString;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getToString() {
        return toString;
    }

    public void setToString(String toString) {
        this.toString = toString;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Item{" +
                "field='" + field + '\'' +
                ", fieldtype='" + fieldtype + '\'' +
                ", from='" + from + '\'' +
                ", fromString='" + fromString + '\'' +
                ", to='" + to + '\'' +
                ", toString='" + toString + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
