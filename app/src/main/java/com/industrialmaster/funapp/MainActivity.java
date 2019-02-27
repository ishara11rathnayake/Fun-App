package com.industrialmaster.funapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //you can use this & MainActivity.this for getApplicationContext()
    public void openActivity(View view){
        Intent intent = new Intent(getApplicationContext(), ActivityActivity.class);
        startActivity(intent);
    }

    public void openService(View view){
        Intent intent = new Intent(getApplicationContext(), ServiceActivity.class);
        startActivity(intent);
    }

    public void openContentProvider(View view){
        Intent intent = new Intent(getApplicationContext(), ContentProviderActivity.class);
        startActivity(intent);
    }

    public void openBroadcastReceiver(View view){
        Intent intent = new Intent(getApplicationContext(), BroadcastReceiverActivity.class);
        startActivity(intent);
    }

}
