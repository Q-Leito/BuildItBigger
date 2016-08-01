package com.example.displaylib;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {
    public static final String KEY_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        String joke = getIntent().getExtras().getString(KEY_JOKE);

        TextView jokeTextView = (TextView) findViewById(R.id.jokeTextView);
        jokeTextView.setText(joke);
    }

    public static Intent launchIntent(Context context, String tellJoke) {
        Intent intent = new Intent(context, LibraryActivity.class);
        intent.putExtra(KEY_JOKE, tellJoke);

        return intent;
    }
}
