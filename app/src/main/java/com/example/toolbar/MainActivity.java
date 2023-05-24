package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

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

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.search_menu:{
                Toast.makeText(this, "Você clicou no Buscar", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.cart_menu:{
                Toast.makeText(this, "Você clicou no Carrinho", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.config_menu:{
                Toast.makeText(this, "Você clicou na Configurações", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.about_menu:{
                Toast.makeText(this, "Você clicou no Sobre", Toast.LENGTH_LONG).show();
                break;
            }
        }

        return super.onOptionsItemSelected(item);
    }
}

/* Criando um Android Resource File - vamos criar um arquivo de layout, no caso,
 * um layout activity para o nosso menu. Vale Reealtar que no Resource Type vamos escolher a
 * opção menu.
 *
 *  */