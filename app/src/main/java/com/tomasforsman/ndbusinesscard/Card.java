package com.tomasforsman.ndbusinesscard;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Card extends AppCompatActivity {

    TextView txtName;
    TextView txtMyName;
    TextView txtMail;
    TextView txtPhone;
    String strPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_activity);

        txtName = (TextView)findViewById(R.id.txtName);
        txtMyName = (TextView)findViewById(R.id.txtMyName);
        txtMail = (TextView)findViewById(R.id.txtMail);
        txtPhone = (TextView)findViewById(R.id.txtPhone);
        strPhone = this.getString(R.string.mobile);

        // Create a TypeFace using font from Assets folder
        Typeface dyslexieType = Typeface.createFromAsset(getAssets(),
                "fonts/dyslexie_regular.ttf");
        // set TypeFace to the TextView or Edittext
        txtName.setTypeface(dyslexieType);
        txtMyName.setTypeface(dyslexieType);
        txtMail.setTypeface(dyslexieType);
        txtPhone.setTypeface(dyslexieType);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btnCall);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click action
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+ strPhone));
                startActivity(intent);
            }
        });


    }


}
