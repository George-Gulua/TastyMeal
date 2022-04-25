package com.example.tastymeal.mvvm.models;
import androidx.annotation.NonNull;

import java.util.Objects;

public class User {

    private int id;
    private String login;
    private String nickname;
    private String password;

    public User(int id, @NonNull String login, @NonNull String password, String nickname) {
        this.id = id;
        this.login = login;
        this.password = password;
        if (nickname == null) {
            this.nickname = login + '/' + id;
        } else {
            this.nickname = nickname;
        }
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
