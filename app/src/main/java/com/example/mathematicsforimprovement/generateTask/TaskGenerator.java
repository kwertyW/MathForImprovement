package com.example.mathematicsforimprovement.generateTask;

public interface TaskGenerator {
    public static Task getTask() {
        return new Task("Task", "answer");
    }

    public static String getDiscription(){
        return "Description of the task";
    }

}
