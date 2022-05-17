package com.example.tastymeal.viewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tastymeal.models.Menu;
import com.example.tastymeal.mvvm.repositories.MenuRepository;

import java.util.ArrayList;

public class MenuViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Menu>> currentName;

    public MutableLiveData<ArrayList<Menu>> getCurrentName() {

        if (currentName == null) {
            currentName = new MutableLiveData<ArrayList<Menu>>();
        }
        currentName.setValue(new MenuRepository().getHolder());
        return currentName;
    }
}

