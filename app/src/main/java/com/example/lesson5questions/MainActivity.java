package com.example.lesson5questions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int i =0;
    private TextView varTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] questionary = getResources().getStringArray(R.array.question_array);
        varTextView = (TextView)findViewById(R.id.textQuestion);
        varTextView.setText(questionary[i]);

        Button buttFalse = findViewById(R.id.buttFalse);
        Button buttTrue = findViewById(R.id.buttTrue);

        buttFalse.setOnClickListener(this);
        buttTrue.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast correcToast = Toast.makeText(this, "Correct", Toast.LENGTH_SHORT);

        Toast incorrecToast = Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT);
        String question = (String) varTextView.getText();
        switch (v.getId()){

            case R.id.buttTrue:

                if (question.equals("Do we live in a earth?")) {
                    correcToast.show();
                }
                if (question.equals("Is 2 a even number")) {
                    correcToast.show();
                }
                if (question.equals("Elephant is the animal that live more years")) {
                    incorrecToast.show();
                }
                break;
            case R.id.buttFalse:

                if (question.equals("Do we live in a earth?")) {
                    incorrecToast.show();
                }
                if (question.equals("Is 2 a even number")) {
                    incorrecToast.show();
                }
                if (question.equals("Elephant is the animal that live more years")) {
                    correcToast.show();
                }
                break;

        }
    }

    public void goForward(View v){

        String[] questionary = getResources().getStringArray(R.array.question_array);

        if(i < questionary.length-1){
            i++;
            varTextView.setText(questionary[i]);
        }else{
            varTextView.setText(questionary[i]);
        }
    }

    public void goBack(View v){
        String[] questionary = getResources().getStringArray(R.array.question_array);
        if(i > 0){
            i--;
            varTextView.setText(questionary[i]);
        }else{
            varTextView.setText(questionary[i]);
        }
    }
}
