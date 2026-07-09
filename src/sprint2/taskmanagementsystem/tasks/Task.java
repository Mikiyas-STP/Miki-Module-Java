package sprint2.taskmanagementsystem.tasks;

public class Task {
    private final int id;
    private String description;
    private boolean completed;

    private static int nextId = 1;

    public Task(String description){
        this.id = nextId;
        nextId++;
        this.description = description;
        this.completed = false;
    }
}
