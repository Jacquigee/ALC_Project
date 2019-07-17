package com.gmail.gitaujaquiline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button BtnOne;
    private Button BtnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnOne = findViewById(R.id.button1);
        BtnTwo = findViewById(R.id.button2);
        BtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MoveToActivityTwo();
            }
        });
        BtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MoveToActivityThree();
            }
        });
    }
    private void MoveToActivityTwo(){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
    private void MoveToActivityThree(){
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }
}
