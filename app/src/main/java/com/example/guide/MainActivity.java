package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.guide.Adapter.StatesAdapter;
import com.example.guide.Model.StatesModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StatesAdapter statesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<StatesModel> statesModelList = new ArrayList<StatesModel>();
        statesModelList.add(new StatesModel("Andhra Pradesh"));
        statesModelList.add(new StatesModel("Arunachal Pradesh"));
        statesModelList.add(new StatesModel("Assam"));
        statesModelList.add(new StatesModel("Bihar"));
        statesModelList.add(new StatesModel("Chhattisgarh"));
        statesModelList.add(new StatesModel("Goa"));
        statesModelList.add(new StatesModel("Gujarat"));
        statesModelList.add(new StatesModel("Haryana"));
        statesModelList.add(new StatesModel("Himachal Pradesh"));
        statesModelList.add(new StatesModel("Jammu and Kashmir"));
        statesModelList.add(new StatesModel("Jharkhand"));
        statesModelList.add(new StatesModel("Karnataka"));
        statesModelList.add(new StatesModel("Kerala"));
        statesModelList.add(new StatesModel("Madhya Pradesh"));
        statesModelList.add(new StatesModel("Maharashtra"));
        statesModelList.add(new StatesModel("Manipur"));
        statesModelList.add(new StatesModel("Meghalaya"));
        statesModelList.add(new StatesModel("Mizoram"));
        statesModelList.add(new StatesModel("Nagaland"));
        statesModelList.add(new StatesModel("Odisha"));
        statesModelList.add(new StatesModel("Punjab"));
        statesModelList.add(new StatesModel("Rajasthan"));
        statesModelList.add(new StatesModel("Sikkim"));
        statesModelList.add(new StatesModel("Tamil Nadu"));
        statesModelList.add(new StatesModel("Telangana"));
        statesModelList.add(new StatesModel("Tripura"));
        statesModelList.add(new StatesModel("Uttar Pradesh"));
        statesModelList.add(new StatesModel("Uttarakhand"));
        statesModelList.add(new StatesModel("West Bengal"));


        recyclerView = findViewById(R.id.mainrv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        statesAdapter = new StatesAdapter(this,statesModelList);
        statesAdapter.passDataToAdapter(statesModelList);
        recyclerView.setAdapter(statesAdapter);


    }
}