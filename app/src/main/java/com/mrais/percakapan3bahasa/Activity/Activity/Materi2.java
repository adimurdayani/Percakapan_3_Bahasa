package com.mrais.percakapan3bahasa.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.mrais.percakapan3bahasa.Activity.Materi.Bab1Fragment;
import com.mrais.percakapan3bahasa.Activity.Materi.Bab2Fragment;
import com.mrais.percakapan3bahasa.Activity.Materi.Bab3Fragment;
import com.mrais.percakapan3bahasa.Activity.Materi.Bab4Fragment;
import com.mrais.percakapan3bahasa.Activity.Materi.Bab5Fragment;
import com.mrais.percakapan3bahasa.Activity.Materi.Bab6Fragment;
import com.mrais.percakapan3bahasa.Activity.Materi.Bab7Fragment;
import com.mrais.percakapan3bahasa.Activity.Materi.Bab8Fragment;
import com.mrais.percakapan3bahasa.Activity.Materi.Bab9Fragment;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter1;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter10;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter11;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter12;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter2;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter3;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter4;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter5;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter6;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter7;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter8;
import com.mrais.percakapan3bahasa.Activity.Materi2.Chapter9;
import com.mrais.percakapan3bahasa.R;
import com.shrikanthravi.customnavigationdrawer2.data.MenuItem;
import com.shrikanthravi.customnavigationdrawer2.widget.SNavigationDrawer;

import java.util.ArrayList;
import java.util.List;

public class Materi2 extends AppCompatActivity {

    SNavigationDrawer sNavigationDrawer;
    int color1=0;
    Class fragmentClass;
    public static Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi2);

        if(getSupportActionBar()!=null) {
            getSupportActionBar().hide();
        }

        sNavigationDrawer = findViewById(R.id.navigationDrawer);
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Chapter 1",R.drawable.news_bg));
        menuItems.add(new MenuItem("Chapter 2",R.drawable.feed_bg));
        menuItems.add(new MenuItem("Chapter 3",R.drawable.message_bg));
        menuItems.add(new MenuItem("Chapter 4",R.drawable.music_bg));
        menuItems.add(new MenuItem("Chapter 5",R.drawable.music_bg));
        menuItems.add(new MenuItem("Chapter 6",R.drawable.music_bg));
//        menuItems.add(new MenuItem("Chapter 7",R.drawable.music_bg));
//        menuItems.add(new MenuItem("Chapter 8",R.drawable.music_bg));
//        menuItems.add(new MenuItem("Chapter 9",R.drawable.music_bg));
//        menuItems.add(new MenuItem("Chapter 10",R.drawable.music_bg));
//        menuItems.add(new MenuItem("Chapter 11",R.drawable.music_bg));
//        menuItems.add(new MenuItem("Chapter 12",R.drawable.music_bg));
        sNavigationDrawer.setMenuItemList(menuItems);
        fragmentClass =  Chapter1.class;
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
                System.out.println("Position "+position);

                switch (position){
                    case 0:{
                        color1 = R.color.red;
                        fragmentClass = Chapter1.class;
                        break;
                    }
                    case 1:{
                        color1 = R.color.orange;
                        fragmentClass = Chapter2.class;
                        break;
                    }
                    case 2:{
                        color1 = R.color.green;
                        fragmentClass = Chapter3.class;
                        break;
                    }
                    case 3:{
                        color1 = R.color.blue;
                        fragmentClass = Chapter4.class;
                        break;
                    }
                    case 4:{
                        color1 = R.color.blue;
                        fragmentClass = Chapter5.class;
                        break;
                    }
                    case 5:{
                        color1 = R.color.blue;
                        fragmentClass = Chapter6.class;
                        break;
                    }
//                    case 6:{
//                        color1 = R.color.blue;
//                        fragmentClass = Chapter7.class;
//                        break;
//                    }
//                    case 7:{
//                        color1 = R.color.blue;
//                        fragmentClass = Chapter8.class;
//                        break;
//                    }
//                    case 8:{
//                        color1 = R.color.blue;
//                        fragmentClass = Chapter9.class;
//                        break;
//                    }
//
//                    case 9:{
//                        color1 = R.color.blue;
//                        fragmentClass = Chapter10.class;
//                        break;
//                    }
//
//                    case 10:{
//                        color1 = R.color.blue;
//                        fragmentClass = Chapter11.class;
//                        break;
//                    }
//
//                    case 11:{
//                        color1 = R.color.blue;
//                        fragmentClass = Chapter12.class;
//                        break;
//                    }

                }
                sNavigationDrawer.setDrawerListener(new SNavigationDrawer.DrawerListener() {

                    @Override
                    public void onDrawerOpened() {

                    }

                    @Override
                    public void onDrawerOpening(){

                    }

                    @Override
                    public void onDrawerClosing(){
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
                        System.out.println("State "+newState);
                    }
                });
            }
        });
    }
}
