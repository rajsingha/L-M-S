package com.lms.android.app.DrawerModel;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import com.lms.android.app.Activities.ClassNotesActivity;
import com.lms.android.app.Models.CustomLoadingDialog;
import com.lms.android.app.R;
import com.lms.android.app.databinding.CustomGearLoadingDialogBoxBinding;

public class DashboardActvity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    CustomLoadingDialog customLoadingDialog;
    CardView cardView_class_notes;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
       /* Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);*/

        drawerLayout =findViewById(R.id.dashboard_drawerLayout);
        navigationView = findViewById(R.id.nav_view);
        toolbar= findViewById(R.id.dashboard_toolbar);

        customLoadingDialog = new CustomLoadingDialog(DashboardActvity.this);


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        navigationView.bringToFront();
        toolbar.setNavigationIcon(R.drawable.ic_menu_);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        cardView_class_notes = findViewById(R.id.class_notes_cardView);

        cardView_class_notes.setOnClickListener(v -> {
            Intent i = new Intent(this, ClassNotesActivity.class);
            startActivity(i);
        });


        /*customLoadingDialog.startLoadingDialog();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                customLoadingDialog.dismissLoadingDialog();
            }
        },10000);*/






        

    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {

            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }
}
