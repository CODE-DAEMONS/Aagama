package com.cvsr.admin.aagama.Events;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cvsr.admin.aagama.R;
import com.cvsr.admin.aagama.Registration.OpenRegistration;

/**
 * Created by ADMIN on 2/3/2016.
 */
public class OpenZone extends Fragment implements View.OnClickListener{

    View view;
    CardView k1,k2,k3,k4,k5,k6,k7,k8,k9,k10,k11,k12,k13,k14,k15,k16,k17,k18,k19,k20,k21,k22,k23;  //OpeZzone
    Intent obj;
    String s[]={"App Challenge","All Round Quiz","4-Pics-1-Word","Dumb Charads","Cyber Chase","Check Your IQ","R.C.Racing","Junk Yard","Ram and Rom","Puzzle","JAM","Innovatia","Virtual Job Fair","Model Making","Memory Game","Poster Presentation","Sketch Up","Invasion","Velocity","Minute To Win It","Second To Say","Tug Of War","Spell Bee"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.events_open_zone, container, false);

        k1=(CardView)view.findViewById(R.id.card1);
        k2=(CardView)view.findViewById(R.id.card2);
        k3=(CardView)view.findViewById(R.id.card3);
        k4=(CardView)view.findViewById(R.id.card4);
        k5=(CardView)view.findViewById(R.id.card5);
        k6=(CardView)view.findViewById(R.id.card6);
        k7=(CardView)view.findViewById(R.id.card7);
        k8=(CardView)view.findViewById(R.id.card8);
        k9=(CardView)view.findViewById(R.id.card9);
        k10=(CardView)view.findViewById(R.id.card10);
        k11=(CardView)view.findViewById(R.id.card11);
        k12=(CardView)view.findViewById(R.id.card12);
        k13=(CardView)view.findViewById(R.id.card13);
        k14=(CardView)view.findViewById(R.id.card14);
        k15=(CardView)view.findViewById(R.id.card15);
        k16=(CardView)view.findViewById(R.id.card16);
        k17=(CardView)view.findViewById(R.id.card17);
        k18=(CardView)view.findViewById(R.id.card18);
        k19=(CardView)view.findViewById(R.id.card19);
        k20=(CardView)view.findViewById(R.id.card20);
        k21=(CardView)view.findViewById(R.id.card21);
        k22=(CardView)view.findViewById(R.id.card22);
        k23=(CardView)view.findViewById(R.id.card23);

        k1.setOnClickListener(this);
        k2.setOnClickListener(this);
        k3.setOnClickListener(this);
        k4.setOnClickListener(this);
        k5.setOnClickListener(this);
        k6.setOnClickListener(this);
        k7.setOnClickListener(this);
        k8.setOnClickListener(this);
        k9.setOnClickListener(this);
        k10.setOnClickListener(this);
        k11.setOnClickListener(this);
        k12.setOnClickListener(this);
        k13.setOnClickListener(this);
        k14.setOnClickListener(this);
        k15.setOnClickListener(this);
        k16.setOnClickListener(this);
        k17.setOnClickListener(this);
        k18.setOnClickListener(this);
        k19.setOnClickListener(this);
        k20.setOnClickListener(this);
        k21.setOnClickListener(this);
        k22.setOnClickListener(this);
        k23.setOnClickListener(this);



        return  view;
    }

    @Override
    public void onClick(View v) {


        if(v==k1){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[0]);
            startActivity(obj);

        }
        if(v==k2){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[1]);
            startActivity(obj);

        }
        if(v==k3){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[2]);
            startActivity(obj);

        }
        if(v==k4){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[3]);
            startActivity(obj);

        }
        if(v==k5){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[4]);
            startActivity(obj);

        }
        if(v==k6){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[5]);
            startActivity(obj);

        }
        if(v==k7){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[6]);
            startActivity(obj);

        }
        if(v==k8){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[7]);
            startActivity(obj);

        }
        if(v==k9){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[8]);
            startActivity(obj);

        }
        if(v==k10){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[9]);
            startActivity(obj);

        }
        if(v==k11){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[10]);
            startActivity(obj);

        }
        if(v==k12){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[11]);
            startActivity(obj);

        }
        if(v==k13){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[12]);
            startActivity(obj);

        }
        if(v==k14){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[13]);
            startActivity(obj);

        }
        if(v==k15){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[14]);
            startActivity(obj);

        }
        if(v==k16){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[15]);
            startActivity(obj);

        }
        if(v==k17){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[16]);
            startActivity(obj);

        }
        if(v==k18){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[17]);
            startActivity(obj);

        }
        if(v==k19){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[18]);
            startActivity(obj);

        }
        if(v==k20){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[19]);
            startActivity(obj);

        }
        if(v==k21){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[20]);
            startActivity(obj);

        }
        if(v==k22){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[21]);
            startActivity(obj);

        }
        if(v==k23){
            obj=new Intent(getActivity(), OpenRegistration.class);
            obj.putExtra("event",s[22]);
            startActivity(obj);

        }



    }


}