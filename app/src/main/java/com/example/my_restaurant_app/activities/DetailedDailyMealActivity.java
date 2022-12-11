package com.example.my_restaurant_app.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.my_restaurant_app.R;
import com.example.my_restaurant_app.adapters.DetailedDailyAdapter;
import com.example.my_restaurant_app.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_image);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if(type != null && type.equalsIgnoreCase("breakfast")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1,"Breakfast1","Description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2,"Breakfast2","Description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3,"Breakfast3","Description","4.4","40","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("sweets")){
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"sweet1","Description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"sweet2","Description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"sweet3","Description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4,"sweet4","Description","4.4","40","10am to 9pm"));

            dailyAdapter.notifyDataSetChanged();
        }
    }
}