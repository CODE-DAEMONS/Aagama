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
import com.cvsr.admin.aagama.R;


public class Nav_About extends Fragment implements View.OnClickListener {
    View rootView;
    TextView t1, t2,t3;


    public Nav_About() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.nav_about, container, false);

        initTypeface();
        TextView b1=(TextView)rootView.findViewById(R.id.cont);

              b1.setOnClickListener(this);

        return rootView;

    }

    private void initTypeface() {

        t1=(TextView)rootView.findViewById(R.id.textView1);
        t2=(TextView)rootView.findViewById(R.id.textView2);
        t3=(TextView)rootView.findViewById(R.id.textView3);

        String tp = "About AAGAMA";
        String tp1="Scheduled on : 17th & 18th mar 2017";
        String t = "To be abreast of recent developments and to provide a common platform to the budding technocrats from all over the country, to have knowledge share and to explore new horizons in the concerned Engineering, Pharamceutical and Management streams, Anurag Group of Institutions is going to conduct AAGAMA 2K17 on 17th and 18th March, 2016.\n" +
                "In the present scenario professional education like engineering is demanding overall development from the students. Student is expected to acquire thorough technical knowledge along with other supportive skills. With this back drop technical papers are invited from all the corners of the country. All the papers will be peer reviewed.\n" +
                "Many events like Tech Quiz, Poster presentation, Project presentation, Robotrix, Circruitrix, Velocity, Invasion, Lazer Trap and many more ";
        t1.setText(tp);
        t2.setText(tp1);
        t3.setText(t);

        Typeface batman=Typeface.createFromAsset(getActivity().getAssets(), "fonts/BATMFA_.TTF");
        Typeface aquafina = Typeface.createFromAsset(getActivity().getAssets(), "fonts/TIMES.TTF");
        t1.setTypeface(batman);
        t2.setTypeface(batman);
        t3.setTypeface(aquafina);



    }


    @Override
    public void onClick(View v) {
        Intent in=new Intent(getActivity(),EventsActivity.class);
        startActivity(in);


    }
}
