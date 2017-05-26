package jakekyung.com.webview;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by Jake on 2017-05-26.
 */

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager =getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        WebviewFragment webviewFragment = new WebviewFragment();
        fragmentTransaction.add(R.id.frame_container, webviewFragment).commit();

    }
}
