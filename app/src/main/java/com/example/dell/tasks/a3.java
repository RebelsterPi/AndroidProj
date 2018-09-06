package com.example.dell.tasks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class a3 extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);
        mRecyclerView= findViewById(R.id.rv3);
        String[] myDataset = new String[5];
        myDataset[0]= "hey";
        myDataset[1]="dude1";
        myDataset[2]="dude2";
        myDataset[3]="dude3";
        myDataset[4]="dude4";

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter=new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}
