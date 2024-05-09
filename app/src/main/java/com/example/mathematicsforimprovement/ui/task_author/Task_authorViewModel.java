package com.example.mathematicsforimprovement.ui.task_author;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mathematicsforimprovement.MainActivity;
import com.example.mathematicsforimprovement.MainActivity2;
import com.example.mathematicsforimprovement.R;
import com.example.mathematicsforimprovement.databinding.FragmentTaskAuthorBinding;

public class Task_authorViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    private FragmentTaskAuthorBinding binding;
    private ScrollView root = binding.getRoot();
    public Task_authorViewModel() {
//        mText = new MutableLiveData<>();
//        mText.setValue("This is task_author fragment");
        LinearLayout button = root.findViewById(R.id.task0);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActi();
            }
        });

    }

    public LiveData<String> getText() {
        return mText;
    }
}