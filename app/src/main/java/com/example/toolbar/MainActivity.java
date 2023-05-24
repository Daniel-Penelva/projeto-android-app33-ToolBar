package com.example.toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Recebe como parâmetro o layout activity menu e o próprio menu que vem como parametro do onCreateOptionsMenu
         getMenuInflater().inflate(R.menu.menu_toolbar, menu);
         return true;
    }
}

/* Criando um Android Resource File - vamos criar um arquivo de layout, no caso,
 * um layout activity para o nosso menu. Vale Reealtar que no Resource Type vamos escolher a
 * opção menu.
 *
 *  */