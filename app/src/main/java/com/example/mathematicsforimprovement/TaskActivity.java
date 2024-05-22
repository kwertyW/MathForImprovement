package com.example.mathematicsforimprovement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mathematicsforimprovement.databinding.TaskBinding;


import com.example.mathematicsforimprovement.generateTask.Task;
import com.example.mathematicsforimprovement.generateTask.test;



public class TaskActivity extends AppCompatActivity {
    private TaskBinding binding;
    private String TaskNumber;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = TaskBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        TaskNumber = getIntent().getStringExtra("taskNumber");

        test TaskClass = new test();

        Task task = TaskClass.getTask();
        TextView Task = findViewById(R.id.text);
        Task.setText(task.getTask() + " = " + task.getAnswer());



        Button Out = findViewById(R.id.Out);
        Out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }


    test getTaskClass(String TaskNum) {
        return new test();
    }
}
