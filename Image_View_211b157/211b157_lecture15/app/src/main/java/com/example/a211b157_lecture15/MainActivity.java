package com.example.a211b157_lecture15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isflower=true;
    public void change(View view)
    {
        ImageView iv=findViewById(R.id.imageView2);
        if(isflower)
        {
            iv.setImageResource(R.drawable.dog);
            isflower=false;
        }
        else {
            iv.setImageResource(R.drawable.flower);
            isflower = true;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}