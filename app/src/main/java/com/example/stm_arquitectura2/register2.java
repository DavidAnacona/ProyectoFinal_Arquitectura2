package com.example.stm_arquitectura2;
import android.Manifest;
import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.PackageManager;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register2 extends AppCompatActivity {
    private static final int MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE = 1;
    private static final int PICK_FILE_REQUEST = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        Button btnOpenFileChooser3 = findViewById(R.id.btn_register2);

        btnOpenFileChooser3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register2.this, register_finish.class);
                startActivity(intent);
            }
        });

        // Configurar el botón para abrir el gestor de archivos
        Button btnOpenFileChooser = findViewById(R.id.btn_drag_document);
        Button btnOpenFileChooser1 = findViewById(R.id.btn_drag_document1);
        Button btnOpenFileChooser2 = findViewById(R.id.btn_drag_document2);

        btnOpenFileChooser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Solicitar permisos al hacer clic en el botón
                if (ContextCompat.checkSelfPermission(register2.this, Manifest.permission.READ_EXTERNAL_STORAGE)
                        != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(register2.this,
                            new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                            MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE);
                } else {
                    showFileChooser();
                }
            }
        });

        btnOpenFileChooser1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Solicitar permisos al hacer clic en el botón
                if (ContextCompat.checkSelfPermission(register2.this, Manifest.permission.READ_EXTERNAL_STORAGE)
                        != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(register2.this,
                            new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                            MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE);
                } else {
                    showFileChooser();
                }
            }
        });

        btnOpenFileChooser2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Solicitar permisos al hacer clic en el botón
                if (ContextCompat.checkSelfPermission(register2.this, Manifest.permission.READ_EXTERNAL_STORAGE)
                        != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(register2.this,
                            new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                            MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE);
                } else {
                    showFileChooser();
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                showFileChooser();
            } else {
                // Manejar el caso de permiso denegado
            }
        }
    }

    private void showFileChooser() {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("*/*");
        startActivityForResult(intent, PICK_FILE_REQUEST);
    }
}
