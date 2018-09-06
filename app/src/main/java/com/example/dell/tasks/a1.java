package com.example.dell.tasks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class a1 extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
        mRecyclerView= findViewById(R.id.rv);
String[] myDataset = new String[5];
myDataset[0]= "hi";
myDataset[1]="hr";
mRecyclerView.setHasFixedSize(true);
mLayoutManager=new LinearLayoutManager(this);
mRecyclerView.setLayoutManager(mLayoutManager);
mAdapter=new MyAdapter(myDataset);
mRecyclerView.setAdapter(mAdapter);
    }
}