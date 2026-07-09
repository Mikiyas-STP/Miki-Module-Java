class Task{
    private final int id;
    private String description;
    private boolean completed;

    public void setComplete(boolean public isCompleted){
        this.completed = true;
        isCompleted = completed;
    }
    public void complete(){
        if (isCompleted == true){
            final isComplete = true;
        }
    }
    public String getStatus(){
        if(isComplete){
        return "This task is Completed";
    }
        else{
        return "This task is incomplete";
        }
    }
}

