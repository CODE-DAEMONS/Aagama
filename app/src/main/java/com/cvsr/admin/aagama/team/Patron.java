package com.cvsr.admin.aagama.team;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cvsr.admin.aagama.R;

/**
 * Created by ADMIN on 3/7/2016.
 */
public class Patron extends Fragment {

    View view;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.team_patron, container, false);

        return view;


    }

}
