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

        in = new Intent(this, SkillDescription.class);
        in.putExtra("event",p);
        startActivity(in);
    }

    public void reg(View view) {

        switch (p)
        {
            case "lazer Trap":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Lan Gaming":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Blank Coding":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Ideation Contest":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Circuitrix":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "DumbShell Electronics":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Fastest Typing First":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFe446drSnDTrqW7Mgl8-8JbPK9hS50T7nRwkh5j5zE/viewform?edit_requested=true"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Words Worth" :
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFe446drSnDTrqW7Mgl8-8JbPK9hS50T7nRwkh5j5zE/viewform?edit_requested=true"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Quick CADD":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Model Making":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/10nm4NcaghrFuLQu8ssofpy6-hpYNLgO3UQok3owyazs/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Cosplay AD":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/10nm4NcaghrFuLQu8ssofpy6-hpYNLgO3UQok3owyazs/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Arm Wrestling":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Treasure Hunt":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

        }
    }
}
