package com.dondyprax.contadorproductos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dondyprax.contadorproductos.utilities.AppConstants;

public class ShareActivity extends AppCompatActivity {

    private TextView texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9, shareEmail, shareName;
    private Button actionShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        setViews();

        Bundle bundle = getIntent().getExtras();
        Intent mIntent = this.getIntent();

        shareName.setText(bundle.getString(AppConstants.KEY_USERNAME));
        shareEmail.setText(bundle.getString(AppConstants.KEY_EMAIL));
        texto1.setText(bundle.getString(AppConstants.KEY_1));
        texto2.setText(bundle.getString(AppConstants.KEY_2));
        texto3.setText(bundle.getString(AppConstants.KEY_3));
        texto4.setText(bundle.getString(AppConstants.KEY_4));
        texto5.setText(bundle.getString(AppConstants.KEY_5));
        texto6.setText(bundle.getString(AppConstants.KEY_6));
        texto7.setText(bundle.getString(AppConstants.KEY_7));
        texto8.setText(bundle.getString(AppConstants.KEY_8));
        texto9.setText(bundle.getString(AppConstants.KEY_9));
    }

    public void setViews(){
        shareName = findViewById(R.id.shareName);
        shareEmail = findViewById(R.id.shareEmail);
        texto1 = findViewById(R.id.share1);
        texto2 = findViewById(R.id.share2);
        texto3 = findViewById(R.id.share3);
        texto4 = findViewById(R.id.share4);
        texto5 = findViewById(R.id.share5);
        texto6 = findViewById(R.id.share6);
        texto7 = findViewById(R.id.share7);
        texto8 = findViewById(R.id.share7);
        texto9 = findViewById(R.id.share8);
        actionShare = findViewById(R.id.actionShare);

        actionShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
