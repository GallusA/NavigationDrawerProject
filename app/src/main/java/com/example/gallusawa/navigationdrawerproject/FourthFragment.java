package com.example.gallusawa.navigationdrawerproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FourthFragment extends Fragment {



    TextView tView1,tView2,tView3,tView4,tView5;

    SeekBar sBar, sBar2, sBar3;
    double amount;//car cost
    double rate;//interest rate of the loan
    double year;//year of the loan
    double emi;//total payment of the loan


    public FourthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fourth, container, false);

        tView1 = (TextView) view.findViewById(R.id.tv1);
        tView2 = (TextView) view.findViewById(R.id.tv2);
        tView3 = (TextView) view.findViewById(R.id.tv3);
        tView4 = (TextView) view.findViewById(R.id.tv4);
        tView5 = (TextView) view.findViewById(R.id.tv5);

        sBar = (SeekBar) view.findViewById(R.id.seekBar);
        sBar2 = (SeekBar) view.findViewById(R.id.seekBar2);
        sBar3 = (SeekBar) view.findViewById(R.id.seekBar3);


        //Loan Interest Rate
        sBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tView2.setText(String.valueOf(progress + " %"));
                rate = progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        // Laon life Years
        sBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tView3.setText(String.valueOf(progress +" Years"));
                year = progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        //Loan Amount
        sBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tView1.setText(String.valueOf("$ " + progress));
                amount = progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
     return view;

    }

    private void findViewById(int tv1) {
    }

    //result onClick
    public void result(View view) {
        rate = rate / (12*100);
        year = year * 12;
        emi = (amount * rate * Math.pow(1 + rate, year)) / (Math.pow(1 + rate, year) - 1);

        tView5.setText("$ " +emi + "");

    }


    public void onReset(View view) {

        tView2.setText(""); tView3.setText("");  tView1.setText(""); tView5.setText("");

        sBar.setProgress(0); sBar2.setProgress(0); sBar3.setProgress(0);


    }


}
