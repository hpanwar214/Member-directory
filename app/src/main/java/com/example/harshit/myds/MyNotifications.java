package com.example.harshit.myds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;


import java.util.ArrayList;
import com.example.harshit.myds.recycle_adapter.RecycleViewAdp;

public class MyNotifications extends AppCompatActivity {
    public ArrayList<String> Nofn;
    public RecycleViewAdp adp;
    public RecyclerView reclView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_notifications);
        reclView = (RecyclerView) findViewById(R.id.recView);
        reclView.setLayoutManager(new LinearLayoutManager(this,LinearLayout.VERTICAL,false));
        reclView.addItemDecoration(new DividerItemDecoration(this,LinearLayout.VERTICAL));
        Nofn=new ArrayList<>();
        Nofn.add("Virat Kohli");
        Nofn.add("Captain");
        Nofn.add("M.S.Dhoni");
        Nofn.add("Keeper");
        Nofn.add("Rohit Sharma");
        Nofn.add("Opener");
        Nofn.add("Jasprit Bumrah");
        Nofn.add("Bowler");
        adp=new RecycleViewAdp(this,Nofn);
        reclView.setAdapter(adp);


    }


}
