package com.example.gallusawa.navigationdrawerproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment implements  View.OnClickListener {

    Button btn1, btn2;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_third, container, false);

        btn1 = (Button) v.findViewById(R.id.tbn1);
        btn2 = (Button) v.findViewById(R.id.tbn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

        return v;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tbn1:
                Toast.makeText(getActivity(), "Button 1 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tbn2:
                Toast.makeText(getActivity(), "Button 2 Clicked", Toast.LENGTH_SHORT).show();
                break;

        }


    }
}
