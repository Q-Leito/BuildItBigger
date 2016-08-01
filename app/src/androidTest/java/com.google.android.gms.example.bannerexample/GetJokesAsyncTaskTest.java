package com.google.android.gms.example.bannerexample;

import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by Q_Lei on 8/1/2016.
 */
public class GetJokesAsyncTaskTest extends AndroidTestCase {
    public void testVerifyRetrievalNonEmptyString() {
        GetJokesAsyncTask getJokeAsyncTask = new GetJokesAsyncTask();
        getJokeAsyncTask.execute();

        String joke = null;
        try {
            joke = getJokeAsyncTask.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        assertThat(joke, notNullValue());
        assertTrue(joke.length() > 0);
    }
}
