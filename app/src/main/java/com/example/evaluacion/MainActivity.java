package com.example.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.evaluacion.Utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    LinearLayout LL1, LL2,LL3,LL4,LL5,LL6,LL7,LL8,LL9;
    EditText ETXT_usuario,ETXT_correo;
    TextView TXTV_1,TXTV_2,TXTV_3,TXTV_4,TXTV_5,TXTV_6,TXTV_7,TXTV_8,TXTV_9;
    Button BTN_SEND;
    int contador1;
    int contador2;
    int contador3;
    int contador4;
    int contador5;
    int contador6;
    int contador7;
    int contador8;
    int contador9;
    int total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LL1 = findViewById(R.id.LiLa_1);
        LL2 = findViewById(R.id.LiLa_2);
        LL3 = findViewById(R.id.LiLa_3);
        LL4 = findViewById(R.id.LiLa_4);
        LL5 = findViewById(R.id.LiLa_5);
        LL6 = findViewById(R.id.LiLa_6);
        LL7 = findViewById(R.id.LiLa_7);
        LL8 = findViewById(R.id.LiLa_8);
        LL9 = findViewById(R.id.LiLa_9);

        ETXT_usuario = findViewById(R.id.ET_usuario);
        ETXT_correo = findViewById(R.id.ET_correo);

        TXTV_1 = findViewById(R.id.Txt_1);
        TXTV_2 = findViewById(R.id.Txt_2);
        TXTV_3 = findViewById(R.id.Txt_3);
        TXTV_4 = findViewById(R.id.Txt_4);
        TXTV_5 = findViewById(R.id.Txt_5);
        TXTV_6 = findViewById(R.id.Txt_6);
        TXTV_7 = findViewById(R.id.Txt_7);
        TXTV_8 = findViewById(R.id.Txt_8);
        TXTV_9 = findViewById(R.id.Txt_9);

        contador1 = 0;
        contador2 = 0;
        contador3 = 0;
        contador4 = 0;
        contador5 = 0;
        contador6 = 0;
        contador7 = 0;
        contador8 = 0;
        contador9 = 0;

        LL1.setOnClickListener(v ->{
            contador1 = contador1 + 1;
            TXTV_1.setText(contador1+"");
        });
        LL2.setOnClickListener(v ->{
            contador2 = contador2 + 1;
            TXTV_2.setText(contador2+"");
        });
        LL3.setOnClickListener(v ->{
            contador3 = contador3 + 1;
            TXTV_3.setText(contador3+"");
        });
        LL4.setOnClickListener(v ->{
            contador4 = contador4 + 1;
            TXTV_4.setText(contador4+"");
        });
        LL5.setOnClickListener(v ->{
            contador5 = contador5 + 1;
            TXTV_5.setText(contador5+"");
        });
        LL6.setOnClickListener(v ->{
            contador6 = contador6 + 1;
            TXTV_6.setText(contador6+"");
        });
        LL7.setOnClickListener(v ->{
            contador7 = contador7 + 1;
            TXTV_7.setText(contador7+"");
        });
        LL8.setOnClickListener(v ->{
            contador8 = contador8 + 1;
            TXTV_8.setText(contador8+"");
        });
        LL9.setOnClickListener(v ->{
            contador9 = contador9 + 1;
            TXTV_9.setText(contador9+"");
        });



        BTN_SEND = findViewById(R.id.btn_enviar);
        BTN_SEND.setOnClickListener(v ->{
            total = contador1+contador2+contador3+contador4+contador5+contador6+contador7+contador8+contador9;
            Intent mIntent = new Intent(MainActivity.this, Main2Activity.class);
            mIntent.putExtra(AppConstants.TEXT_USU,ETXT_usuario.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_CORREO,ETXT_correo.getText().toString());
            mIntent.putExtra(AppConstants.TEXT_LL1,TXTV_1.getText().toString() );
            mIntent.putExtra(AppConstants.TEXT_LL2,TXTV_2.getText().toString() );
            mIntent.putExtra(AppConstants.TEXT_LL3,TXTV_3.getText().toString() );
            mIntent.putExtra(AppConstants.TEXT_LL4,TXTV_4.getText().toString() );
            mIntent.putExtra(AppConstants.TEXT_LL5,TXTV_5.getText().toString() );
            mIntent.putExtra(AppConstants.TEXT_LL6,TXTV_6.getText().toString() );
            mIntent.putExtra(AppConstants.TEXT_LL7,TXTV_7.getText().toString() );
            mIntent.putExtra(AppConstants.TEXT_LL8,TXTV_8.getText().toString() );
            mIntent.putExtra(AppConstants.TEXT_LL9,TXTV_9.getText().toString() );
            mIntent.putExtra(AppConstants.TEXT_TOTAL, total+"");

            startActivity(mIntent);
        });
    }
}
