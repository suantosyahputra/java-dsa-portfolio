package dsa.projects.taskscheduler;

public class TaskScheduler {

    private MaxHeap queue;
    private int taskCounter;

    public TaskScheduler() {
        queue = new MaxHeap();
        taskCounter = 1;
    }

    public void addTask(String name, int priority) {

        Task task = new Task(taskCounter++, name, priority);
        queue.insert(task);

        System.out.println("Task added: " + task);
    }

    public void executeNextTask() {

        Task task = queue.extractMax();

        if (task == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Executing task: " + task);
    }

    public void peekNextTask() {

        Task task = queue.peek();

        if (task == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Next task: " + task);
    }

    public void showStats() {

        System.out.println("Tasks remaining: " + queue.size());
    }
}