package Tests;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;

import com.example.cs110sau.dejaphoto.MainActivity;

import org.junit.Rule;
import org.junit.Test;

/**
 * Created by Oscar on 6/9/17.
 */

public class AsyncTaskRunnerTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivity = new ActivityTestRule<MainActivity>(MainActivity.class);
    private Context context = InstrumentationRegistry.getTargetContext();

    @Test
    public void testDoInBackground(){

    }

    @Test
    public void testOnPostExecute(){

    }

    @Test
    public void testOnPreExecute(){

    }

    @Test
    public void testonProgressUpdate(){

    }
}
