package com.cvsr.admin.aagama.Registration;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cvsr.admin.aagama.Description.FunDescription;
import com.cvsr.admin.aagama.R;
import com.cvsr.admin.aagama.WebPageActivityFUN;
import com.cvsr.admin.aagama.WebPageActivityOPEN;

/**
 * Created by ADMIN on 3/7/2017.
 */

public class FunRegistration extends Activity
{
    Button b1;
    String p,m;
    Intent in;
    String s[]={"Selfie Story","Pie Face Challenge","Plan It","Logo Quiz","Investments","Scary House","Treasure Hunt","Dubsmash","Brain Twister","Minute To WIn It","Crack It","Filmy Quiz","Halloween","Do Or  Die","Ulta Palta"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_options);



        Intent in1 = getIntent();
        p = in1.getStringExtra("event");
    }
    public void rules(View view) {

        in = new Intent(getApplicationContext(),FunDescription.class);
        in.putExtra("event",p);
        startActivity(in);
    }

    public void reg(View view) {
        in = new Intent(getApplicationContext(), WebPageActivityFUN.class);
        in.putExtra("event", p);
        startActivity(in);


    }
    

}
