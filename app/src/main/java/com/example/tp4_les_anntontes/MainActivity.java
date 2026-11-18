package com.example.tp4_les_anntontes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etnom, etprenom, etmail;
    private Button btnenvoyer;

    private void init() {
        etnom = findViewById(R.id.etnom);
        etprenom = findViewById(R.id.etprenom);
        etmail = findViewById(R.id.etmail);
        btnenvoyer = findViewById(R.id.btnenvoyer);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnenvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Récupération les information  saisies
                String nom = etnom.getText().toString().trim();
                String prenom = etprenom.getText().toString().trim();
                String mail = etmail.getText().toString().trim();

                if (nom.isEmpty() || prenom.isEmpty() || mail.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Intent explicite
                Intent myintent = new Intent(MainActivity.this, WelcomeActivity.class);

                // Ajout des données dans les extras
                myintent.putExtra("name", nom);
                myintent.putExtra("lastname", prenom);
                myintent.putExtra("mymail", mail);

                // Lancement de la deuxième activité
                startActivity(myintent);
            }
        });
    }
}