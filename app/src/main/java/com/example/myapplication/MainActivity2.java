package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private String usuario;
    private String senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                recuperaDados();

                login(usuario, senha);

            }
        });
    }

    protected void recuperaDados() {

        EditText txt_usuario = findViewById(R.id.txt_login);
        EditText txt_senha = findViewById(R.id.txt_password);

        usuario = txt_usuario.getText().toString();
        senha = txt_senha.getText().toString();

    }
    protected void login(String usuario, String senha) {

        if(usuario.equals("admin") && senha.equals("admin")){
            Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity2.this, "Não foi possível acessar.", Toast.LENGTH_SHORT).show();
        }
    }
}