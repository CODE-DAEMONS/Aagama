package com.cvsr.admin.aagama;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by ADMIN on 3/8/2017.
 */

public class WebPageActivityOPEN extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent in;
        String p;

        Intent in1 = getIntent();
        p = in1.getStringExtra("event");

        switch (p){
            case "App Challenge":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "All Round Quiz":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "4-Pics-1-Word":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Minute  To Win It":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Cyber Chase":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Check Your IQ":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "R.C.Racing":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Junk Yard":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Ram and Rom":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1pDiWfLZrNoi23ebZnUC5xh_xInKmfaBpjNHgxJ4Ke6A/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Puzzle":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFpKuWBfKWUy1eQ-QyidLSvWHWcYIe15_54oFGpHZnA/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "JAM":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFpKuWBfKWUy1eQ-QyidLSvWHWcYIe15_54oFGpHZnA/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Innovatia" :
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFpKuWBfKWUy1eQ-QyidLSvWHWcYIe15_54oFGpHZnA/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Virtual Job Fair":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1bFe446drSnDTrqW7Mgl8-8JbPK9hS50T7nRwkh5j5zE/viewform?edit_requested=true"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Model Making":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Memory Game":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Poster Presentation":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Sketch Up":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Invasion":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/18J94lj1cXpxGy2Kc3SG7Pv1pNRUJsGUC0ZixcgDSkoQ/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Velocity":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/18J94lj1cXpxGy2Kc3SG7Pv1pNRUJsGUC0ZixcgDSkoQ/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Minute To Win It":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Second To Say":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Tug Of War":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Spell Bee":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/10nm4NcaghrFuLQu8ssofpy6-hpYNLgO3UQok3owyazs/viewform?edit_requested=true"));
                startActivity(in);

                Toast.makeText(this,"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;




        }

    }
}
