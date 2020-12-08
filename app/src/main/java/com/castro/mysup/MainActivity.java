package com.castro.mysup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtEmail, txtPassword;
    Button btnIniciar, btnIrRegistro;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();
        reference = database.getReference();

        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        btnIniciar = findViewById(R.id.btnIniciar);
        btnIrRegistro = findViewById(R.id.btnIrRegistro);

        btnIniciar.setOnClickListener(this);
        btnIrRegistro.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnIniciar:

                break;
            case R.id.btnIrRegistro:
                Intent intentRegistro = new Intent(MainActivity.this,Registro.class);
                startActivity(intentRegistro);
                break;
        }
    }
}