package com.example.bliss_ride;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.renderscript.Sampler;

import com.github.paolorotolo.appintro.AppIntro;

public class IntroActi extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(SampleSlide.newInstance(R.layout.welcome1));
        addSlide(SampleSlide.newInstance(R.layout.welcome2));
        addSlide(SampleSlide.newInstance(R.layout.welcome3));
        showSkipButton(true);


        setBarColor(Color.parseColor("#00bfd8"));
        setSeparatorColor(Color.parseColor("#00bfd8"));

    }

    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
        Intent i=new Intent(IntroActi.this,Login.class);
        startActivity(i);
        finish();
    }

    @Override
    public void onNextPressed() {
        // Do something when users tap on Next button.
    }

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
        Intent i=new Intent(IntroActi.this,Login.class);
        startActivity(i);
        finish();
    }

    @Override
    public void onSlideChanged() {
        // Do something when slide is changed
    }
}
