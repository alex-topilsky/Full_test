package com.alexander_topilskii.full_test.lifecycle;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.alexander_topilskii.full_test.logging.MyLogger;

public class MyService extends Service{
    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        MyLogger.log(this, "onStart");
    }

    @Override
    public ComponentName startService(Intent service) {
        MyLogger.log(this, "startService");
        return super.startService(service);
    }

    @Override
    public boolean stopService(Intent name) {
        MyLogger.log(this, "stopService");
        return super.stopService(name);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        MyLogger.log(this, "onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        MyLogger.log(this, "onDestroy");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        MyLogger.log(this, "onLowMemory");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        MyLogger.log(this, "onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        MyLogger.log(this, "onTrimMemory");
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        MyLogger.log(this, "onRebind");
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        MyLogger.log(this, "onTaskRemoved");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        MyLogger.log(this, "onConfigurationChanged");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        MyLogger.log(this, "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    public MyService() {
        super();
        MyLogger.log(this, "MyService constructror");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        MyLogger.log(this, "onBind");
        return null;
    }
}
