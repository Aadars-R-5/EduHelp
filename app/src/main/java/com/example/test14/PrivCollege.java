package com.example.test14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

public class PrivCollege extends AppCompatActivity {

    CardView cardView, cardView2, cardView3, cardView4, cardView5;
    ImageView imageView,backhome2;
    TextView textView, textView2, textView3, textView4, textView5;
    SearchView searchView;

    Animation anim_from_button, anim_from_top, anim_from_left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priv_college);
        cardView = findViewById(R.id.mariv);
        cardView2 = findViewById(R.id.mbcet);
        cardView3 = findViewById(R.id.ace);
        cardView4 = findViewById(R.id.jcmcsiit);
        cardView5 = findViewById(R.id.asb);
        //imageView = findViewById(R.id.imageView);
        backhome2 = findViewById(R.id.backtohomepg1);
        textView = findViewById(R.id.firstTextpg1);
        textView2 = findViewById(R.id.textViewpg1);
        textView3 = findViewById(R.id.textView2pg1);
        textView4 = findViewById(R.id.textView3pg1);
        textView5 = findViewById(R.id.textView4pg1);
        //searchView = findViewById(R.id.searchView);

        //Load Animations
        anim_from_button = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom);
        anim_from_top = AnimationUtils.loadAnimation(this, R.anim.anim_from_top);
        anim_from_left = AnimationUtils.loadAnimation(this, R.anim.anim_from_left);

        //Set Animations
        cardView.setAnimation(anim_from_button);
        cardView2.setAnimation(anim_from_button);
        cardView3.setAnimation(anim_from_button);
        cardView4.setAnimation(anim_from_button);
        cardView5.setAnimation(anim_from_button);
        //imageView.setAnimation(anim_from_top);
        textView.setAnimation(anim_from_top);
        textView2.setAnimation(anim_from_top);
        textView3.setAnimation(anim_from_top);
        textView4.setAnimation(anim_from_top);
        textView5.setAnimation(anim_from_top);
        //searchView.setAnimation(anim_from_left);

        backhome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrivCollege.this, MainActivity.class);
                startActivity(intent);
            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity = new Intent(PrivCollege.this, marivan2.class);
                startActivity(secondActivity);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity = new Intent(PrivCollege.this, mbcet2.class);
                startActivity(secondActivity);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity = new Intent(PrivCollege.this, ace2.class);
                startActivity(secondActivity);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity = new Intent(PrivCollege.this, jcmcsiit2.class);
                startActivity(secondActivity);
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity = new Intent(PrivCollege.this, asb2.class);
                startActivity(secondActivity);
            }
        });

        //Hide status bar and navigation bar at the bottom
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        this.getWindow().getDecorView().setSystemUiVisibility(

                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY

        );

    }
}
