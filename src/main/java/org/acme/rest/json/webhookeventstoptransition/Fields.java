
package org.acme.rest.json.webhookeventstoptransition;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class Fields {


    private Integer id;

    private Issuetype issuetype;
    @Transient
    private List<Object> components = null;
    @Transient
    private Object timespent;
    @Transient
    private Object timeoriginalestimate;
    private String description;
    private Project project;
    @Transient
    private List<Object> fixVersions = null;
    @Transient
    private Object aggregatetimespent;
    private String resolution;
    @Transient
    private Timetracking timetracking;
    @Transient
    private List<Attachment> attachment = null;
    @Transient
    private Object aggregatetimeestimate;
    @Transient
    private Object resolutiondate;
    private Integer workratio;
    private String summary;
    private String lastViewed;
    @Transient
    private Watches watches;

    private Creator creator;
    @Transient
    private List<Object> subtasks = null;
    private String created;

    private Reporter reporter;
    @Transient
    private Aggregateprogress aggregateprogress;
    @Transient
    private Priority priority;
    @Transient
    private List<Object> labels = null;
    @Transient
    private Object environment;
    @Transient
    private Object timeestimate;
    @Transient
    private Object aggregatetimeoriginalestimate;
    @Transient
    private List<Object> versions = null;
    @Transient
    private Object duedate;
    @Transient
    private Progress progress;
    @Transient
    private Comment comment;
    @Transient
    private List<Object> issuelinks = null;
    @Transient
    private Votes votes;
    @Transient
    private Worklog worklog;
    private Assignee assignee;
    private String updated;

    private Status status;
    @Transient
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "FIELDS_ISSUETYPE",
            joinColumns = @JoinColumn(name = "FIELDS_ID"),
            inverseJoinColumns = @JoinColumn(name = "ISSUETYPE_ID"))
    public Issuetype getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
    }

    @Transient
    public List<Object> getComponents() {
        return components;
    }

    public void setComponents(List<Object> components) {
        this.components = components;
    }
    @Transient
    public Object getTimespent() {
        return timespent;
    }

    public void setTimespent(Object timespent) {
        this.timespent = timespent;
    }
    @Transient
    public Object getTimeoriginalestimate() {
        return timeoriginalestimate;
    }

    public void setTimeoriginalestimate(Object timeoriginalestimate) {
        this.timeoriginalestimate = timeoriginalestimate;
    }

    @Lob
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "FIELDS_Project",
            joinColumns = @JoinColumn(name = "FIELDS_ID"),
            inverseJoinColumns = @JoinColumn(name = "PROJECT_ID"))
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    @Transient
    public List<Object> getFixVersions() {
        return fixVersions;
    }

    public void setFixVersions(List<Object> fixVersions) {
        this.fixVersions = fixVersions;
    }
    @Transient
    public Object getAggregatetimespent() {
        return aggregatetimespent;
    }

    public void setAggregatetimespent(Object aggregatetimespent) {
        this.aggregatetimespent = aggregatetimespent;
    }


    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    @Transient
    public Timetracking getTimetracking() {
        return timetracking;
    }

    public void setTimetracking(Timetracking timetracking) {
        this.timetracking = timetracking;
    }
    @Transient
    public List<Attachment> getAttachment() {
        return attachment;
    }

    public void setAttachment(List<Attachment> attachment) {
        this.attachment = attachment;
    }
    @Transient
    public Object getAggregatetimeestimate() {
        return aggregatetimeestimate;
    }

    public void setAggregatetimeestimate(Object aggregatetimeestimate) {
        this.aggregatetimeestimate = aggregatetimeestimate;
    }
    @Transient
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

    @Lob
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
    @Transient
    public Watches getWatches() {
        return watches;
    }

    public void setWatches(Watches watches) {
        this.watches = watches;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "FIELDS_CREATOR",
            joinColumns = @JoinColumn(name = "FIELDS_ID"),
            inverseJoinColumns = @JoinColumn(name = "CREATOR_ID"))
    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }
    @Transient
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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "FIELDS_REPORTER",
            joinColumns = @JoinColumn(name = "FIELDS_ID"),
            inverseJoinColumns = @JoinColumn(name = "REPORTER_ID"))
    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }
    @Transient
    public Aggregateprogress getAggregateprogress() {
        return aggregateprogress;
    }

    public void setAggregateprogress(Aggregateprogress aggregateprogress) {
        this.aggregateprogress = aggregateprogress;
    }
    @Transient
    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    @Transient
    public List<Object> getLabels() {
        return labels;
    }

    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }
    @Transient
    public Object getEnvironment() {
        return environment;
    }

    public void setEnvironment(Object environment) {
        this.environment = environment;
    }
    @Transient
    public Object getTimeestimate() {
        return timeestimate;
    }

    public void setTimeestimate(Object timeestimate) {
        this.timeestimate = timeestimate;
    }
    @Transient
    public Object getAggregatetimeoriginalestimate() {
        return aggregatetimeoriginalestimate;
    }

    public void setAggregatetimeoriginalestimate(Object aggregatetimeoriginalestimate) {
        this.aggregatetimeoriginalestimate = aggregatetimeoriginalestimate;
    }
    @Transient
    public List<Object> getVersions() {
        return versions;
    }

    public void setVersions(List<Object> versions) {
        this.versions = versions;
    }
    @Transient
    public Object getDuedate() {
        return duedate;
    }

    public void setDuedate(Object duedate) {
        this.duedate = duedate;
    }
    @Transient
    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }
    @Transient
    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
    @Transient
    public List<Object> getIssuelinks() {
        return issuelinks;
    }

    public void setIssuelinks(List<Object> issuelinks) {
        this.issuelinks = issuelinks;
    }
    @Transient
    public Votes getVotes() {
        return votes;
    }

    public void setVotes(Votes votes) {
        this.votes = votes;
    }
    @Transient
    public Worklog getWorklog() {
        return worklog;
    }

    public void setWorklog(Worklog worklog) {
        this.worklog = worklog;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "FIELDS_ASSIGNEE",
            joinColumns = @JoinColumn(name = "FIELDS_ID"),
            inverseJoinColumns = @JoinColumn(name = "ASSIGNEE_ID"))
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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "FIELDS_STATUS",
            joinColumns = @JoinColumn(name = "FIELDS_ID"),
            inverseJoinColumns = @JoinColumn(name = "STATUS_ID"))
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    @Transient
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
