package com.example.recyclerview02062020.view;

import androidx.appcompat.app.AppCompatActivity;
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

        mArrayFoods.add(new Food(R.drawable.buncha ,"Bún chả","Bún chả hà nội ngon số một khu vực Hà Nội","45000"));
        mArrayFoods.add(new Food(R.drawable.goicuon ,"Gỏi cuốn","Gỏi cuốn tôm thịt","30000"));
        mArrayFoods.add(new Food(R.drawable.khaivi ,"Khai vị","Các món khai vị được dùng trong bữa tiệc","130000"));
        mArrayFoods.add(new Food(R.drawable.tomchien ,"Tôm chiên","Tôm chiên giòn","50000"));
        mArrayFoods.add(new Food(R.drawable.buncha ,"Tôm hùm","Tôm hùm tươi sống","150000"));
    }
}