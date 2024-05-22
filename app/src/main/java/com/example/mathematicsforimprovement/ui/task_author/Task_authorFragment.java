package com.example.mathematicsforimprovement.ui.task_author;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mathematicsforimprovement.MainActivity;
import com.example.mathematicsforimprovement.R;
import com.example.mathematicsforimprovement.TaskActivity;
import com.example.mathematicsforimprovement.databinding.FragmentTaskAuthorBinding;
import com.example.mathematicsforimprovement.generateTask.test;

public class Task_authorFragment extends Fragment {

    private FragmentTaskAuthorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Task_authorViewModel homeViewModel =
                new ViewModelProvider(this).get(Task_authorViewModel.class);

        binding = FragmentTaskAuthorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        LinearLayout btn = root.findViewById(R.id.taskZero);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TaskActivity.class);
                intent.putExtra("taskNumber", "0");
                startActivity(intent);
            }
        });

        // final TextView textView = binding.textHome;
        // homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}