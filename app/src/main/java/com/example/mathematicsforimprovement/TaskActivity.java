package com.example.mathematicsforimprovement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mathematicsforimprovement.databinding.TaskBinding;

public class TaskActivity extends AppCompatActivity {
    private TaskBinding binding;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = TaskBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button Out = findViewById(R.id.Out);
        Out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                // i.putExtra("et", "information to send comeback to first activity");
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}
