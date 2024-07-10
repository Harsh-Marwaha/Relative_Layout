package com.example.relativelayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class CalculatorFragment extends Fragment {



    public CalculatorFragment() {
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
        return inflater.inflate(R.layout.fragment_calculator, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        try {


            EditText edtFirst, edtSecond;
            ImageButton btnAdd, btnSub, btnMul, btnDiv;
            TextView res;
            Button btnImg;

            edtFirst = view.findViewById(R.id.a);
            edtSecond = view.findViewById(R.id.b);
            btnAdd = view.findViewById(R.id.add);
            btnSub = view.findViewById(R.id.sub);
            btnMul = view.findViewById(R.id.mul);
            btnDiv = view.findViewById(R.id.div);
            res = view.findViewById(R.id.res);
            

            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (edtFirst.getText().toString().isEmpty()) {
                        Toast.makeText(getContext().getApplicationContext(), "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    if (edtSecond.getText().toString().isEmpty()) {
                        Toast.makeText(getContext().getApplicationContext(), "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    int x = Integer.parseInt(edtFirst.getText().toString());
                    int y = Integer.parseInt(edtSecond.getText().toString());

                    int result = x + y;
                    String s = String.valueOf(result);
                    res.setText(s);
                }
            });

            btnSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (edtFirst.getText().toString().isEmpty()) {
                        Toast.makeText(getContext().getApplicationContext(), "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    if (edtSecond.getText().toString().isEmpty()) {
                        Toast.makeText(getContext().getApplicationContext(), "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    int x = Integer.parseInt(edtFirst.getText().toString());
                    int y = Integer.parseInt(edtSecond.getText().toString());

                    int result = x - y;
                    String s = String.valueOf(result);
                    res.setText(s);
                }
            });

            btnMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (edtFirst.getText().toString().isEmpty()) {
                        Toast.makeText(getContext().getApplicationContext(), "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    if (edtSecond.getText().toString().isEmpty()) {
                        Toast.makeText(getContext().getApplicationContext(), "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    int x = Integer.parseInt(edtFirst.getText().toString());
                    int y = Integer.parseInt(edtSecond.getText().toString());

                    int result = x * y;
                    String s = String.valueOf(result);
                    res.setText(s);
                }
            });

            btnDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (edtFirst.getText().toString().isEmpty()) {
                        Toast.makeText(getContext().getApplicationContext(), "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    if (edtSecond.getText().toString().isEmpty()) {
                        Toast.makeText(getContext().getApplicationContext(), "INVALID INPUT", Toast.LENGTH_LONG).show();
                        return;
                    }

                    int x = Integer.parseInt(edtFirst.getText().toString());
                    int y = Integer.parseInt(edtSecond.getText().toString());

                    int result = x / y;
                    String s = String.valueOf(result);
                    res.setText(s);
                }
            });
        }
        catch (Exception e) {
            // handle the exception
            TextView res;
            res=view.findViewById(R.id.res);
            res.setText("INVALID INPUT");
            Toast.makeText(getContext().getApplicationContext(),"INVALID INPUT",Toast.LENGTH_LONG);
        }


    }
}