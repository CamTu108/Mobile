package com.example.ex2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    private colorAdapter colorAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2=findViewById(R.id.id_viewPager2);
        tabLayout=findViewById(R.id.id_tabLayout);
        colorAdapter=new colorAdapter(this);
        viewPager2.setAdapter(colorAdapter);
        TabLayoutMediator mediator=new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Blue");
                        break;
                    case 1:
                        tab.setText("Grey");
                        break;
                    case 2:
                        tab.setText("Green");
                        break;
                    case 3:
                        tab.setText("Red");
                        break;
                }
            }
        });
        mediator.attach();
    }
}