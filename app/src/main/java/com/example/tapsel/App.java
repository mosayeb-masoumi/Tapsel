package com.example.tapsel;

import android.app.Application;

import ir.tapsell.sdk.Tapsell;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
                                               // tapsel key
        Tapsell.initialize(this, "rpkabjbhaqtremjnohrreiroddmeebfreatfdffnotlchioolgdphqbatsgqketqaptftg");
    }
}
