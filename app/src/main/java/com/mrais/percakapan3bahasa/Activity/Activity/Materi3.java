package com.mrais.percakapan3bahasa.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter1;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter2;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter3;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter4;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter5;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter6;
import com.mrais.percakapan3bahasa.Activity.Materi3.BahasaArabBab1;
import com.mrais.percakapan3bahasa.Activity.Materi3.BahasaArabBab2;
import com.mrais.percakapan3bahasa.Activity.Materi3.BahasaArabBab3;
import com.mrais.percakapan3bahasa.Activity.Materi3.BahasaArabBab4;
import com.mrais.percakapan3bahasa.Activity.Materi3.BahasaArabBab5;
import com.mrais.percakapan3bahasa.Activity.Materi3.BahasaArabBab6;
import com.mrais.percakapan3bahasa.R;
import com.shrikanthravi.customnavigationdrawer2.data.MenuItem;
import com.shrikanthravi.customnavigationdrawer2.widget.SNavigationDrawer;

import java.util.ArrayList;
import java.util.List;

public class Materi3 extends AppCompatActivity {

    SNavigationDrawer sNavigationDrawer;
    int color1 = 0;
    Class fragmentClass;
    public static Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi3);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        sNavigationDrawer = findViewById(R.id.navigationDrawer);
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("BAB 1", R.drawable.news_bg));
        menuItems.add(new MenuItem("BAB 2", R.drawable.feed_bg));
        menuItems.add(new MenuItem("BAB 3", R.drawable.message_bg));
        menuItems.add(new MenuItem("BAB 4", R.drawable.music_bg));
        menuItems.add(new MenuItem("BAB 5", R.drawable.music_bg));
        menuItems.add(new MenuItem("BAB 6", R.drawable.music_bg));
        sNavigationDrawer.setMenuItemList(menuItems);
        fragmentClass = BahasaArabBab1.class;
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out).replace(R.id.frameLayout, fragment).commit();
        }

        sNavigationDrawer.setOnMenuItemClickListener(new SNavigationDrawer.OnMenuItemClickListener() {
            @Override
            public void onMenuItemClicked(int position) {
                System.out.println("Position " + position);

                switch (position) {
                    case 0: {
                        color1 = R.color.red;
                        fragmentClass = BahasaArabBab1.class;
                        break;
                    }
                    case 1: {
                        color1 = R.color.orange;
                        fragmentClass = BahasaArabBab2.class;
                        break;
                    }
                    case 2: {
                        color1 = R.color.green;
                        fragmentClass = BahasaArabBab3.class;
                        break;
                    }
                    case 3: {
                        color1 = R.color.blue;
                        fragmentClass = BahasaArabBab4.class;
                        break;
                    }
                    case 4: {
                        color1 = R.color.blue;
                        fragmentClass = BahasaArabBab5.class;
                        break;
                    }
                    case 5: {
                        color1 = R.color.blue;
                        fragmentClass = BahasaArabBab6.class;
                        break;
                    }
                }
                sNavigationDrawer.setDrawerListener(new SNavigationDrawer.DrawerListener() {

                    @Override
                    public void onDrawerOpened() {

                    }

                    @Override
                    public void onDrawerOpening() {

                    }

                    @Override
                    public void onDrawerClosing() {
                        System.out.println("Drawer closed");

                        try {
                            fragment = (Fragment) fragmentClass.newInstance();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        if (fragment != null) {
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            fragmentManager.beginTransaction().setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out).replace(R.id.frameLayout, fragment).commit();

                        }
                    }

                    @Override
                    public void onDrawerClosed() {

                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {
                        System.out.println("State " + newState);
                    }
                });
            }
        });
    }
}
