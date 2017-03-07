package com.cvsr.admin.aagama.Registration;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.cvsr.admin.aagama.Description.SkillDescription;
import com.cvsr.admin.aagama.Description.TechDescription;
import com.cvsr.admin.aagama.R;

/**
 * Created by ADMIN on 3/6/2017.
 */

public class SkillRegistration extends Activity{
    String s;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_options);



        Intent in1 = getIntent();
        s = in1.getStringExtra("event");


    }
    public void rules(View view) {

        in = new Intent(getApplicationContext(), SkillDescription.class);
        in.putExtra("event", s);
        startActivity(in);
    }
}
