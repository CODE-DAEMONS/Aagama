package com.cvsr.admin.aagama.Registration;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cvsr.admin.aagama.Description.OpenDescription;
import com.cvsr.admin.aagama.R;
import com.cvsr.admin.aagama.WebPageActivityOPEN;

/**
 * Created by ADMIN on 3/6/2017.
 */

public class OpenRegistration extends Activity {

    String p;
    Intent in;
    String s[] = {"App Challenge", "All Round Quiz", "4-Pics-1-Word", "Minute  To Win It", "Cyber Chase", "Check Your IQ",
            "R.C.Racing", "Junk Yard", "Ram and Rom",
            "Puzzle", "JAM", "Innovatia",
            "Virtual Job Fair",
            "Model Making", "Memory Game", "Poster Presentation", "Sketch Up",
            "Invasion", "Velocity",
            "Minute To Win It", "Second To Say", "Tug Of War",
            "Spell Bee"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_options);


        Intent in1 = getIntent();
        p = in1.getStringExtra("event");


    }

    public void rules(View view) {

        in = new Intent(getApplicationContext(), OpenDescription.class);
        in.putExtra("event", s);
        startActivity(in);
    }

    public void reg(View view) {
        in = new Intent(getApplicationContext(), WebPageActivityOPEN.class);
        in.putExtra("event", p);
        startActivity(in);


    }
}




