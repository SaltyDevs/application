package com.example.smartmirrorapp.slide;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smartmirrorapp.R;
import com.example.smartmirrorapp.menu.AboutUsFragment;
import com.example.smartmirrorapp.menu.FAQFragment;
import com.example.smartmirrorapp.menu.MusicFragment;
import com.example.smartmirrorapp.menu.NewsFragment;
import com.example.smartmirrorapp.menu.NotificationsFragment;
import com.example.smartmirrorapp.menu.SettingsFragment;
import com.google.android.material.navigation.NavigationView;
import com.yarolegovich.slidingrootnav.SlidingRootNav;
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder;

import java.util.Arrays;

public class SlideDrawerActivity extends AppCompatActivity implements DrawerAdapter.OnItemSelectedListener{
    private static final int POS_CLOSE = 0;
    private static final int POS_NEWS = 1;
    private static final int POS_NOTIFICATION = 2;
    private static final int POS_MUSIC = 3;
    private static final int POS_SETTINGS = 4;
    private static final int POS_ABOUT_US = 5;
    private static final int POS_FAQ = 7;
    private String[] screenTitles;
    private Drawable[] screenIcons;
    private SlidingRootNav slidingRootNav;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        slidingRootNav = new SlidingRootNavBuilder(this)
                .withDragDistance(100)
                .withRootViewScale(0.75f)
                .withRootViewElevation(25)
                .withToolbarMenuToggle(toolbar)
                .withSavedState(savedInstanceState)
                .withMenuLayout(R.layout.drawer_menu)
                .inject();
        screenIcons = loadScreenIcons();
        screenTitles = loadScreenTitles();
        DrawerAdapter adapter = new DrawerAdapter(Arrays.asList(
                createItemFor(POS_CLOSE),
                createItemFor(POS_NEWS),
                createItemFor(POS_NOTIFICATION).setChecked(true),
                createItemFor(POS_MUSIC),
                createItemFor(POS_SETTINGS),
                createItemFor(POS_ABOUT_US),
                createItemFor(POS_FAQ)
        ));
        adapter.setListener(this);
        RecyclerView list = findViewById(R.id.drawer_list);
        list.setNestedScrollingEnabled(false);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adapter);
        adapter.setSelected(POS_NOTIFICATION);
    }
    private DrawerItem createItemFor(int position){/////////////////////////////////////////////////
        return new SimpleItem(screenIcons[position],screenTitles[position])
                .withIconTint(R.color.colorPrimaryDark)
                .withTextTint(R.color.colorPrimary)
                .withSelectedIconTint(R.color.colorAccent)
                .withSelectedTextTint(R.color.colorPrimary);
    }
    @ColorInt
    private int color(@ColorRes int res){
        return ContextCompat.getColor(this, res);
    }
    private String[] loadScreenTitles() {
        return getResources().getStringArray(R.array.id_activityScreenTitles);
    }
    private Drawable[] loadScreenIcons() {
        TypedArray ta = getResources().obtainTypedArray(R.array.id_activityScreenIcons);
        Drawable[] icons = new Drawable[ta.length()];
        for(int i = 0; i < ta.length(); i++){
            int id =ta.getResourceId(i,0);
            if(id!=0){
                icons[i] = ContextCompat.getDrawable(this,id);
            }
        }
        ta.recycle();
        return icons;
    }
    @Override
    public void onBackPressed() {
        finish();
    }
    @Override
    public void onItemSelected(int position) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if(position == POS_NEWS){
            NewsFragment newsFragment = new NewsFragment();
            transaction.replace(R.id.container, newsFragment);
        }else if(position == POS_NOTIFICATION){
            NotificationsFragment notificationsFragment = new NotificationsFragment();
            transaction.replace(R.id.container, notificationsFragment);
        }else if(position == POS_MUSIC){
            MusicFragment musicFragment = new MusicFragment();
            transaction.replace(R.id.container, musicFragment);
        }else if(position == POS_SETTINGS){
            SettingsFragment settingsFragment = new SettingsFragment();
            transaction.replace(R.id.container, settingsFragment);
        }else if(position == POS_ABOUT_US){
            AboutUsFragment aboutUsFragment = new AboutUsFragment();
            transaction.replace(R.id.container, aboutUsFragment);
        }else if(position == POS_FAQ){
            FAQFragment faqFragment = new FAQFragment();
            transaction.replace(R.id.container, faqFragment);
        }
        slidingRootNav.closeMenu();
        transaction.addToBackStack(null);
        transaction.commit();
    }
}