package com.example.tp1_exo3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  private List<CheckBox> listChek=new ArrayList<CheckBox>();
  private List<String> listSeleced=new ArrayList<String>();
  private RadioButton no,yes;

  Button button1,button2;
  public void initilisation(){
      no=findViewById(R.id.no);
      yes=findViewById(R.id.yes);
      button1=findViewById(R.id.button1);
      button2=findViewById(R.id.button2);
      CheckBox chek1=findViewById(R.id.check1);
      CheckBox chek2=findViewById(R.id.check2);
      CheckBox chek3=findViewById(R.id.check3);
      CheckBox chek4=findViewById(R.id.check4);
      listChek.add(chek1);
      listChek.add(chek2);
      listChek.add(chek3);
      listChek.add(chek4);

  }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initilisation();
        button1.setOnClickListener(btnQuite);
        button2.setOnClickListener(btnsuivant);
    }
    View.OnClickListener btnsuivant=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String responce= "";
            for (CheckBox C : listChek){
                if (C.isChecked()){
                    listSeleced.add(C.getText().toString());
                }
            }
            int nbr_responce=listSeleced.size();
            System.out.println(nbr_responce);

            if (yes.isChecked()) responce="oui";
            if (no.isChecked()) responce="non";
            Intent intet=new Intent(MainActivity.this,MainActivity2.class);
            intet.putExtra("res_nbr",nbr_responce+"");
            intet.putExtra("yes_no",responce);
            for (String s : listSeleced){

                intet.putExtra("value"+(listSeleced.indexOf(s)),s);
            }
            startActivity(intet);
        }
    };
  View.OnClickListener btnQuite=new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          finish();
      }
  };
}

