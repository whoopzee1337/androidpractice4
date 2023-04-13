package com.example.prac4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class StartFragment extends Fragment {

    public StartFragment() {
        super(R.layout.fragment_blank);
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_blank, container, false);

        Button button1 = v.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle result = new Bundle();
                FragmentTransaction fTrans = getFragmentManager().beginTransaction();
                fTrans.replace(R.id.fragment1, new ListFragment());
                fTrans.addToBackStack(null);
                fTrans.commit();
            }
        });

        Button button2 = v.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle result = new Bundle();
                FragmentTransaction fTrans = getFragmentManager().beginTransaction();
                fTrans.replace(R.id.fragment1, new RecyclerFragment());
                fTrans.addToBackStack(null);
                fTrans.commit();
            }
        });
        return v;
    }
}

