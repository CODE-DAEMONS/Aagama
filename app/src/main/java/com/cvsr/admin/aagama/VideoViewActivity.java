package com.cvsr.admin.aagama;

import android.app.Activity;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewActivity extends Activity {
    ProgressDialog pDialog;
    VideoView videoview;
    String VideoURL = "http://www.aagama2k16.in/gy.mp4";

    public VideoViewActivity() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.videoview_main);


        this.videoview = (VideoView)this.findViewById(R.id.VideoView);
        this.pDialog = new ProgressDialog(this);
        this.pDialog.setTitle("Aagama video");
        this.pDialog.setMessage("Buffering...");
        this.pDialog.setIndeterminate(false);
        this.pDialog.setCancelable(false);
        this.pDialog.show();

        try {
            MediaController e = new MediaController(this);
            e.setAnchorView(this.videoview);
            Uri video = Uri.parse(this.VideoURL);
            this.videoview.setMediaController(e);
            this.videoview.setVideoURI(video);
        } catch (Exception var4) {
            Log.e("Error", var4.getMessage());
            var4.printStackTrace();
        }

        this.videoview.requestFocus();
        this.videoview.setOnPreparedListener(new OnPreparedListener() {
            public void onPrepared(MediaPlayer mp) {
                VideoViewActivity.this.pDialog.dismiss();
                VideoViewActivity.this.videoview.start();
            }
        });
    }
}
