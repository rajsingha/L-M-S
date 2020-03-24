package com.lms.android.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.lms.android.app.ConstantModules.Constant;
import com.lms.android.app.DrawerModel.DashboardActvity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(() -> {
            Intent i = new Intent(SplashScreen.this, DashboardActvity.class);
            SplashScreen.this.startActivity(i);
            SplashScreen.this.finish();
        },5000);
    }
}


