package com.example.smartmirrorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;

import com.example.smartmirrorapp.menu.AboutUs;
import com.example.smartmirrorapp.menu.FAQ;
import com.example.smartmirrorapp.menu.Music;
import com.example.smartmirrorapp.menu.Notifications;
import com.example.smartmirrorapp.menu.Settings;
import com.google.android.material.navigation.NavigationView;

public class SlideDrawerActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slider_drawer_activity);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);
        navigationView.bringToFront();
    }

    @Override
    public void onBackPressed() {
        //prevent closing
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
}
/*@Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                /*switch (menuItem.getItemId()) {
                    case R.id.nav_news:
                        break;
                    case R.id.nav_notifications:
                        Intent notifications = new Intent(SlideDrawerActivity.this, Notifications.class);
                        startActivity(notifications);
                        break;
                    case R.id.nav_music:
                        Intent music = new Intent(SlideDrawerActivity.this, Music.class);
                        startActivity(music);
                        break;
                    case R.id.nav_settings:
                        Intent settings = new Intent(SlideDrawerActivity.this, Settings.class);
                        startActivity(settings);
                        break;
                    case R.id.nav_about_us:
                        Intent about_us = new Intent(SlideDrawerActivity.this, AboutUs.class);
                        startActivity(about_us);
                        break;
                    case R.id.nav_FAQ:
                        Intent faq = new Intent(SlideDrawerActivity.this, FAQ.class);
                        startActivity(faq);
                        break;
                }
                drawerLayout.closeDrawer(GravityCompat.START); return true;
                        }

 */