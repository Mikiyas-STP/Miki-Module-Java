package sprint2.taskmanagementsystem.tasks;

import java.time.LocalDate;

public class TimedTask extends Task {

    private LocalDate deadline;
    public TimedTask(String description , LocalDate deadline){
        super(description);
        this.deadline = deadline;
    }

}
