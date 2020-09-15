
package org.acme.rest.json.webhookevent;

import java.util.HashMap;
import java.util.Map;

public class Timetracking {

    private String remainingEstimate;
    private String timeSpent;
    private Integer remainingEstimateSeconds;
    private Integer timeSpentSeconds;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getRemainingEstimate() {
        return remainingEstimate;
    }

    public void setRemainingEstimate(String remainingEstimate) {
        this.remainingEstimate = remainingEstimate;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }

    public Integer getRemainingEstimateSeconds() {
        return remainingEstimateSeconds;
    }

    public void setRemainingEstimateSeconds(Integer remainingEstimateSeconds) {
        this.remainingEstimateSeconds = remainingEstimateSeconds;
    }

    public Integer getTimeSpentSeconds() {
        return timeSpentSeconds;
    }

    public void setTimeSpentSeconds(Integer timeSpentSeconds) {
        this.timeSpentSeconds = timeSpentSeconds;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Timetracking{" +
                "remainingEstimate='" + remainingEstimate + '\'' +
                ", timeSpent='" + timeSpent + '\'' +
                ", remainingEstimateSeconds=" + remainingEstimateSeconds +
                ", timeSpentSeconds=" + timeSpentSeconds +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
