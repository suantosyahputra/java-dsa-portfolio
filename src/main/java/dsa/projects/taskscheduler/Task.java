package dsa.projects.taskscheduler;

public class Task {

    private int id;
    private String name;
    private int priority;

    public Task(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + name + " (priority: " + priority + ")";
    }
}