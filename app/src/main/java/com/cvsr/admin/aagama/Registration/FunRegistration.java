package com.cvsr.admin.aagama.Registration;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cvsr.admin.aagama.Description.FunDescription;
import com.cvsr.admin.aagama.Description.OpenDescription;
import com.cvsr.admin.aagama.R;

/**
 * Created by ADMIN on 3/7/2017.
 */

public class FunRegistration extends Activity
{
    String p;
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

        in = new Intent(getApplicationContext(), FunDescription.class);
        in.putExtra("event", p);
        startActivity(in);
    }


    public void reg(View view) {
//cse
        if(p=="Selfie Story"||p=="Pie Face Challenge"){

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();
//ece
        }
        if(p=="Plan It"||p=="Logo Quiz"||p=="Investments"){

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }
    //civil

        if(p=="Scary House"||p=="Treasure Hunt"||p=="Dubsmash"){

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();


        }

   //mech
        if(p=="Brain Twister"||p=="Minute To WIn It"||p=="Crack It")
        {

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }


    //pharm
          if(p=="Filmy Quiz"||p=="Halloween")
        {

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }

    //chem
        if(p=="Do Or  Die"||p=="Ulta Palta")
        {

            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1XLyU6Ym7AyGVEv6xs0j-KwblrAo7lZdlloeGd2XKIMc/viewform?edit_requested=true"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();

        }



    }

}
