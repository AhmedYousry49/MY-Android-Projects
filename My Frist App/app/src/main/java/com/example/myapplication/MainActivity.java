package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Welcome(View view) {
        ((TextView) findViewById(R.id.WelcomeTx)).setText("Hello Ahmed");
        Snackbar.make(view, "You made us happy", Snackbar.LENGTH_SHORT)
                .setAction("", null).show();
    }
}
