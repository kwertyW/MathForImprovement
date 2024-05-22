package com.example.mathematicsforimprovement.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mathematicsforimprovement.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link dialogue#newInstance} factory method to
 * create an instance of this fragment.
 */
public class dialogue extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    // TODO: Rename and change types of parameters
    private String Text;

    public dialogue() {
        // Required empty public constructor
    }


    public static dialogue newInstance(String text) {
        dialogue fragment = new dialogue();
        Bundle args = new Bundle();
        args.putString("textDis", text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public void onStart() {
        super.onStart();
        Boolean exist = true;
        if (getArguments() != null) {
            String TextData = getArguments().getString("textDis", "discription is not existing");
            exist = getArguments().getBoolean("exist", false);
            TextView Discription_Dialog = getActivity().findViewById(R.id.Discription_Dialog);
            if (TextData != null) {
                Discription_Dialog.setText(TextData);
            }
        }
        Button btn = getActivity().findViewById(R.id.confirm_button_Dialog);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                Fragment fragmentToRemove = fragmentManager.findFragmentById(R.id.fragment_container_view);
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.remove(fragmentToRemove);
                fragmentTransaction.commit();
            }
        });

        if (!exist) {
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            Fragment fragmentToRemove = fragmentManager.findFragmentById(R.id.fragment_container_view);
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(fragmentToRemove);
            fragmentTransaction.commit();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dialogue, container, false);
    }



}