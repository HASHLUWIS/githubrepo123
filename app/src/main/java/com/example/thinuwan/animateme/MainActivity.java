package com.example.thinuwan.animateme;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button button_mouse_1;
    Button button_mouse_2;
    Button button_mouse_3;
    Button button_mouse_4;
    Button button_mouse_5;
    Button button_mouse_6;
    TextView textView_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_mouse_1 = (Button)findViewById(R.id.button_mouse_1);
        button_mouse_2 = (Button)findViewById(R.id.button_mouse_2);
        button_mouse_3 = (Button)findViewById(R.id.button_mouse_3);
        button_mouse_4 = (Button)findViewById(R.id.button_mouse_4);
        button_mouse_5 = (Button)findViewById(R.id.button_mouse_5);
        button_mouse_6 = (Button)findViewById(R.id.button_mouse_6);
        textView_animation = (TextView)findViewById(R.id.textView_animation);

        button_mouse_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeIn();
            }
        });

        button_mouse_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeOut();
            }
        });

        button_mouse_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slide();
            }
        });

        button_mouse_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotate();
            }
        });

        button_mouse_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bounce();
            }
        });

        button_mouse_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enlarge();
            }
        });

    }

    public void fadeIn(){
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.fadein);
        button_mouse_1.startAnimation(animation);

        int orientation=this.getResources().getConfiguration().orientation;
        if(orientation== Configuration.ORIENTATION_PORTRAIT){
            textView_animation.setText("FADEIN");
        }
        else{
            textView_animation.setText("F\nA\nD\nE\nI\nN");
        }
        textView_animation.setBackgroundColor(Color.parseColor("#ff6600"));
    }

    public void fadeOut(){
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        button_mouse_2.startAnimation(animation);

        int orientation=this.getResources().getConfiguration().orientation;
        if(orientation== Configuration.ORIENTATION_PORTRAIT){
            textView_animation.setText("FADEOUT");
        }
        else{
            textView_animation.setText("F\nA\nD\nE\nO\nu\nT");
        }
        textView_animation.setBackgroundColor(Color.parseColor("#6600ff"));

    }

    public void slide(){
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.slide);
        button_mouse_3.startAnimation(animation);

        int orientation=this.getResources().getConfiguration().orientation;
        if(orientation== Configuration.ORIENTATION_PORTRAIT){
            textView_animation.setText("SLIDE");
        }
        else{
            textView_animation.setText("S\nL\nI\nD\nE");
        }
        textView_animation.setBackgroundColor(Color.parseColor("#ff6600"));
    }

    public void rotate(){
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        button_mouse_4.startAnimation(animation);

        int orientation=this.getResources().getConfiguration().orientation;
        if(orientation== Configuration.ORIENTATION_PORTRAIT){
            textView_animation.setText("ROTATE");
        }
        else{
            textView_animation.setText("R\nO\nT\nA\nT\nE");
        }
        textView_animation.setBackgroundColor(Color.parseColor("#ff0066"));
    }

    public void bounce(){
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        button_mouse_5.startAnimation(animation);

        int orientation=this.getResources().getConfiguration().orientation;
        if(orientation== Configuration.ORIENTATION_PORTRAIT){
            textView_animation.setText("BOUNCE");
        }
        else{
            textView_animation.setText("B\nO\nU\nN\nC\nE");
        }
        textView_animation.setBackgroundColor(Color.parseColor("#e6e600"));
    }

    public void enlarge(){
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.enlarge);
        button_mouse_6.startAnimation(animation);

        int orientation=this.getResources().getConfiguration().orientation;
        if(orientation== Configuration.ORIENTATION_PORTRAIT){
            textView_animation.setText("ENLARGE");
        }
        else{
            textView_animation.setText("E\nN\nL\nA\nR\nG\nE");
        }
        textView_animation.setBackgroundColor(Color.parseColor("#3385ff"));
    }

}
