package com.example.tastymeal.mvvm.repositories;


import com.example.tastymeal.R;
import com.example.tastymeal.models.Orders;

import java.util.ArrayList;
import java.util.Collections;

public class OrdersRepository {
    ArrayList<Orders> holder;

    public OrdersRepository() {
        holder = new ArrayList<>();

        Orders n1 = new Orders( "Заказ №00000001", "Успешно завершен");
        holder.add(n1);

        Orders n2 = new Orders( "Заказ №00000001", "Успешно завершен");
        holder.add(n2);

        Orders n3 = new Orders( "Заказ №00000001", "Успешно завершен");
        holder.add(n3);

        Orders n4 = new Orders( "Заказ №00000001", "Успешно завершен");
        holder.add(n4);

        Orders n5 = new Orders( "Заказ №00000001", "Успешно завершен");
        holder.add(n5);

        Orders n6 = new Orders( "Заказ №00000001", "Успешно завершен");
        holder.add(n6);

        Orders n7 = new Orders( "Заказ №00000001", "Успешно завершен");
        holder.add(n7);

        Orders n8 = new Orders( "Заказ №00000001", "Успешно завершен");
        holder.add(n8);

        Orders n9 = new Orders( "Заказ №00000001", "Успешно завершен");
        holder.add(n9);
    }

    public ArrayList<Orders> getHolder() {
        Collections.reverse(holder);
        return holder;
    }
}
