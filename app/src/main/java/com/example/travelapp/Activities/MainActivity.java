package com.example.travelapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.travelapp.Adapters.CategoryAdapter;
import com.example.travelapp.Adapters.PopularAdapter;
import com.example.travelapp.Domains.CategoryDomain;
import com.example.travelapp.Domains.PopularDomain;
import com.example.travelapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular, adapterCategory;
    private RecyclerView recyclerViewPopular, recyclerViewCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();

    }

    private void initRecyclerView() {

        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("Mar caible,avendia lago", "Miami Beach", "This 2 bed/1 bath home boast an enormous," +
                "open living plan,accented by striking " +
                "architectural feature and high end finishes." +
                "embrace the outdoors,crowned by stunnning " +
                "coffered ceilings", 2, true, 4.8, "pic1", true, 2300));
        items.add(new PopularDomain("Passo Rolle", "Hawai Beacg", "This 2 bed/1 bath home boast an enormous, " +
                " open living plan,accented by striking " +
                " architectural feature and high end finishes. " +
                " embrace the outdoors,crowned by stunnning " +
                " coffered ceilings ", 1, true, 4.2, "pic2", false, 2500));
        items.add(new PopularDomain("Mar caible,avendia lago", "Miami Beach", "This 2 bed/1 bath home boast an enormous " +
                " open living plan,accented by striking " +
                " architectural feature and high end finishes. " +
                " embrace the outdoors,crowned by stunnning " +
                " coffered ceilings ", 3, true, 5, "pic3", true, 10000));

        recyclerViewPopular = findViewById(R.id.view_popular);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapterPopular=new PopularAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);




        ArrayList<CategoryDomain> catsList=new ArrayList<>();
        catsList.add(new CategoryDomain("Beaches","cat1"));
        catsList.add(new CategoryDomain("Camps","cat2"));
        catsList.add(new CategoryDomain("Forest","cat3"));
        catsList.add(new CategoryDomain("Dessert","cat4"));
        catsList.add(new CategoryDomain("Mountain","cat5"));

        recyclerViewCategory=findViewById(R.id.view_category);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterCategory= new CategoryAdapter(catsList);
        recyclerViewCategory.setAdapter(adapterCategory);

    }
}
