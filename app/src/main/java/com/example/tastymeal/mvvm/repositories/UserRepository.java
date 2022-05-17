package com.example.tastymeal.mvvm.repositories;

import com.example.tastymeal.mvvm.models.User;

import java.util.ArrayList;

public class UserRepository {

    private final ArrayList<User> users = new ArrayList<>();

    private User currentUser = null;

    public UserRepository() {
        users.add(new User(1, "1", "p", "Albert"));
        users.add(new User(2, "89999999999", "password2", "Boris"));
        users.add(new User(3, "login3", "password3", "Carl"));
        users.add(new User(4, "login4", "password4", "Dexter"));
        users.add(new User(5, "login5", "password5", "Eugen"));
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public User getNewUser() {
        User lastUser = users.get(users.size()-1);
        return lastUser;
    }

    public boolean setCurrentUser(String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                this.currentUser = user;
                return true;
            }
        }
        this.currentUser = null;
        return false;
    }

    public boolean haveUser(String nickname, String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) || user.getPassword().equals(password) || user.getNickname().equals(nickname)) {
                return true;
            }
        }
        addInRepUser(nickname, login, password);
        return false;
    }
    public void addInRepUser(String nickname, String login, String password) {
        int id = users.size() + 1;
        User newUser = new User(id, login, password, nickname);
        users.add(newUser);
        this.currentUser = newUser;
    }
}

