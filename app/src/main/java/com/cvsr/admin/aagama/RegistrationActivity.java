package com.cvsr.admin.aagama;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

/**
 * Created by ADMIN on 2/21/2016.
 */
public class RegistrationActivity extends TechZoneCards {
    String s;
    Intent in;

    String cse[]={"Paper Presentation","Poster Presentation","Hunt The Code","Webpage Design","Dumb Charades"};
    String ece[]={"Paper Presentation_1","Poster Presentation_1","Project Presentation_1","Technical Quiz_1","Circuitrix_1"};
    String eee[]={"Paper Presentation_2","Poster Presentation_2","Project Presentation_2","Circuitrix_2","Technical Quiz_2","JAM_2"};
    String it[]={"Paper Presentation_3","Bug The Bug_3","Code Race_3"};
    String civ[]={"Paper Presentation_4","Poster Presentation_4","Project Presentation_4","CAD_4","Model Making_4","Technical Quiz_4","Truss Design_4","Quick Survey_4"};
    String mec[]={"Paper Presentation_5","Velocity_5","Technical Quiz_5"};
    String che[]={"Paper Presentation_6","Poster Presentation_6","Compound Preparation_6","Technical Quiz_6"};
    String pha[]={"Poster Presentation_7","Pharma Quiz_7","JAM_7"};
    String mba[]={"Paper Presentation_8","Poster Presentation_8","Group Discussion_8","Business Plan_8"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_options);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.launch1);


        Intent in1 = getIntent();
        s = in1.getStringExtra("event");


    }

    public void rules(View view) {

        Intent in = new Intent(getApplicationContext(), DescriptionActivity.class);
        in.putExtra("event", s);
        startActivity(in);
    }

    public void reg(View view) {



//COMPUTER SCIENCE AND ENGINEERING
        if(s.equals(cse[0])||s.equals(cse[1])||s.equals(cse[2])||s.equals(cse[3])||s.equals(cse[4])){
            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();
        }


//ELECTRONICS ANDCOMMUNICATION ENGINEERING
        if(s.equals(ece[0])||s.equals(ece[1])||s.equals(ece[2])||s.equals(ece[3])||s.equals(ece[4])){
            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();
        }







//ELECTRICAL AND ELECTRONICS ENGINEERING

        if(s.equals(eee[0])||s.equals(eee[1])||s.equals(eee[2])||s.equals(eee[3])||s.equals(eee[4])||s.equals(eee[5])){
            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFpKuWBfKWUy1eQ-QyidLSvWHWcYIe15_54oFGpHZnA/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();
        }

//INFORMATION TECHNOLOGY

        if(s.equals(it[0])||s.equals(it[1])||s.equals(it[2])){
            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFe446drSnDTrqW7Mgl8-8JbPK9hS50T7nRwkh5j5zE/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();
        }

//CIVIL ENGINERING

        if(s.equals(civ[0])||s.equals(civ[1])||s.equals(civ[2])||s.equals(civ[3])||s.equals(civ[4])||s.equals(civ[5])||s.equals(civ[6])){
            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();
        }

//MECHANICAL ENGINEERING

        if(s.equals(mec[0])||s.equals(mec[1])||s.equals(mec[2])){
            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();
        }



//CHEMICAL ENGINEERING
        if(s.equals(che[0])||s.equals(che[1])||s.equals(che[2])||s.equals(che[3])){
            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1XLyU6Ym7AyGVEv6xs0j-KwblrAo7lZdlloeGd2XKIMc/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();
        }


//PHARMACY DEPARTMENT
        if(s.equals(pha[0])||s.equals(pha[1])||s.equals(pha[2])){
            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();
        }

//MBA DEPARTMENT
        if(s.equals(mba[0])||s.equals(mba[1])||s.equals(mba[2])||s.equals(mba[3])){
            in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/10nm4NcaghrFuLQu8ssofpy6-hpYNLgO3UQok3owyazs/edit?usp=sharing"));
            startActivity(in);

            Toast.makeText(this,"redirected to your web browser",
                    Toast.LENGTH_LONG).show();
        }


    }
}
