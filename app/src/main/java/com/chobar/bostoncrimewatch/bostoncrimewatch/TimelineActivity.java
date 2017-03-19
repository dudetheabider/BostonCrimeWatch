package com.chobar.bostoncrimewatch.bostoncrimewatch;

import android.os.Bundle;
import android.app.ListActivity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.*;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;
import io.fabric.sdk.android.Fabric;



public class TimelineActivity extends ListActivity {
    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "Bj74J6Z48naa2esTODkxXKL76";
    private static final String TWITTER_SECRET = "uJfgd2DuXLVrvbIhDRnALIcmczYeZZVXeMIz1T2EWh12vjIrGT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        setContentView(R.layout.timeline);
        final UserTimeline userTimeline = new UserTimeline.Builder()
                .screenName("fabric")
                .build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(this)
                .setTimeline(userTimeline)
                .build();
        setListAdapter(adapter);
    }
}