package com.example.tastymeal.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tastymeal.R;
import com.example.tastymeal.adapters.OrdersAdapter;
import com.example.tastymeal.models.Orders;
import com.example.tastymeal.viewModels.OrdersViewModel;

import java.util.ArrayList;

public class OrdersFragment extends Fragment {

    OrdersAdapter adapter;
    OrdersViewModel ordersViewModel;
    RecyclerView rcv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_orders, container, false);

        ordersViewModel = new ViewModelProvider(this).get(OrdersViewModel.class);
        final Observer<ArrayList<Orders>> nameObserver = new Observer<ArrayList<Orders>>() {
            @Override
            public void onChanged(@Nullable final ArrayList<Orders> orders) {
                adapter = new OrdersAdapter(orders,requireContext());
                rcv.setAdapter(adapter);
            }
        };
        rcv = view.findViewById(R.id.ordersRecycler);

        ordersViewModel.getCurrentName().observe(getViewLifecycleOwner(), nameObserver);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),1);
        rcv.setLayoutManager(gridLayoutManager);

        return view;
    }
}