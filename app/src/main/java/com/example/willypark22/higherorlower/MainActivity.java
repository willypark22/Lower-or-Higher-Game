package com.example.willypark22.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String string) {

        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();

    }

    public void guessFunction(View view) {

        EditText numberEdit = findViewById(R.id.numberEdit);
        String val = numberEdit.getText().toString();
        int finalVal = Integer.parseInt(val);

        if(finalVal > randomNumber) {
            makeToast("Lower!");
        }
        else if(finalVal < randomNumber) {
            makeToast("Higher!");
        }
        else {
            makeToast("You guessed the number! Let's Play again.");
            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;

    }
}
