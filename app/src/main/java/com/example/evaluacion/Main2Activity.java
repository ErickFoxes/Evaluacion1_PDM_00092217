package com.example.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;

import com.example.evaluacion.Utils.AppConstants;

public class Main2Activity extends AppCompatActivity {
    TextView Txt_usu,Txt_corr, Txt_total;
    LinearLayout LL1, LL2,LL3,LL4,LL5,LL6,LL7,LL8,LL9;
    TextView TXTV_1,TXTV_2,TXTV_3,TXTV_4,TXTV_5,TXTV_6,TXTV_7,TXTV_8,TXTV_9;
    Button BTN_share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent mIntent = getIntent();
        Txt_usu = findViewById(R.id.txt_mostrar_usuario);
        Txt_corr = findViewById(R.id.txt_mostrar_correo);
        Txt_total = findViewById(R.id.txt_mostrar_total);

        TXTV_1 = findViewById(R.id.Txt2_1);
        TXTV_2 = findViewById(R.id.Txt2_2);
        TXTV_3 = findViewById(R.id.Txt2_3);
        TXTV_4 = findViewById(R.id.Txt2_4);
        TXTV_5 = findViewById(R.id.Txt2_5);
        TXTV_6 = findViewById(R.id.Txt2_6);
        TXTV_7 = findViewById(R.id.Txt2_7);
        TXTV_8 = findViewById(R.id.Txt2_8);
        TXTV_9 = findViewById(R.id.Txt2_9);

        LL1 = findViewById(R.id.LiLa2_1);
        LL2 = findViewById(R.id.LiLa2_2);
        LL3 = findViewById(R.id.LiLa2_3);
        LL4 = findViewById(R.id.LiLa2_4);
        LL5 = findViewById(R.id.LiLa2_5);
        LL6 = findViewById(R.id.LiLa2_6);
        LL7 = findViewById(R.id.LiLa2_7);
        LL8 = findViewById(R.id.LiLa2_8);
        LL9 = findViewById(R.id.LiLa2_9);

        BTN_share = findViewById(R.id.btn_compartir);
        if(mIntent != null){
            Txt_usu.setText("Usuario: "+mIntent.getStringExtra(AppConstants.TEXT_USU));
            Txt_corr.setText("Correo"+mIntent.getStringExtra(AppConstants.TEXT_CORREO));
            Txt_total.setText("Total: "+mIntent.getStringExtra(AppConstants.TEXT_TOTAL));

            TXTV_1.setText(mIntent.getStringExtra(AppConstants.TEXT_LL1));
            TXTV_2.setText(mIntent.getStringExtra(AppConstants.TEXT_LL2));
            TXTV_3.setText(mIntent.getStringExtra(AppConstants.TEXT_LL3));
            TXTV_4.setText(mIntent.getStringExtra(AppConstants.TEXT_LL4));
            TXTV_5.setText(mIntent.getStringExtra(AppConstants.TEXT_LL5));
            TXTV_6.setText(mIntent.getStringExtra(AppConstants.TEXT_LL6));
            TXTV_7.setText(mIntent.getStringExtra(AppConstants.TEXT_LL7));
            TXTV_8.setText(mIntent.getStringExtra(AppConstants.TEXT_LL8));
            TXTV_9.setText(mIntent.getStringExtra(AppConstants.TEXT_LL9));

        }
        BTN_share.setOnClickListener(v ->{
            Intent nIntent = new Intent();
            nIntent.setAction(Intent.ACTION_SEND);
            nIntent.setType("text/plain");
            nIntent.putExtra(Intent.EXTRA_TEXT, "Usuario: "+ Txt_usu.getText().toString()+ "\n"+ "Correo: " + Txt_corr.getText().toString() + "\n" + "Total: "+ Txt_total.getText().toString());
            startActivity(nIntent);
        });

    }
}
