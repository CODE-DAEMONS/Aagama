package com.cvsr.admin.aagama.Registration;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cvsr.admin.aagama.Description.OpenDescription;
import com.cvsr.admin.aagama.R;

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
//cse
        if (p == s[0] || p == s[1] || p == s[2] || p == s[3] || p == s[4] || p == s[5]) {

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }

    //ece
        if (p==s[6]||p==s[7] ||p==s[8]) {


            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();
        }
    //eee
        if (p == s[9] ||p==s[10]||p==s[11]) {

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }
    //it
        if (p == s[12] ) {

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFe446drSnDTrqW7Mgl8-8JbPK9hS50T7nRwkh5j5zE/viewform?edit_requested=true"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }

    //civil
        if (p == s[13] || p == s[14]||p==s[15]||p==s[16]) {

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }
        //mech

        if (p == s[17] ||p==s[18]) {

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }
//pharm
        if (p == s[19] ||p==s[20]|| p == s[21] ) {

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }
    //mba
        if (p == s[22]) {

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/10nm4NcaghrFuLQu8ssofpy6-hpYNLgO3UQok3owyazs/viewform?edit_requested=true"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }
    }
}




