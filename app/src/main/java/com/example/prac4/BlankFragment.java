package com.example.prac4;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BlankFragment extends Fragment {

    public BlankFragment() {
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
                fTrans.commit();
            }
        });
        return v;
    }
}

