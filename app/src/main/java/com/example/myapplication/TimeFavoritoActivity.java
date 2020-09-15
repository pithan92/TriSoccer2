package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;

public class TimeFavoritoActivity extends AppCompatActivity {


    Spinner activity_time_favorito_spinner_Time_recebido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_favorito);

        activity_time_favorito_spinner_Time_recebido = findViewById( R.id.activity_time_favorito_spinner_Time_recebido );
        Intent intent = getIntent();
        activity_time_favorito_spinner_Time_recebido.setSelection( 0 );

    }
}