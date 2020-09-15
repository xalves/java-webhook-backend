
package org.acme.rest.json.webhookevent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fields {

    private Issuetype issuetype;
    private List<Object> components = null;
    private Integer timespent;
    private Object timeoriginalestimate;
    private String description;
    private Project project;
    private List<Object> fixVersions = null;
    private Integer aggregatetimespent;
    private Object resolution;
    private Timetracking timetracking;
    private List<Attachment> attachment = null;
    private Integer aggregatetimeestimate;
    private Object resolutiondate;
    private Integer workratio;
    private String summary;
    private String lastViewed;
    private Watches watches;
    private Creator creator;
    private List<Object> subtasks = null;
    private String created;
    private Reporter reporter;
    private Aggregateprogress aggregateprogress;
    private Priority priority;
    private List<Object> labels = null;
    private Object environment;
    private Integer timeestimate;
    private Object aggregatetimeoriginalestimate;
    private List<Object> versions = null;
    private Object duedate;
    private Progress progress;
    private Comment comment;
    private List<Object> issuelinks = null;
    private Votes votes;
    private Worklog worklog;
    private Assignee assignee;
    private String updated;
    private Status status;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Issuetype getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
    }

    public List<Object> getComponents() {
        return components;
    }

    public void setComponents(List<Object> components) {
        this.components = components;
    }

    public Integer getTimespent() {
        return timespent;
    }

    public void setTimespent(Integer timespent) {
        this.timespent = timespent;
    }

    public Object getTimeoriginalestimate() {
        return timeoriginalestimate;
    }

    public void setTimeoriginalestimate(Object timeoriginalestimate) {
        this.timeoriginalestimate = timeoriginalestimate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<Object> getFixVersions() {
        return fixVersions;
    }

    public void setFixVersions(List<Object> fixVersions) {
        this.fixVersions = fixVersions;
    }

    public Integer getAggregatetimespent() {
        return aggregatetimespent;
    }

    public void setAggregatetimespent(Integer aggregatetimespent) {
        this.aggregatetimespent = aggregatetimespent;
    }

    public Object getResolution() {
        return resolution;
    }

    public void setResolution(Object resolution) {
        this.resolution = resolution;
    }

    public Timetracking getTimetracking() {
        return timetracking;
    }

    public void setTimetracking(Timetracking timetracking) {
        this.timetracking = timetracking;
    }

    public List<Attachment> getAttachment() {
        return attachment;
    }

    public void setAttachment(List<Attachment> attachment) {
        this.attachment = attachment;
    }

    public Integer getAggregatetimeestimate() {
        return aggregatetimeestimate;
    }

    public void setAggregatetimeestimate(Integer aggregatetimeestimate) {
        this.aggregatetimeestimate = aggregatetimeestimate;
    }

    public Object getResolutiondate() {
        return resolutiondate;
    }

    public void setResolutiondate(Object resolutiondate) {
        this.resolutiondate = resolutiondate;
    }

    public Integer getWorkratio() {
        return workratio;
    }

    public void setWorkratio(Integer workratio) {
        this.workratio = workratio;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLastViewed() {
        return lastViewed;
    }

    public void setLastViewed(String lastViewed) {
        this.lastViewed = lastViewed;
    }

    public Watches getWatches() {
        return watches;
    }

    public void setWatches(Watches watches) {
        this.watches = watches;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public List<Object> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(List<Object> subtasks) {
        this.subtasks = subtasks;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public Aggregateprogress getAggregateprogress() {
        return aggregateprogress;
    }

    public void setAggregateprogress(Aggregateprogress aggregateprogress) {
        this.aggregateprogress = aggregateprogress;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public List<Object> getLabels() {
        return labels;
    }

    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    public Object getEnvironment() {
        return environment;
    }

    public void setEnvironment(Object environment) {
        this.environment = environment;
    }

    public Integer getTimeestimate() {
        return timeestimate;
    }

    public void setTimeestimate(Integer timeestimate) {
        this.timeestimate = timeestimate;
    }

    public Object getAggregatetimeoriginalestimate() {
        return aggregatetimeoriginalestimate;
    }

    public void setAggregatetimeoriginalestimate(Object aggregatetimeoriginalestimate) {
        this.aggregatetimeoriginalestimate = aggregatetimeoriginalestimate;
    }

    public List<Object> getVersions() {
        return versions;
    }

    public void setVersions(List<Object> versions) {
        this.versions = versions;
    }

    public Object getDuedate() {
        return duedate;
    }

    public void setDuedate(Object duedate) {
        this.duedate = duedate;
    }

    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public List<Object> getIssuelinks() {
        return issuelinks;
    }

    public void setIssuelinks(List<Object> issuelinks) {
        this.issuelinks = issuelinks;
    }

    public Votes getVotes() {
        return votes;
    }

    public void setVotes(Votes votes) {
        this.votes = votes;
    }

    public Worklog getWorklog() {
        return worklog;
    }

    public void setWorklog(Worklog worklog) {
        this.worklog = worklog;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Fields{" +
                "issuetype=" + issuetype +
                ", components=" + components +
                ", timespent=" + timespent +
                ", timeoriginalestimate=" + timeoriginalestimate +
                ", description='" + description + '\'' +
                ", project=" + project +
                ", fixVersions=" + fixVersions +
                ", aggregatetimespent=" + aggregatetimespent +
                ", resolution=" + resolution +
                ", timetracking=" + timetracking +
                ", attachment=" + attachment +
                ", aggregatetimeestimate=" + aggregatetimeestimate +
                ", resolutiondate=" + resolutiondate +
                ", workratio=" + workratio +
                ", summary='" + summary + '\'' +
                ", lastViewed='" + lastViewed + '\'' +
                ", watches=" + watches +
                ", creator=" + creator +
                ", subtasks=" + subtasks +
                ", created='" + created + '\'' +
                ", reporter=" + reporter +
                ", aggregateprogress=" + aggregateprogress +
                ", priority=" + priority +
                ", labels=" + labels +
                ", environment=" + environment +
                ", timeestimate=" + timeestimate +
                ", aggregatetimeoriginalestimate=" + aggregatetimeoriginalestimate +
                ", versions=" + versions +
                ", duedate=" + duedate +
                ", progress=" + progress +
                ", comment=" + comment +
                ", issuelinks=" + issuelinks +
                ", votes=" + votes +
                ", worklog=" + worklog +
                ", assignee=" + assignee +
                ", updated='" + updated + '\'' +
                ", status=" + status +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
