package com.cvsr.admin.aagama.Events;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cvsr.admin.aagama.R;
import com.cvsr.admin.aagama.Registration.FunRegistration;
import com.cvsr.admin.aagama.Registration.OpenRegistration;

/**
 * Created by ADMIN on 2/3/2016.
 */
public class FunZone extends Fragment implements View.OnClickListener{
    View v;
    LinearLayout ll1,ll2,ll3,ll4,ll5,ll6,ll7,ll8,ll9,ll10,ll11,ll12,ll13,ll14,ll15;
    ImageView m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15;
    Intent obj;
    String s[]={"Selfie Story","Pie Face Challenge","Plan It","Logo Quiz","Investments","Scary House","Treasure Hunt","Dubsmash","Brain Twister","Minute To WIn It","Crack It","Filmy Quiz","Halloween","Do Or  Die","Ulta Palta"};




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fun_zone,container,false);

        m1=(ImageView) v.findViewById(R.id.selfie);
        m2=(ImageView) v.findViewById(R.id.pie);
        m3=(ImageView) v.findViewById(R.id.plan);
        m4=(ImageView) v.findViewById(R.id.logo);
        m5=(ImageView) v.findViewById(R.id.invest);
        m6=(ImageView) v.findViewById(R.id.scary);
        m7=(ImageView) v.findViewById(R.id.treasure);
        m8=(ImageView) v.findViewById(R.id.dub);
        m9=(ImageView) v.findViewById(R.id.brain);
        m10=(ImageView) v.findViewById(R.id.minute);
        m11=(ImageView) v.findViewById(R.id.crack);
        m12=(ImageView) v.findViewById(R.id.film);
        m13=(ImageView) v.findViewById(R.id.hallo);
        m14=(ImageView) v.findViewById(R.id.hang);
        m15=(ImageView) v.findViewById(R.id.ulta);




        m1.setImageResource(R.drawable.selfie);
        m2.setImageResource(R.drawable.face);
        m3.setImageResource(R.drawable.plan);
        m4.setImageResource(R.drawable.quiz);
        m5.setImageResource(R.drawable.invest);
        m6.setImageResource(R.drawable.scary);
        m7.setImageResource(R.drawable.treasure);
        m8.setImageResource(R.drawable.dubsmash);
        m9.setImageResource(R.drawable.brain);
        m10.setImageResource(R.drawable.minute);
        m11.setImageResource(R.drawable.crack);
        m12.setImageResource(R.drawable.film);
        m13.setImageResource(R.drawable.halloween);
        m14.setImageResource(R.drawable.hangman);
        m15.setImageResource(R.drawable.ulta);

        ll1=(LinearLayout)v.findViewById(R.id.l1);
        ll2=(LinearLayout)v.findViewById(R.id.l2);
        ll3=(LinearLayout)v.findViewById(R.id.l3);
        ll4=(LinearLayout)v.findViewById(R.id.l4);
        ll5=(LinearLayout)v.findViewById(R.id.l5);
        ll6=(LinearLayout)v.findViewById(R.id.l6);
        ll7=(LinearLayout)v.findViewById(R.id.l7);
        ll8=(LinearLayout)v.findViewById(R.id.l8);
        ll9=(LinearLayout)v.findViewById(R.id.l9);
        ll10=(LinearLayout)v.findViewById(R.id.l10);
        ll11=(LinearLayout)v.findViewById(R.id.l11);
        ll12=(LinearLayout)v.findViewById(R.id.l12);
        ll13=(LinearLayout)v.findViewById(R.id.l13);
        ll14=(LinearLayout)v.findViewById(R.id.l14);
        ll15=(LinearLayout)v.findViewById(R.id.l15);

        ll1.setOnClickListener(this);
        ll2.setOnClickListener(this);
        ll3.setOnClickListener(this);
        ll4.setOnClickListener(this);
        ll5.setOnClickListener(this);
        ll6.setOnClickListener(this);
        ll7.setOnClickListener(this);
        ll8.setOnClickListener(this);
        ll9.setOnClickListener(this);
        ll10.setOnClickListener(this);
        ll11.setOnClickListener(this);
        ll12.setOnClickListener(this);
        ll13.setOnClickListener(this);
        ll14.setOnClickListener(this);
        ll15.setOnClickListener(this);




        return v;
    }

    @Override
    public void onClick(View v) {

        if(v==ll1){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[0]);
            startActivity(obj);

        }
        if(v==ll2){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[1]);
            startActivity(obj);

        }
        if(v==ll3){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[2]);
            startActivity(obj);

        }
        if(v==ll4){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[3]);
            startActivity(obj);

        }
        if(v==ll5){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[4]);
            startActivity(obj);

        }
        if(v==ll6){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[5]);
            startActivity(obj);

        }
        if(v==ll7){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[6]);
            startActivity(obj);

        }
        if(v==ll8){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[7]);
            startActivity(obj);

        }
        if(v==ll9){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[8]);
            startActivity(obj);

        }
        if(v==ll10){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[9]);
            startActivity(obj);

        }
        if(v==ll11){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[10]);
            startActivity(obj);

        }
        if(v==ll12){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[11]);
            startActivity(obj);

        }
        if(v==ll13){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[12]);
            startActivity(obj);

        }
        if(v==ll14){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[13]);
            startActivity(obj);

        }
        if(v==ll15){
            obj=new Intent(getActivity(), FunRegistration.class);
            obj.putExtra("event",s[14]);
            startActivity(obj);

        }

    }
}
