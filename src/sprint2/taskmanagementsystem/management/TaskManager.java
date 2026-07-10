package sprint2.taskmanagementsystem.management;
import sprint2.taskmanagementsystem.tasks.Task
public class TaskManager {
    private final Task[] tasks;
    private int taskCount;

    public TaskManager(){
        tasks = new Task[10];
        taskCount = 0;
    }

    public void addTask(Task task){
        if(taskCount >= tasks.length){
            System.out.println("Task limit reached");
            return;
        }
        tasks[taskCount] = task;
        taskCount++;
    }

}
