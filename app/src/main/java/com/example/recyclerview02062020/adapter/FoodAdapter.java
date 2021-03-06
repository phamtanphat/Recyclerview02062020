package com.example.recyclerview02062020.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview02062020.R;
import com.example.recyclerview02062020.interfaces.OnItemClickListener;
import com.example.recyclerview02062020.model.Food;

import java.util.ArrayList;
import java.util.List;

public  class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder>{

    private List<Food> mFoodList;
    private OnItemClickListener mListener;

    //constructor
    public FoodAdapter(List<Food> arrayFoods){
        mFoodList = arrayFoods;
    }
    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_food, parent, false);
        return new FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {
        // Lay ra du lieu cua dong hien tai
        Food food = mFoodList.get(position);
        holder.img.setImageResource(food.getImage());
        holder.tvName.setText(food.getName());
        holder.tvDescribe.setText(food.getDescribe());
        holder.tvPrice.setText(food.getPrice());
    }

    @Override
    public int getItemCount() {
        return mFoodList.size();
    }

    class FoodHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView tvName,tvPrice,tvDescribe;
        public FoodHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageview);
            tvName = itemView.findViewById(R.id.textviewName);
            tvPrice = itemView.findViewById(R.id.textviewPrice);
            tvDescribe = itemView.findViewById(R.id.textviewDescribe);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   mListener.itemListener(getAdapterPosition());
                }
            });
        }
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        this.mListener = listener;
    }

    public void setRemoveData(int position){
        mFoodList.remove(position);
        notifyDataSetChanged();
    }
}
