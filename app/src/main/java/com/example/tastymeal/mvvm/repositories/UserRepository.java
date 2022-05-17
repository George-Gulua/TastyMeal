package com.example.tastymeal.mvvm.repositories;


import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;

import com.example.tastymeal.R;
import com.example.tastymeal.mvvm.models.User;

import java.util.ArrayList;

public class UserRepository {

    private final ArrayList<User> users = new ArrayList<>();

    private  User currentUser = null;

    public UserRepository () {
        users.add(new User(1, "1", "p", "Marika"));
        users.add(new User(2, "login2", "password2", "Boris"));
        users.add(new User(3, "login3", "password3", "Carl"));
        users.add(new User(4, "login4", "password4", "Dexter"));
        users.add(new User(5, "login5", "password5", "Eugen"));
        users.add(new User(6, "", "", "Ma"));
    }
    public void addUser(@NonNull View itemView) {
        EditText text = (EditText)itemView.findViewById(R.id.editTextPhone);

        String value = text.getText().toString();
        Log.d("D", value);
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public boolean setCurrentUser(String login, String password) {
        for (User user: users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                this.currentUser = user;
                return true;
            }
        }
        this.currentUser = null;
        return false;
    }
}

