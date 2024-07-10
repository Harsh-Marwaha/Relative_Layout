package com.example.relativelayout;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;


public class BmiFragment extends Fragment {




    public BmiFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bmi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView res,bm;
        EditText wt,ft,in;
        Button cal,btnImg;
        ProgressBar pb;



        wt=view.findViewById(R.id.wt);
        ft=view.findViewById(R.id.ft);
        in=view.findViewById(R.id.in);
        cal=view.findViewById(R.id.cal);
        res=view.findViewById(R.id.res);
        bm=view.findViewById(R.id.bm);


        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int weight = Integer.parseInt(wt.getText().toString());
                int feet = Integer.parseInt(ft.getText().toString());
                int inches = Integer.parseInt(ft.getText().toString());

                int totalht= (feet*12) + inches;
                double totalcm = totalht*2.54;
                double totalm = totalcm/100;

                double bmi = weight/(totalm*totalm);

                String s = String.format("%.2f",bmi);

                if (bmi > 25)
                {
                    res.setText("Overweight");
                    bm.setText(s);
                }
                else if(bmi<18.5)
                {
                    res.setText("Underweight");
                    bm.setText(s);
                }
                else
                {
                    res.setText("Healthy");
                    bm.setText(s);
                }
            }
        });

    }
}