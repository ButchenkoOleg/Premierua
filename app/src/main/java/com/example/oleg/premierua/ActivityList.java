package com.example.oleg.premierua;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import com.example.oleg.premierua.gui.MenuExpandableList;

/**
 * Created by oleg on 19.04.16.
 */
public class ActivityList extends Activity {

    private static String GROUP_ADVERTISEMENT;

    private static MenuExpandableList menuExpandableList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_list);

        Intent intent = getIntent();
        GROUP_ADVERTISEMENT = intent.getStringExtra(MainActivity.GROUP_ADVERTISEMENT);

        menuExpandableList = new MenuExpandableList(this, GROUP_ADVERTISEMENT);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
