package com.example.tastymeal.mvvm.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tastymeal.R;
import com.example.tastymeal.fragments.AboutOrderFragment;
import com.example.tastymeal.fragments.MenuFragment;
import com.example.tastymeal.fragments.MainFragment;
import com.example.tastymeal.fragments.OrdersFragment;
import com.example.tastymeal.fragments.ProfileFragment;
import com.example.tastymeal.fragments.ReserveFragment;
import com.example.tastymeal.models.Menu;
import com.example.tastymeal.mvvm.models.Order;
import com.example.tastymeal.mvvm.repositories.MenuRepository;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class AppActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    MainFragment mainFragment = new MainFragment();
    MenuFragment menuFragment = new MenuFragment();
    OrdersFragment ordersFragment = new OrdersFragment();
    ReserveFragment reserveFragment = new ReserveFragment();
    ProfileFragment profileFragment = new ProfileFragment();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.body_container, new MainFragment()).commit();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.page_main:
                    selectedFragment = mainFragment;
                    break;
                case R.id.page_menu:
                    selectedFragment = menuFragment;
                    break;
                case R.id.page_orders:
                    selectedFragment = ordersFragment;
                    break;
                case R.id.page_reserve:
                    selectedFragment = reserveFragment;
                    break;
                case R.id.page_profile:
                    selectedFragment = profileFragment;
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.body_container, selectedFragment).commit();
            return true;
        });
    }
    public void basket(View view) {
        startActivity(new Intent(this, YoutOrderAddTableActivity.class));
    }
    public void orderBack(View view) {
        startActivity(new Intent(this, AppActivity.class));
    }

    public void addAboutOrder(View view) {
        startActivity(new Intent(this, AppActivity.class));
    }

    public void logout(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void goReserve(View view) {
        startActivity(new Intent(this, AppActivity.class));
    }

    public void goTable(View view) {
        setContentView(R.layout.fragment_table);
    }

    public void timeClick(View view) {

    }

    public void timeSave(View view) {
        startActivity(new Intent(this, AppActivity.class));
    }

    public void back2(View view) {
        startActivity(new Intent(this, AppActivity.class));
    }

    public void openAboutOrder(View view) {
        setContentView(R.layout.fragment_about_order);
    }
    ArrayList<com.example.tastymeal.models.Menu> holder;


    public void addToCart(View view) {

        int item_id = getIntent().getIntExtra("id",0);
        Order.items_id.add(item_id);
        Toast.makeText(this,"Добавлено", Toast.LENGTH_LONG).show();
    }
}