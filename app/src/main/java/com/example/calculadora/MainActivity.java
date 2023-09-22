package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSomar, btnSubtrair, btnDividir, btnMultiplicar;
    EditText editNun1, editNun2;
    TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNun1 = (EditText) findViewById(R.id.editNum1);
        editNun2 = (EditText) findViewById(R.id.editNum2);

        textResultado = (TextView) findViewById(R.id.textResultado);

        btnSomar = (Button) findViewById(R.id.btnSomar);
        btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);

    }

    public void somar(View view) {
        double soma = Double.parseDouble(editNun1.getText().toString()) + Double.parseDouble(editNun2.getText().toString());
        textResultado.setText(Double.toString(soma));
    }

    public void subtrair(View view) {
        double menos = Double.parseDouble(editNun1.getText().toString()) - Double.parseDouble(editNun2.getText().toString());
        textResultado.setText(Double.toString(menos));
    }

    public void dividir(View view) {
        double divisao = Double.parseDouble(editNun1.getText().toString()) / Double.parseDouble(editNun2.getText().toString());
        textResultado.setText(Double.toString(divisao));
    }

    public void multiplicar(View view) {
        double vezes = Double.parseDouble(editNun1.getText().toString()) * Double.parseDouble(editNun2.getText().toString());
        textResultado.setText(Double.toString(vezes));
    }
}