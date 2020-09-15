package org.acme.rest.json.event;

public class Event {

    public String json;
    public String description;

    public Event() {
    }

    public Event(String json, String description) {
        this.json = json;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Event{" +
                "json='" + json + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
