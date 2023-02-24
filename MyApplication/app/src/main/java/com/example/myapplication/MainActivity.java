package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ItemModel> todoItemList;
    private RecyclerView itemsRv ;
    private ItemAdapter adapter;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemsRv = findViewById(R.id.recyclerView);
        setContentView(R.layout.activity_main);
        todoItemList = new ArrayList<>();
        floatingActionButton.findViewById(R.id.floatingActionButton);


         setItems();
        adapter = new ItemAdapter(todoItemList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        itemsRv.setLayoutManager(layoutManager);
        itemsRv.setItemAnimator(new DefaultItemAnimator());
        itemsRv.setAdapter(adapter);

    }

    private void  setItems(){
        todoItemList.add(new ItemModel("First to do","Clean the dishes and clean dog"));
    }

}