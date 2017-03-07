package com.cvsr.admin.aagama.Registration;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cvsr.admin.aagama.Description.SkillDescription;
import com.cvsr.admin.aagama.R;
import com.cvsr.admin.aagama.WebPageActivityFUN;
import com.cvsr.admin.aagama.WebPageActivitySKILL;

/**
 * Created by ADMIN on 3/6/2017.
 */

public class SkillRegistration extends Activity {
    String p;
    Intent in;
    String s[] = {"lazer Trap", "Lan Gaming",
            "Blank Coding","Ideation Contest","Circuitrix", "DumbShell Electronics",
            "Fastest Typing First", "Words Worth",
            "Quick CADD",
            "Model Making","Cosplay AD",
            "Arm Wrestling","Treasure Hunt",
             };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_options);


        Intent in1 = getIntent();
        p = in1.getStringExtra("event");


    }

    public void rules(View view) {

        in = new Intent(getApplicationContext(), SkillDescription.class);
        in.putExtra("event", s);
        startActivity(in);
    }

    public void reg(View view) {

        in = new Intent(getApplicationContext(), WebPageActivitySKILL.class);
        in.putExtra("event", p);
        startActivity(in);
    }
}
