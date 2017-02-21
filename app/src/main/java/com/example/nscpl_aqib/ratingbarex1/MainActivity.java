package com.example.nscpl_aqib.ratingbarex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerOnButtonClick();
    }
    public void addListnerOnButtonClick(){
        ratingBar= (RatingBar) findViewById(R.id.ratingBar);
        button= (Button) findViewById(R.id.bt1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating=String.valueOf(ratingBar.getRating());
             Toast.makeText(MainActivity.this, "the rating is"+rating, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
