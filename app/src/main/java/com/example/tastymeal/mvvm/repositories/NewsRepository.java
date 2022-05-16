package com.example.tastymeal.mvvm.repositories;


import com.example.tastymeal.R;
import com.example.tastymeal.models.News;

import java.util.ArrayList;
import java.util.Collections;

public class NewsRepository {
    ArrayList<News> holder;

    public NewsRepository() {
        holder = new ArrayList<>();

        News n1 = new News(R.drawable.ic_burger, "У нас появился Чизбугер!", "21.02.2022");
        holder.add(n1);

        News n2 = new News(R.drawable.ic_burger, "У нас появился Чизбугер!", "22.02.2022");
        holder.add(n2);

        News n3 = new News(R.drawable.ic_burger, "У нас появился Чизбугер!", "23.03.2022");
        holder.add(n3);

        News n4 = new News(R.drawable.ic_burger, "У нас появился Чизбугер!", "21.04.2022");
        holder.add(n4);
    }

    public ArrayList<News> getHolder() {
        Collections.reverse(holder);
        return holder;
    }
}
