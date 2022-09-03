package com.example.mislugares.presentacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mislugares.R;

public class AcercaDeActivity extends AppCompatActivity {

    @Override
    public void onCreate (Bundle saveInstanceState) {
        super.onCreate (saveInstanceState);
        setContentView(R.layout.acercade);
    }

    public void lanzarAcercaDe1 (View view)
    {
        Intent i = new Intent (this, AcercaDeActivity.class);
        startActivity(i);
    }
}
