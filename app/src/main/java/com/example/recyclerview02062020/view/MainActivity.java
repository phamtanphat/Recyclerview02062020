package com.example.recyclerview02062020.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview02062020.R;
import com.example.recyclerview02062020.adapter.FoodAdapter;
import com.example.recyclerview02062020.model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvFood;
    List<Food> mArrayFoods;
    FoodAdapter mFoodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvFood = findViewById(R.id.recyclerviewFood);
        mArrayFoods = new ArrayList<>();
        Food.mock(mArrayFoods);

        mFoodAdapter = new FoodAdapter(mArrayFoods);
        mRcvFood.setAdapter(mFoodAdapter);
        mRcvFood.setItemViewCacheSize(20);
        mRcvFood.setHasFixedSize(true);
//        mRcvFood.addItemDecoration(
//                new DividerItemDecoration(
//                        this,
//                        DividerItemDecoration.VERTICAL
//                )
//        );
    }
}