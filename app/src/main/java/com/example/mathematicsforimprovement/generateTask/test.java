package com.example.mathematicsforimprovement.generateTask;

import android.util.Log;

import java.util.Objects;
import java.util.Random;



public class test implements TaskGenerator{
    static Random random = new Random();
    static String[] mask = {"+", "-"};

    public static Task getTask(){
        String task = generateTask();
        return new Task(task, Integer.toString(getAnswer(task)));
    }

    private static String generateTask() {
        int countNumbers = randomNum(2, 5);
        String primer = "";
        for (int i = 0; i < countNumbers; i++) {
            int a = -1;
            if (i != 0){
                a = randomNum(0, 2);
                primer += mask[a];
                primer += " ";
            }
            int rand = 1;
            if (a == 2){
                rand = randomNum(1, 10);
            } else {
                rand = randomNum(0, 25);
            }
            primer += Integer.toString(rand);
            primer += " ";

            }
        return primer;
    }


    private static int getAnswer(String task) {
        String[] taskArr = task.split(" ");
        
        int answer = 0;
        boolean mode = true;
        for (int i = 0; i < taskArr.length; i++) {
            if (Objects.equals(taskArr[i], "+")) {
                mode = true;
                continue;
            }
            if (Objects.equals(taskArr[i], "-")) {
                mode = false;
                continue;
            }
            else {
                if (mode) {
                    answer += Integer.parseInt(taskArr[i]);
                } else {
                    answer -= Integer.parseInt(taskArr[i]);
                }
            }
        }
        return answer;
    }


    private static int randomNum(int x, int y) {
        int randomNumber = random.nextInt(y - x) + x;

        return randomNumber;
    }


}



/*
    + getTask дожен выдовать задание
    + getTopic описани
 */