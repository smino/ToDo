package de.swtproject.todo.core;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "todo")
public class ToDo {

    @DatabaseField(id = true)
    private String titel;

    @DatabaseField
    private String description;

    private Period interval;
    private Date start;
    private Date deadline;
    private Date notifyPoint;

    ToDo() {
        //needed for ORMLight
    }

    public ToDo(String title, String description) {
        this.titel = title;
        this.description = description;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Period getInterval() {
        return interval;
    }

    public void setInterval(Period interval) {
        this.interval = interval;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getNotifyPoint() {
        return notifyPoint;
    }

    public void setNotifyPoint(Date notifyPoint) {
        this.notifyPoint = notifyPoint;
    }

    public void save(String titel, String description, Date start, Date deadline, Date notifypoint) {
      //save todo
    }
}
