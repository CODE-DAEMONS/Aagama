package com.cvsr.admin.aagama;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.laout_home_page);


    }

    public void proceed(View view) {
        Intent i=new Intent(this,NavActivity.class);
        startActivity(i);

    }
}
