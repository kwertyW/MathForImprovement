package com.example.mathematicsforimprovement.ui.task_author;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task_authorViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

//    private final FragmentTaskAuthorBinding binding = FragmentTaskAuthorBinding.inflate();
//    ScrollView root = binding.getRoot(); // TODO ЧЁ ТУТ ЗА ХУЙНЯ Я НЕ ЗНАЮ, НО ЭТО НАДО РЕШИТЬ
    public Task_authorViewModel() {
        mText = new MutableLiveData<>();
//        mText.setValue("This is task_author fragment");

    }

    public LiveData<String> getText() {
        return mText;
    }
}