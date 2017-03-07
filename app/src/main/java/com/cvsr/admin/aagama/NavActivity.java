package com.cvsr.admin.aagama;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.cvsr.admin.aagama.NavigationDrawer.Nav_Contact;
import com.cvsr.admin.aagama.NavigationDrawer.Nav_Gallery;
import com.cvsr.admin.aagama.NavigationDrawer.Nav_About;
import com.cvsr.admin.aagama.NavigationDrawer.Nav_Sponsor;
import com.cvsr.admin.aagama.NavigationDrawer.Nav_Team;

public class NavActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation1);
        //Set the fragment initially
        Nav_About fragment = new Nav_About();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.launch1);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home)
        {
            Intent in = new Intent(this, EventsActivity.class);
            startActivity(in);
        }


        else if (id == R.id.about)
        {
            Nav_About fragment = new Nav_About();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        }

        else if (id == R.id.gallery)
        {
            Nav_Gallery fragment = new Nav_Gallery();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        }

        else if (id == R.id.team)
        {
            Intent i = new Intent(this, Nav_Team.class);
            startActivity(i);
        }



        else if (id == R.id.sponsor)
        {
            Nav_Sponsor fragment = new Nav_Sponsor();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        }

        else if (id == R.id.contact)
        {
            Nav_Contact fragment = new Nav_Contact();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void sub(View view)
    {
        Intent in = new Intent(this, EventsActivity.class);
        startActivity(in);
    }


    public void call1(View view)
    {
        Intent in= new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.aagama2k16.in"));
        startActivity(in);
    }


}
