package com.example.myapplication;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.myViewHolder> {
    private ArrayList<ItemModel>  items;
    public ItemAdapter(ArrayList<ItemModel> item) {
        this.items = item;

    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        private TextView titleTV, descriptionTv;
        private Button deleteButton, updateButton;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTV.findViewById(R.id.TitleView2);
            descriptionTv.findViewById(R.id.DescriptionTv);
            deleteButton.findViewById(R.id.deleteButton);
            updateButton.findViewById(R.id.updateButton);
        }

    }

    @NonNull
    @Override
    public ItemAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_module, parent, false);
        return new myViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.myViewHolder holder, int position) {
    String title = items.get(holder.getAdapterPosition()).getTitle();
    holder.titleTV.setText(title);
    String description = items.get(holder.getAdapterPosition()).getDescription();
    holder.descriptionTv.setText(description);

    holder.deleteButton.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View view){
            Log.d("","Delete");
        }
    });

    holder.updateButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d("","Update");
        }
    });

    }

    @Override
    public int getItemCount() {
        return 0;
    }



}
