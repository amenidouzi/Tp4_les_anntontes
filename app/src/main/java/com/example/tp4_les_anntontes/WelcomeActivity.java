package com.example.tp4_les_anntontes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tp4_les_anntontes.R;

public class WelcomeActivity extends AppCompatActivity {

            private TextView welcom;
            private String welcomnom, welcomeprenom, welcomemail;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.welcome_activity);

                welcom = findViewById(R.id.tvwelcome);

                // Récupération de l'Intent et de ses extras
                Intent intent = getIntent();
                welcomnom = intent.getExtras().getString("name");
                welcomeprenom = intent.getExtras().getString("lastname");
                welcomemail = intent.getExtras().getString("mymail");

                welcom.setText("Bienvenue " + welcomnom + " " + welcomeprenom + ", "+
                       "avec votre email" + welcomemail);
            }
        }

