package com.example.prac4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class StartFragment extends Fragment {

    public StartFragment() {
        super(R.layout.fragment_blank);
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_blank, container, false);

        EditText inputText = v.findViewById(R.id.enterTextInViews);

        Button button1 = v.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("1", String.valueOf(inputText.getText()));
                Navigation.findNavController(view).navigate(R.id.action_blank_to_list, bundle);
            }
        });

        Button button2 = v.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("1", String.valueOf(inputText.getText()));
                Navigation.findNavController(view).navigate(R.id.action_blank_to_recycler, bundle);
            }
        });
        return v;
    }
}

