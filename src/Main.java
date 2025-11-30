import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MaxHeap heap = new MaxHeap(50); // supports up to 50 tasks

        System.out.println("=== PriorityPlanner ===");

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Highest Priority Task");
            System.out.println("3. Complete Highest Priority Task");
            System.out.println("4. Show All Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter task description: ");
                String desc = input.nextLine();

                System.out.print("Enter priority (1-100): ");
                int p = input.nextInt();

                Task t = new Task(desc, p);
                heap.insert(t);
                System.out.println("Task added!");

            } else if (choice == 2) {
                Task top = heap.peek();
                if (top == null) {
                    System.out.println("No tasks right now.");
                } else {
                    System.out.println("Highest Priority: " + top);
                }

            } else if (choice == 3) {
                Task done = heap.extractMax();
                if (done == null) {
                    System.out.println("No tasks to complete.");
                } else {
                    System.out.println("Completed: " + done);
                }

            } else if (choice == 4) {
                heap.printHeap();

            } else if (choice == 5) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid option.");
            }
        }

        input.close();
    }
}
