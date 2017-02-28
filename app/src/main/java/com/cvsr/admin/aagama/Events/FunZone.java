package com.cvsr.admin.aagama.Events;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.cvsr.admin.aagama.R;

/**
 * Created by ADMIN on 2/3/2016.
 */
public class FunZone extends Fragment {
    View v;

    ImageButton t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27;
        Drawable d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,d26,d27;
    String  s1[]={"Virtual\nTyping","Blank\nCode","Brain\nBlogger",
                  "Textathon","Ideation","Dumb Shell\nElectronics",
                  "Dubsmash","Minute to\nwin it","Treasure\nHunt",
                  "cyber chase","Tech Treasure\nHunt","selfie story","Dumb\nCharades",
                  "Scary house","Halloween",
                  "Tug Of\nWar","Arm\nWrestling","Pie face\nchallenge",
                  "Ram And\nRom","Cinemania","Puzzle"};



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.events_fun_zone,container,false);

            t1=(ImageButton)v.findViewById(R.id.img1);
            t2=(ImageButton)v.findViewById(R.id.img2);
            t3=(ImageButton)v.findViewById(R.id.img3);
            t4=(ImageButton)v.findViewById(R.id.img4);
            t5=(ImageButton)v.findViewById(R.id.img5);
            t6=(ImageButton)v.findViewById(R.id.img6);
            t7=(ImageButton)v.findViewById(R.id.img7);
            t8=(ImageButton)v.findViewById(R.id.img8);
            t9=(ImageButton)v.findViewById(R.id.img9);
            t10=(ImageButton)v.findViewById(R.id.img10);
            t11=(ImageButton)v.findViewById(R.id.img11);
            t12=(ImageButton)v.findViewById(R.id.img12);
            t13=(ImageButton)v.findViewById(R.id.img13);
            t14=(ImageButton)v.findViewById(R.id.img14);
            t15=(ImageButton)v.findViewById(R.id.img15);
            t16=(ImageButton)v.findViewById(R.id.img16);
            t17=(ImageButton)v.findViewById(R.id.img17);
            t18=(ImageButton)v.findViewById(R.id.img18);
            t19=(ImageButton)v.findViewById(R.id.img19);
            t20=(ImageButton)v.findViewById(R.id.img20);
            t21=(ImageButton)v.findViewById(R.id.img21);



        d1=getResources().getDrawable(R.drawable.typing);
            d2=getResources().getDrawable(R.drawable.jumbled);
            d3=getResources().getDrawable(R.drawable.memory);
            d4=getResources().getDrawable(R.drawable.text);
            d5=getResources().getDrawable(R.drawable.innovation);
            d6=getResources().getDrawable(R.drawable.electrical);
            d7=getResources().getDrawable(R.drawable.treasure);
            d8=getResources().getDrawable(R.drawable.dubsmash);
            d9=getResources().getDrawable(R.drawable.time);
            d10=getResources().getDrawable(R.drawable.cyber);
            d11=getResources().getDrawable(R.drawable.techtreasure);
            d12=getResources().getDrawable(R.drawable.selfie);
            d13=getResources().getDrawable(R.drawable.scary);
            d14=getResources().getDrawable(R.drawable.dumb);
            d15=getResources().getDrawable(R.drawable.halloween);
            d16=getResources().getDrawable(R.drawable.tug);
            d17=getResources().getDrawable(R.drawable.arm);
            d18=getResources().getDrawable(R.mipmap.face);
            d19=getResources().getDrawable(R.drawable.ram);
            d20=getResources().getDrawable(R.drawable.cinemania);
            d21=getResources().getDrawable(R.drawable.puzzle);


        t1.setBackgroundDrawable(d1);
        t2.setBackgroundDrawable(d2);
        t3.setBackgroundDrawable(d3);
        t4.setBackgroundDrawable(d4);
        t5.setBackgroundDrawable(d5);
        t6.setBackgroundDrawable(d6);
        t7.setBackgroundDrawable(d7);
        t8.setBackgroundDrawable(d8);
        t9.setBackgroundDrawable(d9);
        t10.setBackgroundDrawable(d10);
        t11.setBackgroundDrawable(d11);
        t12.setBackgroundDrawable(d12);
        t13.setBackgroundDrawable(d13);
        t14.setBackgroundDrawable(d14);
        t15.setBackgroundDrawable(d15);
        t16.setBackgroundDrawable(d16);
        t17.setBackgroundDrawable(d17);
        t18.setBackgroundDrawable(d18);
        t19.setBackgroundDrawable(d19);
        t20.setBackgroundDrawable(d20);
        t21.setBackgroundDrawable(d21);



        TextView p1=(TextView)v.findViewById(R.id.t1);
        TextView p2=(TextView)v.findViewById(R.id.t2);
        TextView p3=(TextView)v.findViewById(R.id.t3);
        TextView p4=(TextView)v.findViewById(R.id.t4);
        TextView p5=(TextView)v.findViewById(R.id.t5);
        TextView p6=(TextView)v.findViewById(R.id.t6);
        TextView p7=(TextView)v.findViewById(R.id.t7);
        TextView p8=(TextView)v.findViewById(R.id.t8);
        TextView p9=(TextView)v.findViewById(R.id.t9);
        TextView p10=(TextView)v.findViewById(R.id.t10);
        TextView p11=(TextView)v.findViewById(R.id.t11);
        TextView p12=(TextView)v.findViewById(R.id.t12);
        TextView p13=(TextView)v.findViewById(R.id.t13);
        TextView p14=(TextView)v.findViewById(R.id.t14);
        TextView p15=(TextView)v.findViewById(R.id.t15);
        TextView p16=(TextView)v.findViewById(R.id.t16);
        TextView p17=(TextView)v.findViewById(R.id.t17);
        TextView p18=(TextView)v.findViewById(R.id.t18);
        TextView p19=(TextView)v.findViewById(R.id.t19);
        TextView p20=(TextView)v.findViewById(R.id.t20);
        TextView p21=(TextView)v.findViewById(R.id.t21);







        p1.setText(s1[0]);
        p2.setText(s1[1]);
        p3.setText(s1[2]);
        p4.setText(s1[3]);
        p5.setText(s1[4]);
        p6.setText(s1[5]);
        p7.setText(s1[6]);
        p8.setText(s1[7]);
        p9.setText(s1[8]);
        p10.setText(s1[9]);
        p11.setText(s1[10]);
        p12.setText(s1[11]);
        p13.setText(s1[12]);
        p14.setText(s1[13]);
        p15.setText(s1[14]);
        p16.setText(s1[15]);
        p17.setText(s1[16]);
        p18.setText(s1[17]);
        p19.setText(s1[18]);
        p20.setText(s1[19]);
        p21.setText(s1[20]);






        return v;
    }
}
