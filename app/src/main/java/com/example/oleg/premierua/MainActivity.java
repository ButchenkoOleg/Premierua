package com.example.oleg.premierua;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    static final String GROUP_BUSINESS = "Business";
    static final String GROUP_INDIVIDUAL= "Individual";
    static final String GROUP_ADVERTISEMENT = "GroupAdvertisement";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick (View view){
        Intent intent = new Intent(this, ActivityList.class);
        switch (view.getId()) {
            case R.id.btnBusiness :
                intent.putExtra(GROUP_ADVERTISEMENT, GROUP_BUSINESS);
                startActivity(intent);
                break;
            case R.id.btnIndividuals :
                intent.putExtra(GROUP_ADVERTISEMENT, GROUP_INDIVIDUAL);
                startActivity(intent);
                break;
        }

    }
}
