package com.example.calculateurdimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    EditText Poids;
    EditText  Taille;
    TextView Resultat;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Taille = findViewById(R.id.editT);
        Poids = findViewById(R.id.editP);
        Resultat = findViewById(R.id.textView);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double T = Double.parseDouble(Taille.getText().toString());
                Double P = Double.parseDouble(Poids.getText().toString());
                Double Result = P / (T*T);

                String R = "";

                if (Result>=40){
                    R="Obesité morbide ou massive";
                }

                if (Result<40 && Result>=35){
                    R="Obésité sévère";
                }

                if (Result<35 && Result>=30){
                    R="Obésité modérée";
                }

                if (Result<30 && Result>=25){
                    R="Surpoids";
                }

                if (Result<25 && Result>=18.5){
                    R="Corpulence normale";
                }

                if (Result<18.5 && Result>=16.5){
                    R="Maigreur";
                }

                if (Result<16.5){
                    R="Famine";
                }
 Resultat.setText(R);

            }
        });




    }







}