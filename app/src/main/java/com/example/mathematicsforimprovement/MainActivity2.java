package com.example.mathematicsforimprovement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mathematicsforimprovement.databinding.ActivityMainBinding;
import com.example.mathematicsforimprovement.databinding.TestBinding;

public class MainActivity2 extends AppCompatActivity {
    private TestBinding binding;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = TestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button Out = findViewById(R.id.Out);
        Out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
