package com.example.stm_arquitectura2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class register_cliente2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_cliente2);

        Button btnOpenFileChooser = findViewById(R.id.btn_register4);

        btnOpenFileChooser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register_cliente2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}