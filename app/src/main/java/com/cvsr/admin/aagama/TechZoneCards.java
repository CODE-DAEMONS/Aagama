package com.cvsr.admin.aagama;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.cvsr.admin.aagama.cards.CardAdapter;
import com.cvsr.admin.aagama.cards.CardAdapter_1;
import com.cvsr.admin.aagama.cards.CardAdapter_2;
import com.cvsr.admin.aagama.cards.CardAdapter_3;
import com.cvsr.admin.aagama.cards.CardAdapter_4;
import com.cvsr.admin.aagama.cards.CardAdapter_5;
import com.cvsr.admin.aagama.cards.CardAdapter_6;
import com.cvsr.admin.aagama.cards.CardAdapter_7;
import com.cvsr.admin.aagama.cards.CardAdapter_8;

public class TechZoneCards extends EventsActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;
    String s;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.recycler_view_card_list);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.launch1);



        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        Intent in = getIntent();
        String i = in.getStringExtra("name");
        if (i != null) {
            switch (i) {
                case "cse":
                    mAdapter = new CardAdapter();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "ece":
                    mAdapter = new CardAdapter_1();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "eee":
                    mAdapter = new CardAdapter_2();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "it":
                    mAdapter = new CardAdapter_3();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "civ":
                    mAdapter = new CardAdapter_4();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "mec":
                    mAdapter = new CardAdapter_5();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
               /* case "che":
                    mAdapter = new CardAdapter_6();
                    mRecyclerView.setAdapter(mAdapter);
                    break;*/
                case "pharm":
                    mAdapter = new CardAdapter_7();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "mba":
                    mAdapter = new CardAdapter_8();
                    mRecyclerView.setAdapter(mAdapter);
                    break;


            }


        }
    }



}










