package com.example.toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
    }
}

/* Criando um Android Resource File - vamos criar um arquivo de layout, no caso,
 * um layout activity para o nosso menu. Vale Reealtar que no Resource Type vamos escolher a
 * opção menu.
 *
 *  */