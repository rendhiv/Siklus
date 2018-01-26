package com.mobiledev.sky.siklus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onDestroy(){
        // TODO Auto-generated method stub
        super.onDestroy();
        Toast.makeText(this, "App onDestroy", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){
        // TODO Auto-generated method stub
        super.onPause();
        Toast.makeText(this, "App onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart(){
        // TODO Auto-generated method stub
        super.onRestart();
        Toast.makeText(this, "App onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        // TODO Auto-generated method stub
        super.onResume();
        Toast.makeText(this, "App onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart(){
        // TODO Auto-generated method stub
        super.onStart();
        Toast.makeText(this, "App onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
