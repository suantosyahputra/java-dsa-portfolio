package dsa.projects.taskscheduler;

import java.util.ArrayList;

public class TaskScheduler {
    private ArrayList<Task> tasks;

    public TaskScheduler() {
        tasks = new ArrayList<>();
    }

    public void addTask(String name, int priority) {
        tasks.add(new Task(name, priority));
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void sortByPriority() {
        for (int i = 0; i < tasks.size() - 1; i++) {
            for (int j = 0; j < tasks.size() - i - 1; j++) {
                if (tasks.get(j).getPriority() < tasks.get(j + 1).getPriority()) {
                    Task temp = tasks.get(j);
                    tasks.set(j, tasks.get(j + 1));
                    tasks.set(j + 1, temp);
                }
            }
        }
    }

    public void executeTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to execute.");
            return;
        }

        sortByPriority();

        System.out.println("Executing tasks:");
        for (Task task : tasks) {
            System.out.println("Executing: " + task);
        }
    }
}