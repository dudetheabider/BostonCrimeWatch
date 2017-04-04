package com.chobar.bostoncrimewatch.bostoncrimewatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class CrimeMap extends AppCompatActivity {

    public void main(View view) {
        LinearLayout navLayout = (LinearLayout) findViewById(R.id.expLayout);
        navLayout.setVisibility(View.GONE);
        Intent intent = new Intent(this, MainPageActivity.class);
        startActivity(intent);
    }

    public void map(View view) {
        LinearLayout navLayout = (LinearLayout) findViewById(R.id.expLayout);
        navLayout.setVisibility(View.GONE);
        Intent intent = new Intent(this, CrimeMap.class);
        startActivity(intent);
    }

    public void list(View view) {
        LinearLayout navLayout = (LinearLayout) findViewById(R.id.expLayout);
        navLayout.setVisibility(View.GONE);
        Intent intent = new Intent(this, CrimeList.class);
        startActivity(intent);
    }

    public void news(View view) {
        LinearLayout navLayout = (LinearLayout) findViewById(R.id.expLayout);
        navLayout.setVisibility(View.GONE);
        Intent intent = new Intent(this, News.class);
        startActivity(intent);
    }

    public void report(View view) {
        LinearLayout navLayout = (LinearLayout) findViewById(R.id.expLayout);
        navLayout.setVisibility(View.GONE);
        Intent intent = new Intent(this, Report.class);
        startActivity(intent);
    }

    public void about(View view) {
        LinearLayout navLayout = (LinearLayout) findViewById(R.id.expLayout);
        navLayout.setVisibility(View.GONE);
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // View Initialize
        setContentView(R.layout.map);

        // Nav Expansion/Contraction
        ImageButton navigation = (ImageButton) findViewById(R.id.navBtn);
        final LinearLayout navLayout = (LinearLayout) findViewById(R.id.expLayout);
        navigation.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                if (navLayout.getVisibility() == View.VISIBLE)
                                {
                                    navLayout.setVisibility(View.GONE);
                                }
                                else
                                {
                                    navLayout.setVisibility(View.VISIBLE);
                                }
                            }
                        }
                );
    }

}
