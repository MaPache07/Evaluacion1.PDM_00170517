package com.dondyprax.contadorproductos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dondyprax.contadorproductos.utilities.AppConstants;

public class MainActivity extends AppCompatActivity{

    private LinearLayout producto1, producto2, producto3, producto4, producto5, producto6, producto7, producto8, producto9;
    private TextView texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9;
    private EditText editUser, editEmail;
    private Button actionSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
    }

    public void setViews(){
        producto1 = findViewById(R.id.producto1);
        producto2 = findViewById(R.id.producto2);
        producto3 = findViewById(R.id.producto3);
        producto4 = findViewById(R.id.producto4);
        producto5 = findViewById(R.id.producto5);
        producto6 = findViewById(R.id.producto6);
        producto7 = findViewById(R.id.producto7);
        producto8 = findViewById(R.id.producto8);
        producto9 = findViewById(R.id.producto9);

        texto1 = findViewById(R.id.texto1);
        texto2 = findViewById(R.id.texto2);
        texto3 = findViewById(R.id.texto3);
        texto4 = findViewById(R.id.texto4);
        texto5 = findViewById(R.id.texto5);
        texto6 = findViewById(R.id.texto6);
        texto7 = findViewById(R.id.texto7);
        texto8 = findViewById(R.id.texto8);
        texto9 = findViewById(R.id.texto9);

        producto1.setOnClickListener(v->Click(texto1));
        producto2.setOnClickListener(v->Click(texto2));
        producto3.setOnClickListener(v->Click(texto3));
        producto4.setOnClickListener(v->Click(texto4));
        producto5.setOnClickListener(v->Click(texto5));
        producto6.setOnClickListener(v->Click(texto6));
        producto7.setOnClickListener(v->Click(texto7));
        producto8.setOnClickListener(v->Click(texto8));
        producto9.setOnClickListener(v->Click(texto9));

        editUser = findViewById(R.id.editUsuario);
        editEmail = findViewById(R.id.editCorreo);

        actionSend = findViewById(R.id.actionSend);

        actionSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString(AppConstants.KEY_USERNAME, editUser.getText().toString().trim());
                bundle.putString(AppConstants.KEY_EMAIL, editEmail.getText().toString().trim());
                bundle.putString(AppConstants.KEY_1, texto1.getText().toString().trim());
                bundle.putString(AppConstants.KEY_2, texto2.getText().toString().trim());
                bundle.putString(AppConstants.KEY_3, texto3.getText().toString().trim());
                bundle.putString(AppConstants.KEY_4, texto4.getText().toString().trim());
                bundle.putString(AppConstants.KEY_5, texto5.getText().toString().trim());
                bundle.putString(AppConstants.KEY_6, texto6.getText().toString().trim());
                bundle.putString(AppConstants.KEY_7, texto7.getText().toString().trim());
                bundle.putString(AppConstants.KEY_8, texto8.getText().toString().trim());
                bundle.putString(AppConstants.KEY_9, texto9.getText().toString().trim());

                Intent mIntent = new Intent(MainActivity.this, ShareActivity.class);
                mIntent.putExtras(bundle);
                startActivity(mIntent);
            }
        });
    }

    private void Click(TextView texto){
        texto.setText(Integer.toString(Integer.parseInt(texto.getText().toString().trim())+1));
    }
}
