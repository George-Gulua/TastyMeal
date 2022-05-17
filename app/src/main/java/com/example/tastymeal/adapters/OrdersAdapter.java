package com.example.tastymeal.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tastymeal.R;
import com.example.tastymeal.models.Orders;

import java.util.ArrayList;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.OrdersViewHolder> {
    ArrayList<Orders> data;
    Context context;

    public OrdersAdapter(ArrayList<Orders> data, Context context) {
        this.data = data;
        this.context=context;
    }

    @NonNull
    @Override
    public OrdersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_orders, parent, false);
        return new OrdersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final OrdersViewHolder holder, int position) {
        final Orders temp = data.get(position);

        holder.text.setText(data.get(position).getText());
        holder.date.setText(data.get(position).getDate());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class OrdersViewHolder extends RecyclerView.ViewHolder {
        TextView text, date;
        public OrdersViewHolder(@NonNull View itemView) {
            super(itemView);
            text=(TextView)itemView.findViewById(R.id.orderNumberItem);
            date=(TextView)itemView.findViewById(R.id.orderStatusItem);
        }
    }

}

