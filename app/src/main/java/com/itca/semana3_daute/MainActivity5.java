package com.itca.semana3_daute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    private EditText txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
    }

    public void verificar(View view) {
        String clave = txt2.getText().toString();
        if(clave.length() == 0){
            Toast.makeText(this, "La clave no puede quedar vacìa.", Toast.LENGTH_SHORT).show();
        }

    }
}