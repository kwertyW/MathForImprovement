package com.example.mathematicsforimprovement.ui.bookmarks;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BookmarksViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BookmarksViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Bookmarks fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}