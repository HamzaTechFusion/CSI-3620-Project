/** 
    Hamza Siddiqui
    CSI 3620
    This file defines the Task object used in the program. It stores the task’s description and priority
**/

public class Task {
    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "[Task: " + description + " | Priority: " + priority + "]";
    }
}