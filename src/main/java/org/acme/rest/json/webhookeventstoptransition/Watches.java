
package org.acme.rest.json.webhookeventstoptransition;

import java.util.HashMap;
import java.util.Map;

public class Watches {

    private String self;
    private Integer watchCount;
    private Boolean isWatching;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Integer getWatchCount() {
        return watchCount;
    }

    public void setWatchCount(Integer watchCount) {
        this.watchCount = watchCount;
    }

    public Boolean getIsWatching() {
        return isWatching;
    }

    public void setIsWatching(Boolean isWatching) {
        this.isWatching = isWatching;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Watches{" +
                "self='" + self + '\'' +
                ", watchCount=" + watchCount +
                ", isWatching=" + isWatching +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
