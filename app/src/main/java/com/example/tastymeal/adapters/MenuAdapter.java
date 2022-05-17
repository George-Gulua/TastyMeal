package com.example.tastymeal.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tastymeal.R;
import com.example.tastymeal.models.Menu;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    ArrayList<Menu> data;
    Context context;

    public MenuAdapter(ArrayList<Menu> data, Context context) {
        this.data = data;
        this.context=context;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_menu, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MenuViewHolder holder, int position) {
        final Menu temp = data.get(position);

        holder.text.setText(data.get(position).getText());
        holder.date.setText(data.get(position).getDate());
        holder.img.setImageResource(data.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class MenuViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView text, date;
        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.imageMenuItem);
            text=(TextView)itemView.findViewById(R.id.textNameMenuItem);
            date=(TextView)itemView.findViewById(R.id.addMenuButton);
            date.setText("123");
        }
    }

}

