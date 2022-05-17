package com.example.tastymeal.viewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tastymeal.models.Orders;
import com.example.tastymeal.mvvm.repositories.OrdersRepository;

import java.util.ArrayList;

public class OrdersViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Orders>> currentName;

    public MutableLiveData<ArrayList<Orders>> getCurrentName() {

        if (currentName == null) {
            currentName = new MutableLiveData<>();
        }
        currentName.setValue(new OrdersRepository().getHolder());
        return currentName;
    }
}

