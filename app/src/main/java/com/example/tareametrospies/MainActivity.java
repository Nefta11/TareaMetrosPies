package com.example.tareametrospies;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText metrosEditText;
    private Button convertirButton;
    private TextView resultadoTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metrosEditText = findViewById(R.id.editTextMetros);
        convertirButton = findViewById(R.id.buttonConvertir);
        resultadoTextView = findViewById(R.id.textViewResultado);

        convertirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String metrosStr = metrosEditText.getText().toString();

                if (!metrosStr.isEmpty()) {

                    double metros = Double.parseDouble(metrosStr);
                    double pies = metros * 3.28084;
                    resultadoTextView.setText("Resultado: " + pies + " pies");
                } else {

                    resultadoTextView.setText("Por favor, ingrese un valor válido en metros.");
                }
            }
        });
    }
}
