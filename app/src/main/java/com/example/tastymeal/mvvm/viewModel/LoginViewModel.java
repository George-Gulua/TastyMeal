package com.example.tastymeal.mvvm.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tastymeal.mvvm.repositories.UserRepository;


public class LoginViewModel extends ViewModel {

    private final UserRepository userRepo = new UserRepository();

    private final MutableLiveData<String> login = new MutableLiveData<>();
    private final MutableLiveData<String> password = new MutableLiveData<>();
    private final MutableLiveData<Boolean> access = new MutableLiveData<>();

    public MutableLiveData<String> getLogin() {
        return login;
    }

    public MutableLiveData<String> getPassword() {
        return password;
    }

    public MutableLiveData<Boolean> getAccess() {
        return access;
    }

    public String getUserNickname() {
        return userRepo.getCurrentUser().getNickname();
    }

    public void authorize (String login, String password) {
        this.access.setValue(userRepo.setCurrentUser(login, password));
    }
}

