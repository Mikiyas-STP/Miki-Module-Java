package sprint2.taskmanagementsystem.main;
import sprint2.taskmanagementsystem.management.TaskManager;
import sprint2.taskmanagementsystem.tasks.Task;
import sprint2.taskmanagementsystem.tasks.TimedTask;
import sprint2.taskmanagementsystem.tasks.PriorityTask;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        TaskManager manager = new TaskManager();
        Task task1 = new Task("Do sprint 1 exercises");
        TimedTask task2 = new TimedTask("Submit sprint2 assignment", LocalDate.now().plusDays(1));
        PriorityTask task3 = new PriorityTask("Fix error in asssignment", "HIGH");

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        //i will complete task 3
        manager.completeTask(3);

        //printing summarise
        Task[] completedTasks = manager.getTasksByStatus(true);
        for(Task task : completedTasks){
            System.out.println("This task is ID: " + task.getId() + " Description: " + task.getDescription() + " Type: " + task.getClass().getSimpleName() + " Status: " + task.getStatus() );
        }
    }
}
