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




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.events_fun_zone,container,false);

        return v;
    }
}
