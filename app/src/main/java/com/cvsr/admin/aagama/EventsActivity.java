package com.cvsr.admin.aagama;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.cvsr.admin.aagama.Events.TechZone;
import com.cvsr.admin.aagama.Events.OpenZone;
import com.cvsr.admin.aagama.Events.SkillZone;

public class EventsActivity extends AppCompatActivity{




    ImageButton cse,ece,eee,it,civ,mec,che,pharm,mba;   //TechZone
    TabLayout tablayout;
    ViewPager viewpager;
    Intent obj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);








        onResume();
        setContentView(R.layout.layout_events1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.launch1);

        viewpager = (ViewPager) findViewById(R.id.viewpager);
        viewpager.setAdapter(new CustomAdapter(getSupportFragmentManager(), getApplicationContext()));


        tablayout = (TabLayout) findViewById(R.id.tablayout);
        tablayout.setupWithViewPager(viewpager);

        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }
        });





    }


    public void cse(View view) {
onResume();
        cse = (ImageButton) findViewById(R.id.imageButton);
        Intent in1 = new Intent(EventsActivity.this, TechZoneCards.class);
        in1.putExtra("name", "cse");
        startActivity(in1);


    }

    public void ece(View view) {
onResume();
        ece = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(EventsActivity.this, TechZoneCards.class);
        in1.putExtra("name", "ece");
        startActivity(in1);
    }


    public void eee(View view) {
onResume();
        eee = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(EventsActivity.this, TechZoneCards.class);
        in1.putExtra("name", "eee");
        startActivity(in1);
    }



    public void it(View view) {
onResume();
        it = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(EventsActivity.this, TechZoneCards.class);
        in1.putExtra("name", "it");
        startActivity(in1);
    }


    public void civ(View view) {
onResume();
        civ = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(EventsActivity.this, TechZoneCards.class);
        in1.putExtra("name", "civ");
        startActivity(in1);
    }


    public void mec(View view) {
onResume();
        mec = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(EventsActivity.this, TechZoneCards.class);
        in1.putExtra("name", "mec");
        startActivity(in1);
    }


    public void che(View view) {
onResume();
        che = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(EventsActivity.this, TechZoneCards.class);
        in1.putExtra("name", "che");
        startActivity(in1);
    }


    public void pharm(View view) {
onResume();
        pharm = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(EventsActivity.this, TechZoneCards.class);
        in1.putExtra("name", "pharm");
        startActivity(in1);
    }


    public void mba(View view) {
onResume();
        mba = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(EventsActivity.this, TechZoneCards.class);
        in1.putExtra("name", "mba");
        startActivity(in1);
    }




    private class CustomAdapter extends FragmentPagerAdapter {

        private String fragments[] = {"Tech Zone","Skill Zone","Open Zone"};

        public CustomAdapter(FragmentManager supportFragmentManager, Context context) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new TechZone();
                case 1:
                    return new SkillZone();
                case 2:
                    return new OpenZone();
                default:
                    return null;
            }

        }

        @Override
        public int getCount() {
            return fragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragments[position];
        }
    }


    public void register(View view) {
        Intent in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/common.html"));
        startActivity(in);

        Toast.makeText(this, "redirected to your web browser",
                Toast.LENGTH_LONG).show();
    }





}
