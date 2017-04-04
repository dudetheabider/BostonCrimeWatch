package com.chobar.bostoncrimewatch.bostoncrimewatch;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;
import com.twitter.sdk.android.Twitter;


public class MainPageActivity extends AppCompatActivity {
    ListView listView;

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "j4ygIEFSOgmZqkvpeZfTZUFGb";
    private static final String TWITTER_SECRET = "yDAZMGQh9YdHXJf5ot8CjWJHtENwukxlAIWF4EpPUmT2vcav0U";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Twitter Auth
        final TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric fabric = Fabric.with(this, new Twitter(authConfig));

        // View Initialize
        setContentView(R.layout.main);

        // Twitter Feed
        listView = (ListView) findViewById(R.id.list);
        UserTimeline userTimeline = new UserTimeline.Builder()
                .screenName("bostonpolice")
                .build();
        TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(this)
                .setTimeline(userTimeline)
                .build();
        listView.setAdapter(adapter);

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
                        startActivity(new Intent(MainPageActivity.this, CrimeMap.class));
                    }
                }

        );

        Button crime_list = (Button) findViewById(R.id.crimeList);
        crime_list.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(MainPageActivity.this, CrimeList.class));
                    }
                }

        );

        Button news = (Button) findViewById(R.id.news);
        news.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(MainPageActivity.this, News.class));
                    }
                }

        );

        Button report = (Button) findViewById(R.id.report);
        report.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(MainPageActivity.this, Report.class));
                    }
                }
        );

        Button aboutus = (Button) findViewById(R.id.aboutus);
        aboutus.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(MainPageActivity.this, AboutUs.class));
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
                        startActivity(new Intent(MainPageActivity.this, CrimeMap.class));
                    }
                }

        );

        Button report2 = (Button) findViewById(R.id.report2);
        report2.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(MainPageActivity.this, Report.class));
                    }
                }
        );

        Button news2 = (Button) findViewById(R.id.news2);
        news2.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(MainPageActivity.this, News.class));
                    }
                }

        );

        Button aboutus2 = (Button) findViewById(R.id.aboutus2);
        aboutus2.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        startActivity(new Intent(MainPageActivity.this, AboutUs.class));
                    }
                }
        );
    }

}
