package com.example.jokeactivitylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class JokeActivity extends AppCompatActivity {

    final static String JOKE_EXTRA="joke";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent intent=getIntent();

        if(intent!=null){
            ((TextView)findViewById(R.id.joke_text)).setText(intent.getStringExtra(JOKE_EXTRA));
        }

    }
}
