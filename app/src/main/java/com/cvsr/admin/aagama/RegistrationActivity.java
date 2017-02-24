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

        switch (s)
        {

//COMPUTER SCIENCE AND ENGINEERING

            case "Paper Presentation":  in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/cse.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();

                break;

            case "Poster Presentation":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/cse.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Code Quiz":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/cse.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Webpage Design":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/cse.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


//ELECTRONICS ANDCOMMUNICATION ENGINEERING
            case "Paper Presentation_1" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/ece.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Poster Presentation_1":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/ece.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


            case "Project Presentation_1":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/ece.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Technical Quiz_1":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/ece.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Circuitrix_1":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/ece.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;




//ELECTRICAL AND ELECTRONICS ENGINEERING
            case "Paper Presentation_2":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/eee.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


            case "Poster Presentation_2":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/eee.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


            case "Project Presentation_2":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/eee.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


            case "Circuitrix_2":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/eee.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


            case "Technical Quiz_2":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/eee.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


            case "JAM_2":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/eee.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;




//INFORMATION TECHNOLOGY
            case "Paper Presentation_3" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/it.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;



            case "Bug The Bug_3" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/it.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;



            case "Code Race_3" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/it.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;




//CIVIL ENGINERING

            case "Paper Presentation_4" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/civil.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


            case "Poster Presentation_4" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/civil.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Project Presentation_4" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/civil.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "CAD_4" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/civil.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Technical Quiz_4" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/civil.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;






//MECHANICAL ENGINEERING
            case "Paper Presentation_5" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/mech.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Velocity_5" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/mech.html"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Technical Quiz_5" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/mech.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;




//CHEMICAL ENGINEERING
            case "Paper Presentation_6" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/chemical.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Poster Presentation_6" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/chemical.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Compound Preparation_6" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/chemical.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Technical Quiz_6" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/chemical.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;





//PHARMACY DEPARTMENT
            case "Paper Presentation_7" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/pharmacy.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Poster Presentation_7" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/pharmacy.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


            case "Pharma Quiz_7" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/pharmacy.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


            case "Debate_7" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/pharmacy.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;





//MBA DEPARTMENT

            case "Sarva Sresta_8" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/mba.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Koutilya_8" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/mba.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Pragnya_8" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/mba.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Dhraveena_8" :
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/mba.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
//SKILL ZONE

            case "Photo":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/skill.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Short Film":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/skill.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Sketch Up":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/skill.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Show Off":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/skill.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Lan Gaming":
                in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in/skill.html"));
                startActivity(in);


                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;






        }


    }
}
