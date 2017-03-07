package com.cvsr.admin.aagama.Events;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cvsr.admin.aagama.Registration.SkillRegistration;
import com.cvsr.admin.aagama.R;

/**
 * Created by ADMIN on 2/3/2016.
 */
public class SkillZone extends Fragment implements View.OnClickListener {

    View view;
    Intent obj;

    String s[]={"lazer Trap","Lan Gaming","Blank Coding","Ideation Contest","Circuitrix","DumbShell Electronics","Fastest Typing First","Words Worth","Quick CADD","Model Making","Cosplay AD","Arm Wrestling","Treasure Hunt"};
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13;   //SkillZone
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.events_skill_zone, container, false);

        c1=(CardView)view.findViewById(R.id.cards1);
        c2=(CardView)view.findViewById(R.id.cards2);
        c3=(CardView)view.findViewById(R.id.cards3);
        c4=(CardView)view.findViewById(R.id.cards4);
        c5=(CardView)view.findViewById(R.id.cards5);
        c6=(CardView)view.findViewById(R.id.cards6);
        c7=(CardView)view.findViewById(R.id.cards7);
        c8=(CardView)view.findViewById(R.id.cards8);
        c9=(CardView)view.findViewById(R.id.cards9);
        c10=(CardView)view.findViewById(R.id.cards10);
        c11=(CardView)view.findViewById(R.id.cards11);
        c12=(CardView)view.findViewById(R.id.cards12);
        c13=(CardView)view.findViewById(R.id.cards13);


        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);
        c8.setOnClickListener(this);
        c9.setOnClickListener(this);
        c10.setOnClickListener(this);
        c11.setOnClickListener(this);
        c12.setOnClickListener(this);
        c13.setOnClickListener(this);




        return view;


    }

    @Override
    public void onClick(View v) {

        if(v==c1){
            obj=new Intent(getActivity(), SkillRegistration.class);
            obj.putExtra("event",s[0]);
            startActivity(obj);
        }
        if(v==c2){
            obj=new Intent(getActivity(),SkillRegistration.class);
            obj.putExtra("event",s[1]);
            startActivity(obj);

        }
        if(v==c3){
            obj=new Intent(getActivity(),SkillRegistration.class);
            obj.putExtra("event",s[2]);
            startActivity(obj);

        }
        if(v==c4){
            obj=new Intent(getActivity(),SkillRegistration.class);
            obj.putExtra("event",s[3]);
            startActivity(obj);

        }
        if(v==c5){
            obj=new Intent(getActivity(),SkillRegistration.class);
            obj.putExtra("event",s[4]);
            startActivity(obj);

        }
        if(v==c6){
            obj=new Intent(getActivity(),SkillRegistration.class);
            obj.putExtra("event",s[5]);
            startActivity(obj);

        }
        if(v==c7){
            obj=new Intent(getActivity(),SkillRegistration.class);
            obj.putExtra("event",s[6]);
            startActivity(obj);

        }
        if(v==c8){
            obj=new Intent(getActivity(),SkillRegistration.class);
            obj.putExtra("event",s[7]);
            startActivity(obj);

        }
        if(v==c9){
            obj=new Intent(getActivity(),SkillRegistration.class);
            obj.putExtra("event",s[8]);
            startActivity(obj);

        }
        if(v==c10){
            obj=new Intent(getActivity(),SkillRegistration.class);
            obj.putExtra("event",s[9]);
            startActivity(obj);

        }
        if(v==c11){
            obj=new Intent(getActivity(),SkillRegistration.class);
            obj.putExtra("event",s[10]);
            startActivity(obj);

        }
        if(v==c12){
            obj=new Intent(getActivity(),SkillRegistration.class);
            obj.putExtra("event",s[11]);
            startActivity(obj);
        }
        if(v==c13){
            obj=new Intent(getActivity(),SkillRegistration.class);
            obj.putExtra("event",s[12]);
            startActivity(obj);

        }




    }

}