package br.com.oreo.android.curso.frasesdiaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView mostraFrases;
    private String[] frasesDia;

    int num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostraFrases = findViewById(R.id.txtFrase);
        frasesDia = getResources().getStringArray(R.array.frases);
    }

    public void exibirNovaFrase(View view) {
        Random random = new Random();
        int num = random.nextInt(frasesDia.length);

        if (num != num2){
            mostraFrases.setText(frasesDia[num]);
            num2 = num;
        } else {
            while (num == num2) {
                num = random.nextInt(frasesDia.length);
            }
            mostraFrases.setText(frasesDia[num]);
            num2 = num;
        }
    }
}
