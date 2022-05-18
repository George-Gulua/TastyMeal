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
import com.example.tastymeal.adapters.MenuAdapter;
import com.example.tastymeal.models.Menu;
import com.example.tastymeal.viewModels.MenuViewModel;

import java.util.ArrayList;

public class MenuFragment extends Fragment {

    MenuAdapter adapter;
    MenuViewModel newsViewModel;
    RecyclerView rcv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        newsViewModel = new ViewModelProvider(this).get(MenuViewModel.class);
        final Observer<ArrayList<Menu>> nameObserver = new Observer<ArrayList<Menu>>() {
            @Override
            public void onChanged(@Nullable final ArrayList<Menu> news) {
                adapter = new MenuAdapter(news,requireContext());
                rcv.setAdapter(adapter);
            }
        };
        rcv = view.findViewById(R.id.menuRecycler);

        newsViewModel.getCurrentName().observe(getViewLifecycleOwner(), nameObserver);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),1);
        rcv.setLayoutManager(gridLayoutManager);
        return view;
    }


}