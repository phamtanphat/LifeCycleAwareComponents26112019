package com.example.lifeawarecomponents26112019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    MyLifeCycleListener myLifeCycleListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLifeCycleListener = new MyLifeCycleListener();
        getLifecycle().addObserver(myLifeCycleListener);
    }
}
