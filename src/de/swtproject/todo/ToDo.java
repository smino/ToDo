public class ToDo {
    private String titel;
    private String description;

    private Period interval;
    private Datetime start;
    private Datetime deadline;
    private Datetime notifyPoint;

    public ToDo() {

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

    public Datetime getStart() {
        return start;
    }

    public void setStart(Datetime start) {
        this.start = start;
    }

    public Datetime getDeadline() {
        return deadline;
    }

    public void setDeadline(Datetime deadline) {
        this.deadline = deadline;
    }

    public Datetime getNotifyPoint() {
        return notifyPoint;
    }

    public void setNotifyPoint(Datetime notifyPoint) {
        this.notifyPoint = notifyPoint;
    }

    public void save(String titel, String description, Datetime start, Datetime deadline, Notifypoint notifypoint) {

    }
}
