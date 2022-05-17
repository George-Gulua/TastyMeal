package com.example.tastymeal.mvvm.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tastymeal.mvvm.repositories.UserRepository;

public class CreateViewModel extends ViewModel {

    private final UserRepository userRepo = new UserRepository();

    private final MutableLiveData<String> name = new MutableLiveData<>();
    private final MutableLiveData<String> login = new MutableLiveData<>();
    private final MutableLiveData<String> password = new MutableLiveData<>();
    private final MutableLiveData<Boolean> haveAccount = new MutableLiveData<>();

    private final MutableLiveData<Boolean> access = new MutableLiveData<>();
    public void authorize (String login, String password) {
        this.access.setValue(userRepo.setCurrentUser(login, password));

    }
    public MutableLiveData<Boolean> getAccess() {
        return access;
    }

    public UserRepository getUserRepo() { return userRepo; }

    public MutableLiveData<String> getName() { return name; }

    public MutableLiveData<String> getLogin() { return login; }

    public MutableLiveData<String> getPassword() { return password; }

    public MutableLiveData<Boolean> getHaveAccount() { return haveAccount; }

    public String getUserNickname() {
        return userRepo.getCurrentUser().getNickname();
    }

    public void creationAccount (String name, String login, String password) {
        this.haveAccount.setValue(userRepo.haveUser(name, login, password));
    }

    public void addUser() {
        String nameR = name.toString();
        String loginR = name.toString();
        String passwordR = name.toString();
        userRepo.addInRepUser(nameR, loginR, passwordR);
    }

    public String getNewCreateUserNickname() { return userRepo.getNewUser().getNickname(); }
    public String getNewCreateUserLogin() { return userRepo.getNewUser().getLogin(); }
}


