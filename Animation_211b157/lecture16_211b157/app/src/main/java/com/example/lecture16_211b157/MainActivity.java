package com.example.lecture16_211b157;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isDog=true;
    public void change(View view)
    {
       ImageView imageView=findViewById(R.id.imageView);
       ImageView imageView2=findViewById(R.id.imageView2);
       if(isDog)
       {
           imageView.animate().alpha(1).setDuration(2000);
           imageView2.animate().alpha(0).setDuration(2000);
           isDog=false;
       }
       else
       {
           imageView.animate().alpha(0).setDuration(2000);
           imageView2.animate().alpha(1).setDuration(2000);
           isDog=true;
       }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}