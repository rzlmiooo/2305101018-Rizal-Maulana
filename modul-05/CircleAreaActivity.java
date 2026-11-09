package com.example.intentpraktikum;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CircleAreaActivity extends AppCompatActivity {
    EditText inputRadius;
    Button btnCalculate;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_area);

        inputRadius = findViewById(R.id.inputRadius);
        btnCalculate = findViewById(R.id.btnCalculate);
        textResult = findViewById(R.id.textResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radiusStr = inputRadius.getText().toString();
                if (!radiusStr.isEmpty()) {
                    double r = Double.parseDouble(radiusStr);
                    double luas = Math.PI * r * r;
                    textResult.setText("Luas: " + String.format("%.2f", luas));
                } else {
                    inputRadius.setError(
                            "Masukkan nilai r"
                    );
                }
            }
        });
    }

}
