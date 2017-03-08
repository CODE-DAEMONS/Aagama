package com.cvsr.admin.aagama.Registration;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.cvsr.admin.aagama.Description.TechDescription;
import com.cvsr.admin.aagama.R;
import com.cvsr.admin.aagama.TechZoneCards;

/**
 * Created by ADMIN on 2/21/2016.
 */
public class TechRegistration extends TechZoneCards {
    String s;
    Intent in;

    String cse[]={"Paper Presentation","Poster Presentation","Hunt The Code","Webpage Design","Dumb Charades"};
    String ece[]={"Paper Presentation_1","Poster Presentation_1","Project Presentation_1","Technical Quiz_1"};
    String eee[]={"Paper Presentation_2","Poster Presentation_2","Project Presentation_2","Circuitrix_2","Technical Quiz_2","Tech Hunt_2"};
    String it[]={"Paper Presentation_3","Bug The Bug_3","Code Cracker_3","Technical Quiz_3"};
    String civ[]={"Paper Presentation_4","Project Presentation_4","Technical Quiz_4","Truss Design_4","Quick Survey_4"};
    String mec[]={"Paper Presentation_5"};

    String pha[]={"Poster Presentation_7","Pharma Quiz_7","JAM_7","Anurag Talent Hunt_7"};
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

        Intent in = new Intent(this, TechDescription.class);
        in.putExtra("event", s);
        startActivity(in);
    }

    public void reg(View view) {


        switch (s) {
            case "Paper Presentation":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Poster Presentation":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Hunt The Code":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Webpage Design":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Dumb Charades":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Paper Presentation_1":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Poster Presentation_1":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Project Presentation_1":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Technical Quiz_1":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Paper Presentation_2":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFpKuWBfKWUy1eQ-QyidLSvWHWcYIe15_54oFGpHZnA/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Poster Presentation_2":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFpKuWBfKWUy1eQ-QyidLSvWHWcYIe15_54oFGpHZnA/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Project Presentation_2":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFpKuWBfKWUy1eQ-QyidLSvWHWcYIe15_54oFGpHZnA/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Circuitrix_2":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFpKuWBfKWUy1eQ-QyidLSvWHWcYIe15_54oFGpHZnA/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Technical Quiz_2":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFpKuWBfKWUy1eQ-QyidLSvWHWcYIe15_54oFGpHZnA/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Tech Hunt_2":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFpKuWBfKWUy1eQ-QyidLSvWHWcYIe15_54oFGpHZnA/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Paper Presentation_3":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFe446drSnDTrqW7Mgl8-8JbPK9hS50T7nRwkh5j5zE/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Bug The Bug_3":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFe446drSnDTrqW7Mgl8-8JbPK9hS50T7nRwkh5j5zE/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Code Cracker_3":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFe446drSnDTrqW7Mgl8-8JbPK9hS50T7nRwkh5j5zE/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Technical Quiz_3":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFe446drSnDTrqW7Mgl8-8JbPK9hS50T7nRwkh5j5zE/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Paper Presentation_4":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Project Presentation_4":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Technical Quiz_4":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Truss Design_4":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Quick Survey_4":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Paper Presentation_5":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Poster Presentation_7":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


            case "Pharma Quiz_7":

                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


            case "JAM_7":

                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


            case "Anurag Talent Hunt_7":

                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


            case "Paper Presentation_8":

                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/10nm4NcaghrFuLQu8ssofpy6-hpYNLgO3UQok3owyazs/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Poster Presentation_8":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/10nm4NcaghrFuLQu8ssofpy6-hpYNLgO3UQok3owyazs/edit?usp=sharing"));
                startActivity(in);
                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Group Discussion_8":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/10nm4NcaghrFuLQu8ssofpy6-hpYNLgO3UQok3owyazs/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Business Plan_8":

                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/10nm4NcaghrFuLQu8ssofpy6-hpYNLgO3UQok3owyazs/edit?usp=sharing"));
                startActivity(in);
                Toast.makeText(this, "redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


        }

    }

}
