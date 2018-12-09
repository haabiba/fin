package com.example.bazinfo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;


public class contact  extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conacts);

        Button btnconfirmer1 = findViewById(R.id.btnConfirmer1);
        Button btnannuler1 = findViewById(R.id.btnAnnuler1);

        final TextView email = findViewById(R.id.t11);
        final TextView msg = findViewById(R.id.t22);



        btnconfirmer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //// sqlLite pour connecter et passer au page navigation drawer
                //.....................






            }
        });

        btnannuler1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //vide les champs



                email.setText("");
               msg.setText("");


            }
        });

    }
}

