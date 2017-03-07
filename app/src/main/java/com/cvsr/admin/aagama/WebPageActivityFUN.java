package com.cvsr.admin.aagama;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by ADMIN on 3/8/2017.
 */

public class WebPageActivityFUN extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent in;
        String p;

        Intent in1 = getIntent();
        p = in1.getStringExtra("event");

        switch(p)
        {
           //cse
            case "Selfie Story":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Pie Face Challenge":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            //ece
            case "Plan It":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Logo Quiz":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Investments":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1i-N2pK7Twf9G7pvbxinOghhfEM0KaJDIn-DL0U6pM-U/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Scary House":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Treasure Hunt":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Dubsmash":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Brain Twister":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Minute To WIn It":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Crack It":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1blypr3Cx5XPVZQKkfRKbOZaLWPCIGdSO3KwNZYOfKoY/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;
            case "Filmy Quiz":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Halloween":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1Wl88EpVgYthcVF7ZJVi04Y84Oyko7SdrePia1Tuet5I/edit?usp=sharing"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Do Or  Die":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1XLyU6Ym7AyGVEv6xs0j-KwblrAo7lZdlloeGd2XKIMc/viewform?edit_requested=true"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;

            case "Ulta Palta":
                in = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://docs.google.com/forms/d/1XLyU6Ym7AyGVEv6xs0j-KwblrAo7lZdlloeGd2XKIMc/viewform?edit_requested=true"));
                startActivity(in);

                Toast.makeText(getApplicationContext(),"redirected to your web browser",
                        Toast.LENGTH_LONG).show();
                break;


        }

    }
}
