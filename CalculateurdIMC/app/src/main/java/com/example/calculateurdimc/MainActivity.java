package com.example.calculateurdimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    EditText P;
    EditText T;
    TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T = findViewById(R.id.editT);
        P = findViewById(R.id.editP);
        r = findViewById(R.id.textView);

    }



    public void imc(View view) {
         double taille = Double.parseDouble(T.getText().toString());
        double poids = Double.parseDouble(P.getText().toString());
       double Result = poids / (taille*taille);
       r.setText((int) Result);
    }
}