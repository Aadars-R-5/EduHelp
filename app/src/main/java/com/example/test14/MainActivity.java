package com.example.test14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private CardView gcollege,pcollege,pschool,gschool,review, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pcollege = (CardView) findViewById(R.id.pcollege);
        gcollege = (CardView) findViewById(R.id.gcollege);
        pschool = (CardView) findViewById(R.id.pschool);
        gschool = (CardView) findViewById(R.id.gschool);
        review = (CardView) findViewById(R.id.reviewid);
        about = (CardView) findViewById(R.id.aboutpage);



        gcollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GovtCollege();
            }
        });
        pcollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PrivCollege();
            }
        });
        pschool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, priv_school.class);
                startActivity(intent);
            }
        });
        gschool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, govt_school.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
        review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reviewActivity();
            }
        });
    }

    public void GovtCollege(){
        Intent intent = new Intent(this, GovtCollege.class);
        startActivity(intent);
    }

    public void PrivCollege(){
        Intent intent = new Intent(this, PrivCollege.class);
        startActivity(intent);
    }

    public void reviewActivity(){
        Intent intent = new Intent(this, otherOptions.class);
        startActivity(intent);
    }





    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }
}