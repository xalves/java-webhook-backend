
package org.acme.rest.json.webhookeventstoptransition;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Transition {

    private Integer id;
    private Integer workflowId;
    private String workflowName;
    private Integer transitionId;
    private String transitionName;
    private String fromStatus;
    private String toStatus;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }

    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }


    public Integer getTransitionId() {
        return transitionId;
    }

    public void setTransitionId(Integer transitionId) {
        this.transitionId = transitionId;
    }

    public String getTransitionName() {
        return transitionName;
    }

    public void setTransitionName(String transitionName) {
        this.transitionName = transitionName;
    }

    public String getFromStatus() {
        return fromStatus;
    }

    public void setFromStatus(String fromStatus) {
        this.fromStatus = fromStatus;
    }

    public String getToStatus() {
        return toStatus;
    }

    public void setToStatus(String toStatus) {
        this.toStatus = toStatus;
    }

    @Transient
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Transition{" +
                "workflowId=" + workflowId +
                ", workflowName='" + workflowName + '\'' +
                ", transitionId=" + transitionId +
                ", transitionName='" + transitionName + '\'' +
                ", fromStatus='" + fromStatus + '\'' +
                ", toStatus='" + toStatus + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
