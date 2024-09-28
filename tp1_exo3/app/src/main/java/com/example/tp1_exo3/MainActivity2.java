package com.example.tp1_exo3;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private TextView res1, res2, res3;
    private Button button1, button2;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        res1 = findViewById(R.id.score);
        button1 = findViewById(R.id.button6);
        button2 = findViewById(R.id.button7);
        res2 = findViewById(R.id.correct_reponce);
        res3 = findViewById(R.id.votre_reponce);

        String score = "0%";
        String repo1 = this.getIntent().getStringExtra("yes_no");
        List<String> repo2 = new ArrayList<>();

        int nbr_check = Integer.parseInt(this.getIntent().getStringExtra("res_nbr"));
        Log.i("nbr_check", String.valueOf(nbr_check));

        for (int i = 0; i < nbr_check; i++) {
            String value = this.getIntent().getStringExtra("value" + i);
            if (value != null) {
                repo2.add(value);
            }
        }

        Log.i("Responses", repo2.toString());

        if (repo2.get(0).equals("model view controller") && repo1.equals("oui")) {
            score = "100%";
        } else if (repo2.get(0).equals("model view controller") || repo1.equals("oui")) {
            score = "50%";
        }

        res1.setText(res1.getText() + score);
        res3.setText(res3.getText() + "1 " + this.getIntent().getStringExtra("yes_no") + "\n 2 " + repo2.get(0));
        res2.setText(res2.getText() + "1. oui      2. model view controller");

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

        if (score.equals("100%")) {
            AlertDialog dialog = congalert();
            dialog.show();
        }
    }

    public AlertDialog congalert() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("👏👏👏 Congratulation");
        alert.setNegativeButton("See result", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity2.this, "Complete score", Toast.LENGTH_LONG).show();
            }
        });
        return alert.create();
    }
}
