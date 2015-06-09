package com.picokat.myappportfolio;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] buttons = {
                R.id.spotifyStreamer,
                R.id.scoresApp,
                R.id.libraryApp,
                R.id.buildItBigger,
                R.id.xyxReader,
                R.id.capstoneMyOwnApp,
        };

        for (int i=0; i < buttons.length; i++) {
            findViewById(buttons[i]).setOnClickListener(this);
        }
    };

    @Override
    public void onClick(View v) {
        String buttonText = ((Button)v).getText().toString();
        Toast.makeText(getApplicationContext(), buttonText +" is coming soon!!!", Toast.LENGTH_SHORT).show();
    }

}
