package dsa.projects.taskscheduler;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask("Write report", 2);
        scheduler.addTask("Fix bug", 5);
        scheduler.addTask("Reply to email", 1);
        scheduler.addTask("Prepare presentation", 4);

        System.out.println("Tasks before sorting:");
        scheduler.showTasks();

        System.out.println();
        scheduler.sortByPriority();

        System.out.println("Tasks after sorting by priority:");
        scheduler.showTasks();

        System.out.println();
        scheduler.executeTasks();
    }
}