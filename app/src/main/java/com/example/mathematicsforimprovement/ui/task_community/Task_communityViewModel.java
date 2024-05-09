package com.example.mathematicsforimprovement.ui.task_community;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task_communityViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Task_communityViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is task_community fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}