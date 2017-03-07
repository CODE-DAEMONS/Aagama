package com.cvsr.admin.aagama.Registration;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cvsr.admin.aagama.Description.SkillDescription;
import com.cvsr.admin.aagama.R;

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

        //cse
        if (p == s[0]|| p== s[1]){

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

    }

//ece
        if (p == s[2]|| p== s[3]|| p== s[4] || p== s[5]){

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }
//it

        if (p == s[6]|| p== s[7]){

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFe446drSnDTrqW7Mgl8-8JbPK9hS50T7nRwkh5j5zE/viewform?edit_requested=true"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }
//civil
        if (p == s[8]){

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();


        }
//mech
        if (p == s[9]|| p== s[10]){


            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }

//pharm

        if (p == s[11]|| p== s[12]){

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();


        }
}}
