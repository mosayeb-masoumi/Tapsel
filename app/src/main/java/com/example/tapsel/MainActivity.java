package com.example.tapsel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import ir.tapsell.sdk.Tapsell;
import ir.tapsell.sdk.TapsellAdRequestListener;
import ir.tapsell.sdk.TapsellAdRequestOptions;
import ir.tapsell.sdk.TapsellAdShowListener;
import ir.tapsell.sdk.TapsellShowOptions;


import static ir.tapsell.sdk.TapsellAdActivity.ZONE_ID;

public class MainActivity extends AppCompatActivity {

    Button btn_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_video = findViewById(R.id.btn_video);

        btn_video.setOnClickListener(view -> Tapsell.requestAd(MainActivity.this,
                "6017d2a8fb593e0001913c5b",    // شناسه ی تبلیغگاه دریافت از پنل
                new TapsellAdRequestOptions(),
                new TapsellAdRequestListener() {
                    @Override
                    public void onAdAvailable(String adId) {

                        showVideo(adId);
                    }

                    @Override
                    public void onError(String message) {
                        Log.i("TAG", "onError: ");
                    }
                }));


    }

    private void showVideo(String adId) {

        Tapsell.showAd(MainActivity.this,
                "6017d2a8fb593e0001913c5b", // شناسه ی تبلیغگاه دریافت از پنل
                adId,
                new TapsellShowOptions(),
                new TapsellAdShowListener() {
                    @Override
                    public void onOpened() {

                        Log.i("TAG", "onOpened: ");
                    }

                    @Override
                    public void onClosed() {

                        Log.i("TAG", "onOpened: ");
                    }

                    @Override
                    public void onError(String message) {

                        Log.i("TAG", "onOpened: ");
                    }

                    @Override
                    public void onRewarded(boolean completed) {
                        Log.i("TAG", "onOpened: ");
                    }
                });
    }
}