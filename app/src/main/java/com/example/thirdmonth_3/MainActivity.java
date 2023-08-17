package com.example.thirdmonth_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TastyAdapter adapter;
    private RecyclerView recyclerView;

    private ArrayList<String>tastyFood = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv_tasty);
        loadData();
        adapter = new TastyAdapter(tastyFood);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        tastyFood.add("O ricu maki");
        tastyFood.add("Pizza four cheese");
        tastyFood.add("Plov");
        tastyFood.add("Manty");
        tastyFood.add("Roll Dragon");
        tastyFood.add("Kazy");
        tastyFood.add("Lagman");
        tastyFood.add("DapanJi");
        tastyFood.add("Oromo");
        tastyFood.add("ChefBurger");
        tastyFood.add("Kebab");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");
        tastyFood.add("Tri Chokolada");

    }

}