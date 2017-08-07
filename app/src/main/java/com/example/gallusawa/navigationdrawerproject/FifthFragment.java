package com.example.gallusawa.navigationdrawerproject;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static android.R.attr.onClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class FifthFragment extends Fragment  {

  Button play,pause,stop;

    public FifthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fifth, container, false);

         play  = (Button) v.findViewById(R.id.play);
         pause = (Button) v.findViewById(R.id.pause);
         stop = (Button) v.findViewById(R.id.stop);


        final MediaPlayer sound = MediaPlayer.create(getActivity(), R.raw.getgot);
        play.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                sound.setLooping(true);
                sound.start();
            }

        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                if(sound.isPlaying()){
                    sound.pause();
                    sound.release();
                }

            }

        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                if(sound.isPlaying()){
                    sound.stop();
                }

            }

        });

        return v;

    }
}
