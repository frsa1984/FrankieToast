package com.example.frankie.frankietoast;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.HapticFeedbackConstants;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ViewGroup fragmentMake;
    Button button,button2;
    Vibrator v, vibrator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button = (Button) findViewById(R.id.button2);
        fragmentMake = (ViewGroup) findViewById(R.id.activity_main);
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(400);
    }
    public void makeToast(View v){
        v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
        Toast toast = Toast.makeText(this,"Ha, you just tapped the button", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void makeToast2(View v){
        v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        LayoutInflater lin =getLayoutInflater();
        View appear=lin.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.root));
        toast.setView(appear);
        toast.show();
    }
    public void makeFragment1(View view) {
        MakeFragment makeFragmentObj = new MakeFragment();
        getFragmentManager().beginTransaction().replace(R.id.activity_main,makeFragmentObj).addToBackStack("fragment1").commit();
    }
    public void makeFragment2(View view) {
        MakeFragment2 makeFragment2 = new MakeFragment2();
        getFragmentManager().beginTransaction().replace(R.id.activity_main,makeFragment2).addToBackStack("fragment2").commit();
    }
    public void makeTone(View view){
        final MediaPlayer toneMP = MediaPlayer.create(this, R.raw.tone);
        toneMP.start();
    }
    public void goBack(View view) {
        getFragmentManager().popBackStack();
    }
}
