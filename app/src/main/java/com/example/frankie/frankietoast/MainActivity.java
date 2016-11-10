package com.example.frankie.frankietoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button = (Button) findViewById(R.id.button2);
    }
    public void makeToast(View v){
        Toast toast = Toast.makeText(this,"Ha, you just tapped the button", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void makeToast2(View v){
        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        LayoutInflater lin =getLayoutInflater();
        View appear=lin.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.root));
        toast.setView(appear);
        toast.show();



    }
}
