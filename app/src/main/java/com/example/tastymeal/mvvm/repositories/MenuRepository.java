package com.example.tastymeal.mvvm.repositories;


import com.example.tastymeal.R;
import com.example.tastymeal.models.Menu;

import java.util.ArrayList;
import java.util.Collections;

public class MenuRepository {
    ArrayList<Menu> holder;

    public MenuRepository() {
        holder = new ArrayList<>();

        Menu n1 = new Menu(0, R.drawable.ic_burger, "Чизбугер\n500руб", "500р");
        holder.add(n1);

        Menu n2 = new Menu(1,R.drawable.ic_burger, "Чизбургер!", "500р");
        holder.add(n2);

        Menu n3 = new Menu(2,R.drawable.ic_burger, "Чизбугер!", "500р");
        holder.add(n3);

        Menu n4 = new Menu(3,R.drawable.ic_burger, "Чизбугер!", "500р");
        holder.add(n4);
    }

    public ArrayList<Menu> getHolder() {
        Collections.reverse(holder);
        return holder;
    }
}
