package com.example.myapplication;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Main_danhsach  extends AppCompatActivity {

    private BottomNavigationView mNavigationView;
    private ViewPager mViewPager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsach);

        mNavigationView=findViewById(R.id.bottomnav);
        mViewPager = findViewById(R.id.viewpaper);

        setUpViewPaper();


        mNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        mViewPager.setCurrentItem(0);
                        break;
                    case R.id.profile:
                        mViewPager.setCurrentItem(1);
                        break;
                    case R.id.setting:
                        mViewPager.setCurrentItem(2);
                        break;
                }
                return true;
            }
        });


    }
    private void setUpViewPaper(){
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(
                getSupportFragmentManager(),FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        };
        mViewPager.setAdapter(viewPagerAdapter);


    }
}
