package com.example.my_restaurant_app.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.my_restaurant_app.R;
import com.example.my_restaurant_app.adapters.FeaturedAdapter;
import com.example.my_restaurant_app.adapters.FeaturedVerAdapter;
import com.example.my_restaurant_app.models.FeaturedModel;
import com.example.my_restaurant_app.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {

    //////////////////Featured Hor RecyclerView
    List<FeaturedModel> featuredModelslist;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    ///////////////////////////Featured Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);


        //////////////////Featured Hor RecyclerView
        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModelslist = new ArrayList<>();

        featuredModelslist.add(new FeaturedModel(R.drawable.fav1,"Featured 1","Description 1 "));
        featuredModelslist.add(new FeaturedModel(R.drawable.fav2,"Featured 2","Description 2 "));
        featuredModelslist.add(new FeaturedModel(R.drawable.fav3,"Featured 3","Description 3 "));

        featuredAdapter  = new FeaturedAdapter(featuredModelslist);
        recyclerView.setAdapter(featuredAdapter);


        //////////////////Featured Ver RecyclerView
        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelList = new ArrayList<>();

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver1,"Featured 1", "Description 1","4.8","10:00 - 8:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver2,"Featured 2", "Description 2","4.7","10:00 - 8:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver3,"Featured 3", "Description 3","4.9","10:00 - 8:00"));

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver1,"Featured 1", "Description 1","4.8","10:00 - 8:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver2,"Featured 2", "Description 2","4.7","10:00 - 8:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver3,"Featured 3", "Description 3","4.9","10:00 - 8:00"));

        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);


        return view;
    }
}