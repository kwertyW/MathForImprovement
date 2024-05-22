package com.example.mathematicsforimprovement.generateTask;

public class Task {
    String task;
    String answer;
    String hint;

        public Task(String task, String answer) {
            this.task = task;
            this.answer = answer;
        }

        public Task(String task, String answer, String hint) {
            this.task = task;
            this.answer = answer;
            this.hint = hint;
        }

        public String getTask() {
            return this.task;
        }

        public String getAnswer() {
            return this.answer;
        }

        public String getHint() {
            return this.hint;
        }

        public boolean existHint() {
            return this.hint != null;
        }
}
