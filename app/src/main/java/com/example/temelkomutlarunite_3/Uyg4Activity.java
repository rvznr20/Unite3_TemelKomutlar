package com.example.temelkomutlarunite_3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        char karakter = 'a';
        int ascii = (int) karakter;

        System.out.println("Karakter: " + karakter);
        System.out.println("ASCII Kodu: " + ascii);
    }
}
