package com.boredddude.randomreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mbuttonStart;
    Button mbuttonAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbuttonStart = (Button) findViewById(R.id.buttonStart);
        mbuttonAbout = (Button) findViewById(R.id.buttonAbout);


        mbuttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, SlideShowActivity.class);
                //startActivity(intent);
                //finish();
                //return;
                openDialog();
            }
        });


        mbuttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                //finish();
                return;
            }
        });



    }
    public void openDialog() {
        Dialog dialog = new Dialog();
        dialog.show(getSupportFragmentManager(), "StartDialog");
    };
}
