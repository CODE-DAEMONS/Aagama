package com.cvsr.admin.aagama.NavigationDrawer;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cvsr.admin.aagama.EventsActivity;
import com.cvsr.admin.aagama.FunZoneActivity;
import com.cvsr.admin.aagama.R;


public class Nav_About extends Fragment implements View.OnClickListener {
    View rootView;
    TextView t1, t2,b1,b2;


    public Nav_About() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.nav_about, container, false);

        initTypeface();
        b1=(TextView)rootView.findViewById(R.id.cont);
        b2=(TextView)rootView.findViewById(R.id.cont1);

              b1.setOnClickListener(this);
        b2.setOnClickListener(this);

        return rootView;

    }

    private void initTypeface() {

        t1=(TextView)rootView.findViewById(R.id.textView1);
        t2=(TextView)rootView.findViewById(R.id.textView2);


        String tp = "About AAGAMA";
        String tp1="Scheduled on : 17th & 18th mar 2017";

        t1.setText(tp);
        t2.setText(tp1);

        Typeface batman=Typeface.createFromAsset(getActivity().getAssets(), "fonts/BATMFA_.TTF");
        Typeface aquafina = Typeface.createFromAsset(getActivity().getAssets(), "fonts/TIMES.TTF");
        t1.setTypeface(batman);
        t2.setTypeface(batman);




    }


    @Override
    public void onClick(View v) {
       if(v==b1){
           Intent in=new Intent(getActivity(),EventsActivity.class);
           startActivity(in);
       }

        if(v==b2){
            Intent in=new Intent(getActivity(), FunZoneActivity.class);
            startActivity(in);
        }



    }
}
