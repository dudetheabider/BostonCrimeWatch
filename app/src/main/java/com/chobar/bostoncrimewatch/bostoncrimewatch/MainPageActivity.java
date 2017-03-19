package com.chobar.bostoncrimewatch.bostoncrimewatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;


public class MainPageActivity extends AppCompatActivity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "j4ygIEFSOgmZqkvpeZfTZUFGb";
    private static final String TWITTER_SECRET = "yDAZMGQh9YdHXJf5ot8CjWJHtENwukxlAIWF4EpPUmT2vcav0U";

    public void openTweets(View view) {
        Intent startNewActivity = new Intent(this, TimelineActivity.class);
        startActivity(startNewActivity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        setContentView(R.layout.activity_main_page);
    }


}
