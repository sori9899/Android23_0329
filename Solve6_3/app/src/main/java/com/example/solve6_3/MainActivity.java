package com.example.solve6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabWidget;

public class MainActivity extends AppCompatActivity {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Solve 6-3");

        tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tabDog = tabHost.newTabSpec("Dog").setIndicator("강아지");
        tabDog.setContent(R.id.tabDog);
        tabHost.addTab(tabDog);

        TabHost.TabSpec tabCat = tabHost.newTabSpec("Cat").setIndicator("고양이");
        tabCat.setContent(R.id.tabCat);
        tabHost.addTab(tabCat);

        TabHost.TabSpec tabDuck = tabHost.newTabSpec("Duck").setIndicator("오리");
        tabDuck.setContent(R.id.tabDuck);
        tabHost.addTab(tabDuck);

        TabHost.TabSpec tabCow = tabHost.newTabSpec("Cow").setIndicator("소");
        tabCow.setContent(R.id.tabCow);
        tabHost.addTab(tabCow);

        tabHost.setCurrentTab(0);

    }
}