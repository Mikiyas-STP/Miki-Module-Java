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
    public void complete(){
        if(completed){
            System.out.println("Task" + id + "is completed.");
            return;
        }
        completed = true;
        System.out.println("Task " + id + " is completed successfully");
    }

    public String getStatus(){
        if(completed){
            return "completed";
        }
        else{
            return "Not completed";
        }

    }

    public int getId(){
        return id;
    }
    public String getDescription(){
       return description;
    }
    public void setDescription(String description){
        if(description == null || description.isBlank()){
            System.out.println("Description cannot be empty");
            return;
        }
        this.description = description;
    }

    public boolean isCompleted(){
        return completed;
    }

}
