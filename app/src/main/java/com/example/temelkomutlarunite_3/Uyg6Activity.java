package com.example.temelkomutlarunite_3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final double PI = 3.14;
        int yariCap = 5;
        double cevre = 2*PI*yariCap;
        System.out.println("Dairenin Çevresi: " + cevre);
    }
}
