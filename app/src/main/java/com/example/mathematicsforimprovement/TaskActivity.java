package com.example.mathematicsforimprovement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.mathematicsforimprovement.databinding.TaskBinding;


import com.example.mathematicsforimprovement.generateTask.Task;
import com.example.mathematicsforimprovement.generateTask.test;

import java.util.Objects;


public class TaskActivity extends AppCompatActivity {
    private TaskBinding binding;
    private String TaskNumber;
    private Task TaskNow;
    boolean typeButton = false;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = TaskBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        TaskNumber = getIntent().getStringExtra("taskNumber");



        generateTask();


        Button giveUp = (Button) findViewById(R.id.giveUp);
        Button sendAnswer = (Button) findViewById(R.id.sendAnswer);
        sendAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText answer = findViewById(R.id.answer);
                if (!typeButton) {
                    typeButton = true;
                    changeResultType(Objects.equals(answer.getText().toString(), TaskNow.getAnswer()), TaskNow.getAnswer());
                    sendAnswer.setText(R.string.nextTask);
                    giveUp.setVisibility(View.GONE);
                } else {
                    sendAnswer.setText(R.string.Answer);
                    typeButton = false;
                    TextView result = findViewById(R.id.result);
                    result.setText("");
                    answer.setText("");
                    generateTask();
                    giveUp.setVisibility(View.VISIBLE);
                }
            }
        });



        giveUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText answer = findViewById(R.id.answer);
                if (!typeButton) {
                    typeButton = true;
                    changeResultType(Objects.equals(answer.getText().toString(), TaskNow.getAnswer()), TaskNow.getAnswer());
                    sendAnswer.setText(R.string.nextTask);
                    giveUp.setVisibility(View.GONE);
                } else {
                    sendAnswer.setText(R.string.Answer);
                    typeButton = false;
                    TextView result = findViewById(R.id.result);
                    result.setText("");
                    answer.setText("");
                    generateTask();
                    giveUp.setVisibility(View.VISIBLE);
                }
            }
        });




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

    public void onStart() {
        super.onStart();
        changeDialog(true, "Текст");
    }



    test getTaskClass(String TaskNum) {
        return new test();
    }

    void changeDialog(boolean existing, String text) {
        FragmentManager manager = getSupportFragmentManager();
        Bundle variables = new Bundle();
        variables.putString("textDis", text);
        variables.putBoolean("exist", existing);
        Fragment fragment = manager.findFragmentById(R.id.fragment_container_view);
        fragment.setArguments(variables);
        fragment.onStart();

    }


    private void generateTask() {
        test TaskClass = new test();

        Task task = TaskClass.getTask();
        TextView Task = findViewById(R.id.Task);
        Task.setText(task.getTask() + " = " + task.getAnswer());
        TaskNow = task;
    }


    private void changeResultType(boolean equals, String text) {
        TextView result = findViewById(R.id.result);
        if (equals) {
            result.setTextColor(getColor(R.color.green));
            result.setText(R.string.YouSure);
        } else {
            result.setTextColor(getColor(R.color.red));
            result.setText(R.string.YouNotSure);
            result.setText(result.getText() + text);
        }
    }
}
