package com.cvsr.admin.aagama;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);


        final Thread timer=new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(4000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    Intent a=new Intent(getApplicationContext(),NavActivity.class);
                    startActivity(a);
                }
            }

        };
        timer.start();


    }

    public void proceed(View view) {
        Intent i=new Intent(this,NavActivity.class);
        startActivity(i);

    }





}



