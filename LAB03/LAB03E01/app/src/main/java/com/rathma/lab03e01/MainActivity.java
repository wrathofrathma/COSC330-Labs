package com.rathma.lab03e01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String firstLaunched;
    private String userLeaveMsg;
    private String startMsg;
    private String resumeMsg;
    private String rotateMsg;
    private String restartMsg;
    private String pauseMsg;

    private boolean launched=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstLaunched = "App was first launched";
        userLeaveMsg = "User left";
        startMsg = "App started";
        restartMsg = "App restarted";
        resumeMsg = "Resumed";
        pauseMsg = "Paused";
        rotateMsg = "Rotated";
        Toast.makeText(this,firstLaunched, Toast.LENGTH_SHORT).show();
    }

//    @Override
//    protected void onStart(){
//        super.onStart();
//        Toast.makeText(this, firstLaunched, Toast.LENGTH_SHORT).show();
//    }
    @Override
    protected void onUserLeaveHint(){
        super.onUserLeaveHint();
        Toast.makeText(this,userLeaveMsg,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onConfigurationChanged(Configuration newconfig){
        super.onConfigurationChanged(newconfig);
        if(newconfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(this, rotateMsg, Toast.LENGTH_SHORT).show();
        }
        else if(newconfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, rotateMsg, Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void onPause(){
        super.onPause();
        Toast.makeText(this,pauseMsg,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Toast.makeText(this,restartMsg,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStart(){
        super.onStart();
        Toast.makeText(this,startMsg,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onResume(){
        super.onResume();
        if(launched)
            Toast.makeText(this,resumeMsg,Toast.LENGTH_SHORT).show();
        launched=true;
    }
}
