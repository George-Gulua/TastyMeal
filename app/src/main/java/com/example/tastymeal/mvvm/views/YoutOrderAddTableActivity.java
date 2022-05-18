package com.example.tastymeal.mvvm.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tastymeal.R;
import com.example.tastymeal.models.Menu;
import com.example.tastymeal.mvvm.models.Order;
import com.example.tastymeal.mvvm.repositories.MenuRepository;
import com.example.tastymeal.ui.MainActivity;

import java.util.ArrayList;
import java.util.List;

public class YoutOrderAddTableActivity extends AppCompatActivity {
    MenuRepository  menuRepository = new MenuRepository();
    static int Counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yout_order_add_table);

        List<String> menuItemList = new ArrayList<>();

        for (Menu c : menuRepository.getHolder()) {
            if(Order.items_id.contains(c.getId()))
                menuItemList.add(c.getText());
        }


        ListView orders_list = findViewById(R.id.orders_list);
        orders_list.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, menuItemList));
    }
    public void back2(View view) {
        startActivity(new Intent(this, AppActivity.class));
    }

}