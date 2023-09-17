package com.example.tareametrospies;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText metrosEditText;
    private Button convertirButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metrosEditText = findViewById(R.id.editTextMetros);
        convertirButton = findViewById(R.id.buttonConvertir);

        convertirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String metrosStr = metrosEditText.getText().toString();

                if (!metrosStr.isEmpty()) {
                    double metros = Double.parseDouble(metrosStr);
                    double pies = metros * 3.28084;

                    Toast.makeText(MainActivity.this, "Resultado: " + pies + " pies", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Por favor, ingrese un valor válido en metros.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
