package com.cvsr.admin.aagama.Events;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cvsr.admin.aagama.RegistrationActivity;
import com.cvsr.admin.aagama.R;

/**
 * Created by ADMIN on 2/3/2016.
 */
public class SkillZone extends Fragment implements View.OnClickListener {

    View view;
    Intent intent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.skill_zone, container, false);

        CardView card1=(CardView)view.findViewById(R.id.card1);
        CardView card2=(CardView)view.findViewById(R.id.card2);
        CardView card3=(CardView)view.findViewById(R.id.card3);
        CardView card4=(CardView)view.findViewById(R.id.card4);
        CardView card5=(CardView)view.findViewById(R.id.card5);
        CardView card6=(CardView)view.findViewById(R.id.card6);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);



        return view;


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.card1:
                intent = new Intent(getActivity(), RegistrationActivity.class);
                intent.putExtra("event", "Laser Trap");
                startActivity(intent);
                break;

            case R.id.card2:
                intent = new Intent(getActivity(), RegistrationActivity.class);
                intent.putExtra("event","Spell Bee");
                startActivity(intent);
                break;

            case R.id.card3:
                intent = new Intent(getActivity(), RegistrationActivity.class);
                intent.putExtra("event","Sketch Up");
                startActivity(intent);
                break;
            case R.id.card4:
                intent = new Intent(getActivity(), RegistrationActivity.class);
                intent.putExtra("event","Show Off");
                startActivity(intent);
                break;
            case R.id.card5:
                intent = new Intent(getActivity(), RegistrationActivity.class);
                intent.putExtra("event","Lan Gaming");
                startActivity(intent);
                break;
            case R.id.card6:
                intent = new Intent(getActivity(), RegistrationActivity.class);
                intent.putExtra("event","Innovatia");
                startActivity(intent);
                break;


            default:
                break;
        }

    }
}