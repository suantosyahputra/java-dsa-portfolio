package dsa.projects.taskscheduler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("===== TASK SCHEDULER =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Next Task");
            System.out.println("3. Execute Next Task");
            System.out.println("4. Show Stats");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Task name: ");
                    String name = scanner.nextLine();

                    System.out.print("Priority (1-10): ");
                    int priority = scanner.nextInt();

                    scheduler.addTask(name, priority);
                    break;

                case 2:
                    scheduler.peekNextTask();
                    break;

                case 3:
                    scheduler.executeNextTask();
                    break;

                case 4:
                    scheduler.showStats();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting scheduler...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}