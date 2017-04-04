package com.chobar.bostoncrimewatch.bostoncrimewatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class CrimeMap extends AppCompatActivity {

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

        // Nav Buttons
        Button crime_map = (Button) findViewById(R.id.crimeMap);
        crime_map.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(CrimeMap.this, CrimeMap.class));
                    }
                }

        );

        Button crime_list = (Button) findViewById(R.id.crimeList);
        crime_list.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(CrimeMap.this, CrimeList.class));
                    }
                }

        );

        Button news = (Button) findViewById(R.id.news);
        news.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(CrimeMap.this, News.class));
                    }
                }

        );

        Button report = (Button) findViewById(R.id.report);
        report.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(CrimeMap.this, Report.class));
                    }
                }
        );

        Button aboutus = (Button) findViewById(R.id.aboutus);
        aboutus.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(CrimeMap.this, AboutUs.class));
                    }
                }
        );

        // main Buttons

        Button crime_map2 = (Button) findViewById(R.id.crimeMap2);
        crime_map2.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(CrimeMap.this, CrimeMap.class));
                    }
                }

        );

        Button report2 = (Button) findViewById(R.id.report2);
        report2.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(CrimeMap.this, Report.class));
                    }
                }
        );

        Button news2 = (Button) findViewById(R.id.news2);
        news2.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(CrimeMap.this, News.class));
                    }
                }

        );

        Button aboutus2 = (Button) findViewById(R.id.aboutus2);
        aboutus2.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(CrimeMap.this, AboutUs.class));
                    }
                }
        );
    }

}
