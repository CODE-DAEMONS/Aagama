package com.cvsr.admin.aagama.Events;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.cvsr.admin.aagama.R;

/**
 * Created by ADMIN on 2/3/2016.
 */
public class OpenZone extends Fragment {

    ImageButton cse;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.events_open_zone, container, false);


    }

}