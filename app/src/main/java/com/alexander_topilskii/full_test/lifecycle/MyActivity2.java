package com.alexander_topilskii.full_test.lifecycle;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.LoaderManager;
import android.app.PendingIntent;
import android.app.SharedElementCallback;
import android.app.TaskStackBuilder;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.method.ScrollingMovementMethod;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Display;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.alexander_topilskii.full_test.logging.MyLogger;
import com.alexander_topilskii.full_test.MainActivity;
import com.alexander_topilskii.full_test.R;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

public class MyActivity2 extends MyActivity1 {
    TextView log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity2);
        goToMainBtn = (Button) findViewById(R.id.goToMainFromMyActivity);
        log = (TextView) findViewById(R.id.activity2_log);
        log.setMovementMethod(new ScrollingMovementMethod());

        goToMainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyActivity2.this, MainActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        MyLogger.log(this, "onStart");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MyLogger.log(this, "onRestart");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyLogger.log(this, "onResume");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onPause() {
        super.onPause();
        MyLogger.log(this, "onPause");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onStop() {
        super.onStop();
        MyLogger.log(this, "onStop");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyLogger.log(this, "onDestroy");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public Intent getIntent() {
        MyLogger.log(this, "getIntent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getIntent();
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        MyLogger.log(this, "setIntent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public WindowManager getWindowManager() {
        MyLogger.log(this, "getWindowManager");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getWindowManager();
    }

    @Override
    public Window getWindow() {
        MyLogger.log(this, "getWindow Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
        return super.getWindow();
    }

    @Override
    public LoaderManager getLoaderManager() {
        MyLogger.log(this, "getLoaderManager");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getLoaderManager();
    }

    @Nullable
    @Override
    public View getCurrentFocus() {
        MyLogger.log(this, "getCurrentFocus");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getCurrentFocus();
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        MyLogger.log(this, "onCreate");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        MyLogger.log(this, "onRestoreInstanceState");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        MyLogger.log(this, "onRestoreInstanceState");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        MyLogger.log(this, "onPostCreate");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        MyLogger.log(this, "onPostCreate");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onStateNotSaved() {
        super.onStateNotSaved();
        MyLogger.log(this, "onStateNotSaved");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        MyLogger.log(this, "onPostResume");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean isVoiceInteraction() {
        MyLogger.log(this, "isVoiceInteraction");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.isVoiceInteraction();
    }

    @Override
    public boolean isVoiceInteractionRoot() {
        MyLogger.log(this, "isVoiceInteractionRoot");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.isVoiceInteractionRoot();
    }

    @Override
    public VoiceInteractor getVoiceInteractor() {
        MyLogger.log(this, "getVoiceInteractor");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getVoiceInteractor();
    }

    @Override
    public boolean isLocalVoiceInteractionSupported() {
        MyLogger.log(this, "isLocalVoiceInteractionSupported");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.isLocalVoiceInteractionSupported();
    }

    @Override
    public void startLocalVoiceInteraction(Bundle privateOptions) {
        super.startLocalVoiceInteraction(privateOptions);
        MyLogger.log(this, "startLocalVoiceInteraction");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onLocalVoiceInteractionStarted() {
        super.onLocalVoiceInteractionStarted();
        MyLogger.log(this, "onLocalVoiceInteractionStarted");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onLocalVoiceInteractionStopped() {
        super.onLocalVoiceInteractionStopped();
        MyLogger.log(this, "onLocalVoiceInteractionStopped");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void stopLocalVoiceInteraction() {
        super.stopLocalVoiceInteraction();
        MyLogger.log(this, "stopLocalVoiceInteraction");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        MyLogger.log(this, "onNewIntent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        MyLogger.log(this, "onSaveInstanceState");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        MyLogger.log(this, "onSaveInstanceState");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        MyLogger.log(this, "onUserLeaveHint");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
        MyLogger.log(this, "onCreateThumbnail");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onCreateThumbnail(outBitmap, canvas);
    }

    @Nullable
    @Override
    public CharSequence onCreateDescription() {
        MyLogger.log(this, "onCreateDescription");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onCreateDescription();
    }

    @Override
    public void onProvideAssistData(Bundle data) {
        super.onProvideAssistData(data);
        MyLogger.log(this, "onProvideAssistData");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onProvideAssistContent(AssistContent outContent) {
        super.onProvideAssistContent(outContent);
        MyLogger.log(this, "onProvideAssistContent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
        super.onProvideKeyboardShortcuts(data, menu, deviceId);
        MyLogger.log(this, "onProvideKeyboardShortcuts");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean showAssist(Bundle args) {
        MyLogger.log(this, "showAssist");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.showAssist(args);
    }

    @Override
    public void reportFullyDrawn() {
        super.reportFullyDrawn();
        MyLogger.log(this, "reportFullyDrawn");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
        MyLogger.log(this, "onMultiWindowModeChanged");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean isInMultiWindowMode() {
        MyLogger.log(this, "isInMultiWindowMode");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.isInMultiWindowMode();
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        MyLogger.log(this, "onPictureInPictureModeChanged");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean isInPictureInPictureMode() {
        MyLogger.log(this, "isInPictureInPictureMode");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.isInPictureInPictureMode();
    }

    @Override
    public void enterPictureInPictureMode() {
        super.enterPictureInPictureMode();
        MyLogger.log(this, "enterPictureInPictureMode");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        MyLogger.log(this, "onConfigurationChanged");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public int getChangingConfigurations() {
        MyLogger.log(this, "getChangingConfigurations");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getChangingConfigurations();
    }

    @Nullable
    @Override
    public Object getLastNonConfigurationInstance() {
        MyLogger.log(this, "getLastNonConfigurationInstance");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getLastNonConfigurationInstance();
    }

    @Override
    public Object onRetainNonConfigurationInstance() {
        MyLogger.log(this, "onRetainNonConfigurationInstance");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onRetainNonConfigurationInstance();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        MyLogger.log(this, "onLowMemory");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        MyLogger.log(this, "onTrimMemory");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public FragmentManager getFragmentManager() {
        MyLogger.log(this, "getFragmentManager");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getFragmentManager();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        MyLogger.log(this, "onAttachFragment");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startManagingCursor(Cursor c) {
        super.startManagingCursor(c);
        MyLogger.log(this, "startManagingCursor");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void stopManagingCursor(Cursor c) {
        super.stopManagingCursor(c);
        MyLogger.log(this, "stopManagingCursor");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public View findViewById(int id) {
        MyLogger.log(this, "findViewById Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
        return super.findViewById(id);
    }

    @Nullable
    @Override
    public ActionBar getActionBar() {
        MyLogger.log(this, "getActionBar");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getActionBar();
    }

    @Override
    public void setActionBar(Toolbar toolbar) {
        super.setActionBar(toolbar);
        MyLogger.log(this, "setActionBar");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        MyLogger.log(this, "setContentView Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        MyLogger.log(this, "setContentView Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        MyLogger.log(this, "setContentView Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
        MyLogger.log(this, "addContentView");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public TransitionManager getContentTransitionManager() {
        MyLogger.log(this, "getContentTransitionManager");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getContentTransitionManager();
    }

    @Override
    public void setContentTransitionManager(TransitionManager tm) {
        super.setContentTransitionManager(tm);
        MyLogger.log(this, "setContentTransitionManager");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public Scene getContentScene() {
        MyLogger.log(this, "getContentScene");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getContentScene();
    }

    @Override
    public void setFinishOnTouchOutside(boolean finish) {
        super.setFinishOnTouchOutside(finish);
        MyLogger.log(this, "setFinishOnTouchOutside");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        MyLogger.log(this, "onKeyDown");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        MyLogger.log(this, "onKeyLongPress");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        MyLogger.log(this, "onKeyUp");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        MyLogger.log(this, "onKeyMultiple");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        MyLogger.log(this, "onBackPressed");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean onKeyShortcut(int keyCode, KeyEvent event) {
        MyLogger.log(this, "onKeyShortcut");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onKeyShortcut(keyCode, event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        MyLogger.log(this, "onTouchEvent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onTrackballEvent(MotionEvent event) {
        MyLogger.log(this, "onTrackballEvent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onTrackballEvent(event);
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        MyLogger.log(this, "onGenericMotionEvent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onGenericMotionEvent(event);
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        MyLogger.log(this, "onUserInteraction");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        super.onWindowAttributesChanged(params);
        MyLogger.log(this, "onWindowAttributesChanged Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        MyLogger.log(this, "onContentChanged Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        MyLogger.log(this, "onWindowFocusChanged");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MyLogger.log(this, "onAttachedToWindow");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MyLogger.log(this, "onDetachedFromWindow");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean hasWindowFocus() {
        MyLogger.log(this, "hasWindowFocus");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.hasWindowFocus();
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        MyLogger.log(this, "dispatchKeyEvent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.dispatchKeyEvent(event);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        MyLogger.log(this, "dispatchKeyShortcutEvent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        MyLogger.log(this, "dispatchTouchEvent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent ev) {
        MyLogger.log(this, "dispatchTrackballEvent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.dispatchTrackballEvent(ev);
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
        MyLogger.log(this, "dispatchGenericMotionEvent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.dispatchGenericMotionEvent(ev);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        MyLogger.log(this, "dispatchPopulateAccessibilityEvent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.dispatchPopulateAccessibilityEvent(event);
    }

    @Nullable
    @Override
    public View onCreatePanelView(int featureId) {
        MyLogger.log(this, "onCreatePanelView");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onCreatePanelView(featureId);
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        MyLogger.log(this, "onCreatePanelMenu");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onCreatePanelMenu(featureId, menu);
    }

    @Override
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        MyLogger.log(this, "onPreparePanel");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onPreparePanel(featureId, view, menu);
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        MyLogger.log(this, "onMenuOpened");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onMenuOpened(featureId, menu);
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        MyLogger.log(this, "onMenuItemSelected");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onMenuItemSelected(featureId, item);
    }

    @Override
    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
        MyLogger.log(this, "onPanelClosed");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void invalidateOptionsMenu() {
        super.invalidateOptionsMenu();
        MyLogger.log(this, "invalidateOptionsMenu");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MyLogger.log(this, "onCreateOptionsMenu");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MyLogger.log(this, "onPrepareOptionsMenu");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        MyLogger.log(this, "onOptionsItemSelected");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigateUp() {
        MyLogger.log(this, "onNavigateUp");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onNavigateUp();
    }

    @Override
    public boolean onNavigateUpFromChild(Activity child) {
        MyLogger.log(this, "onNavigateUpFromChild");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onNavigateUpFromChild(child);
    }

    @Override
    public void onCreateNavigateUpTaskStack(TaskStackBuilder builder) {
        super.onCreateNavigateUpTaskStack(builder);
        MyLogger.log(this, "onCreateNavigateUpTaskStack");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onPrepareNavigateUpTaskStack(TaskStackBuilder builder) {
        super.onPrepareNavigateUpTaskStack(builder);
        MyLogger.log(this, "onPrepareNavigateUpTaskStack");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
        MyLogger.log(this, "onOptionsMenuClosed");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void openOptionsMenu() {
        super.openOptionsMenu();
        MyLogger.log(this, "openOptionsMenu");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void closeOptionsMenu() {
        super.closeOptionsMenu();
        MyLogger.log(this, "closeOptionsMenu");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MyLogger.log(this, "onCreateContextMenu");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void registerForContextMenu(View view) {
        super.registerForContextMenu(view);
        MyLogger.log(this, "registerForContextMenu");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void unregisterForContextMenu(View view) {
        super.unregisterForContextMenu(view);
        MyLogger.log(this, "unregisterForContextMenu");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void openContextMenu(View view) {
        super.openContextMenu(view);
        MyLogger.log(this, "openContextMenu");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void closeContextMenu() {
        super.closeContextMenu();
        MyLogger.log(this, "closeContextMenu");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        MyLogger.log(this, "onContextItemSelected");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onContextItemSelected(item);
    }

    @Override
    public void onContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
        MyLogger.log(this, "onContextMenuClosed");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        MyLogger.log(this, "onCreateDialog");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onCreateDialog(id);
    }

    @Nullable
    @Override
    protected Dialog onCreateDialog(int id, Bundle args) {
        MyLogger.log(this, "onCreateDialog");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onCreateDialog(id, args);
    }

    @Override
    protected void onPrepareDialog(int id, Dialog dialog) {
        super.onPrepareDialog(id, dialog);
        MyLogger.log(this, "onPrepareDialog");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onPrepareDialog(int id, Dialog dialog, Bundle args) {
        super.onPrepareDialog(id, dialog, args);
        MyLogger.log(this, "onPrepareDialog");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean onSearchRequested(SearchEvent searchEvent) {
        MyLogger.log(this, "onSearchRequested");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onSearchRequested(searchEvent);
    }

    @Override
    public boolean onSearchRequested() {
        MyLogger.log(this, "onSearchRequested");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onSearchRequested();
    }

    @Override
    public void startSearch(String initialQuery, boolean selectInitialQuery, Bundle appSearchData, boolean globalSearch) {
        super.startSearch(initialQuery, selectInitialQuery, appSearchData, globalSearch);
        MyLogger.log(this, "startSearch");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void triggerSearch(String query, Bundle appSearchData) {
        super.triggerSearch(query, appSearchData);
        MyLogger.log(this, "triggerSearch");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void takeKeyEvents(boolean get) {
        super.takeKeyEvents(get);
        MyLogger.log(this, "takeKeyEvents");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @NonNull
    @Override
    public LayoutInflater getLayoutInflater() {
        MyLogger.log(this, "getLayoutInflater");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getLayoutInflater();
    }

    @NonNull
    @Override
    public MenuInflater getMenuInflater() {
        MyLogger.log(this, "getMenuInflater");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getMenuInflater();
    }

    @Override
    public void setTheme(int resid) {
        super.setTheme(resid);
        MyLogger.log(this, "setTheme Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
        super.onApplyThemeResource(theme, resid, first);
        MyLogger.log(this, "onApplyThemeResource Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        MyLogger.log(this, "onRequestPermissionsResult");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean shouldShowRequestPermissionRationale(String permission) {
        MyLogger.log(this, "shouldShowRequestPermissionRationale");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.shouldShowRequestPermissionRationale(permission);
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
        MyLogger.log(this, "startActivityForResult");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
        MyLogger.log(this, "startActivityForResult");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
        MyLogger.log(this, "startIntentSenderForResult");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
        MyLogger.log(this, "startIntentSenderForResult");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        MyLogger.log(this, "startActivity");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startActivity(Intent intent, Bundle options) {
        super.startActivity(intent, options);
        MyLogger.log(this, "startActivity");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startActivities(Intent[] intents) {
        super.startActivities(intents);
        MyLogger.log(this, "startActivities");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startActivities(Intent[] intents, Bundle options) {
        super.startActivities(intents, options);
        MyLogger.log(this, "startActivities");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
        MyLogger.log(this, "startIntentSender");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
        MyLogger.log(this, "startIntentSender");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean startActivityIfNeeded(Intent intent, int requestCode) {
        MyLogger.log(this, "startActivityIfNeeded");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.startActivityIfNeeded(intent, requestCode);
    }

    @Override
    public boolean startActivityIfNeeded(Intent intent, int requestCode, Bundle options) {
        MyLogger.log(this, "startActivityIfNeeded");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.startActivityIfNeeded(intent, requestCode, options);
    }

    @Override
    public boolean startNextMatchingActivity(Intent intent) {
        MyLogger.log(this, "startNextMatchingActivity");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.startNextMatchingActivity(intent);
    }

    @Override
    public boolean startNextMatchingActivity(Intent intent, Bundle options) {
        MyLogger.log(this, "startNextMatchingActivity");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.startNextMatchingActivity(intent, options);
    }

    @Override
    public void startActivityFromChild(Activity child, Intent intent, int requestCode) {
        super.startActivityFromChild(child, intent, requestCode);
        MyLogger.log(this, "startActivityFromChild");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startActivityFromChild(Activity child, Intent intent, int requestCode, Bundle options) {
        super.startActivityFromChild(child, intent, requestCode, options);
        MyLogger.log(this, "startActivityFromChild");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode) {
        super.startActivityFromFragment(fragment, intent, requestCode);
        MyLogger.log(this, "startActivityFromFragment");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode, Bundle options) {
        super.startActivityFromFragment(fragment, intent, requestCode, options);
        MyLogger.log(this, "startActivityFromFragment");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
        MyLogger.log(this, "startIntentSenderFromChild");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
        MyLogger.log(this, "startIntentSenderFromChild");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void overridePendingTransition(int enterAnim, int exitAnim) {
        super.overridePendingTransition(enterAnim, exitAnim);
        MyLogger.log(this, "overridePendingTransition");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Nullable
    @Override
    public Uri getReferrer() {
        MyLogger.log(this, "getReferrer");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getReferrer();
    }

    @Override
    public Uri onProvideReferrer() {
        MyLogger.log(this, "onProvideReferrer");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onProvideReferrer();
    }

    @Nullable
    @Override
    public String getCallingPackage() {
        MyLogger.log(this, "getCallingPackage");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getCallingPackage();
    }

    @Nullable
    @Override
    public ComponentName getCallingActivity() {
        MyLogger.log(this, "getCallingActivity");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getCallingActivity();
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        MyLogger.log(this, "setVisible");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean isFinishing() {
        MyLogger.log(this, "isFinishing");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.isFinishing();
    }

    @Override
    public boolean isDestroyed() {
        MyLogger.log(this, "isDestroyed");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.isDestroyed();
    }

    @Override
    public boolean isChangingConfigurations() {
        MyLogger.log(this, "isChangingConfigurations");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.isChangingConfigurations();
    }

    @Override
    public void recreate() {
        super.recreate();
        MyLogger.log(this, "recreate");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void finish() {
        super.finish();
        MyLogger.log(this, "finish");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void finishAffinity() {
        super.finishAffinity();
        MyLogger.log(this, "finishAffinity");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void finishFromChild(Activity child) {
        super.finishFromChild(child);
        MyLogger.log(this, "finishFromChild");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void finishAfterTransition() {
        super.finishAfterTransition();
        MyLogger.log(this, "finishAfterTransition");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void finishActivity(int requestCode) {
        super.finishActivity(requestCode);
        MyLogger.log(this, "finishActivity");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void finishActivityFromChild(Activity child, int requestCode) {
        super.finishActivityFromChild(child, requestCode);
        MyLogger.log(this, "finishActivityFromChild");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void finishAndRemoveTask() {
        super.finishAndRemoveTask();
        MyLogger.log(this, "finishAndRemoveTask");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean releaseInstance() {
        MyLogger.log(this, "releaseInstance");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.releaseInstance();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        MyLogger.log(this, "onActivityResult");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onActivityReenter(int resultCode, Intent data) {
        super.onActivityReenter(resultCode, data);
        MyLogger.log(this, "onActivityReenter");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public PendingIntent createPendingResult(int requestCode, Intent data, int flags) {
        MyLogger.log(this, "createPendingResult");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.createPendingResult(requestCode, data, flags);
    }

    @Override
    public void setRequestedOrientation(int requestedOrientation) {
        super.setRequestedOrientation(requestedOrientation);
        MyLogger.log(this, "setRequestedOrientation");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public int getRequestedOrientation() {
        MyLogger.log(this, "getRequestedOrientation");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getRequestedOrientation();
    }

    @Override
    public int getTaskId() {
        MyLogger.log(this, "getTaskId");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getTaskId();
    }

    @Override
    public boolean isTaskRoot() {
        MyLogger.log(this, "isTaskRoot");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.isTaskRoot();
    }

    @Override
    public boolean moveTaskToBack(boolean nonRoot) {
        MyLogger.log(this, "moveTaskToBack");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.moveTaskToBack(nonRoot);
    }

    @NonNull
    @Override
    public String getLocalClassName() {
        MyLogger.log(this, "getLocalClassName");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getLocalClassName();
    }

    @Override
    public ComponentName getComponentName() {
        MyLogger.log(this, "getComponentName Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
        return super.getComponentName();
    }

    @Override
    public SharedPreferences getPreferences(int mode) {
        MyLogger.log(this, "getPreferences");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getPreferences(mode);
    }

    @Override
    public Object getSystemService(String name) {
        MyLogger.log(this, "getSystemService Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
        //Danger!
        return super.getSystemService(name);
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        MyLogger.log(this, "setTitle");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void setTitle(int titleId) {
        super.setTitle(titleId);
        MyLogger.log(this, "setTitle");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void setTitleColor(int textColor) {
        super.setTitleColor(textColor);
        MyLogger.log(this, "setTitleColor");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        MyLogger.log(this, "onTitleChanged");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onChildTitleChanged(Activity childActivity, CharSequence title) {
        super.onChildTitleChanged(childActivity, title);
        MyLogger.log(this, "onChildTitleChanged");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void setTaskDescription(ActivityManager.TaskDescription taskDescription) {
        super.setTaskDescription(taskDescription);
        MyLogger.log(this, "setTaskDescription");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Nullable
    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        MyLogger.log(this, "onCreateView Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
        return super.onCreateView(name, context, attrs);
    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        MyLogger.log(this, "onCreateView Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
        return super.onCreateView(parent, name, context, attrs);
    }

    @Override
    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(prefix, fd, writer, args);
        MyLogger.log(this, "dump");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean isImmersive() {
        MyLogger.log(this, "isImmersive");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.isImmersive();
    }

    @Override
    public boolean requestVisibleBehind(boolean visible) {
        MyLogger.log(this, "requestVisibleBehind");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.requestVisibleBehind(visible);
    }

    @Override
    public void onVisibleBehindCanceled() {
        super.onVisibleBehindCanceled();
        MyLogger.log(this, "onVisibleBehindCanceled");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        MyLogger.log(this, "onEnterAnimationComplete");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void setImmersive(boolean i) {
        super.setImmersive(i);
        MyLogger.log(this, "setImmersive");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void setVrModeEnabled(boolean enabled, ComponentName requestedComponent) throws PackageManager.NameNotFoundException {
        super.setVrModeEnabled(enabled, requestedComponent);
        MyLogger.log(this, "setVrModeEnabled");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Nullable
    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        MyLogger.log(this, "startActionMode");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.startActionMode(callback);
    }

    @Nullable
    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int type) {
        MyLogger.log(this, "startActionMode");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.startActionMode(callback, type);
    }

    @Nullable
    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        MyLogger.log(this, "onWindowStartingActionMode");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onWindowStartingActionMode(callback);
    }

    @Nullable
    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
        MyLogger.log(this, "onWindowStartingActionMode");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.onWindowStartingActionMode(callback, type);
    }

    @Override
    public void onActionModeStarted(ActionMode mode) {
        super.onActionModeStarted(mode);
        MyLogger.log(this, "onActionModeStarted");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void onActionModeFinished(ActionMode mode) {
        super.onActionModeFinished(mode);
        MyLogger.log(this, "onActionModeFinished");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean shouldUpRecreateTask(Intent targetIntent) {
        MyLogger.log(this, "shouldUpRecreateTask");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.shouldUpRecreateTask(targetIntent);
    }

    @Override
    public boolean navigateUpTo(Intent upIntent) {
        MyLogger.log(this, "navigateUpTo");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.navigateUpTo(upIntent);
    }

    @Override
    public boolean navigateUpToFromChild(Activity child, Intent upIntent) {
        MyLogger.log(this, "navigateUpToFromChild");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.navigateUpToFromChild(child, upIntent);
    }

    @Nullable
    @Override
    public Intent getParentActivityIntent() {
        MyLogger.log(this, "getParentActivityIntent");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getParentActivityIntent();
    }

    @Override
    public void setEnterSharedElementCallback(SharedElementCallback callback) {
        super.setEnterSharedElementCallback(callback);
        MyLogger.log(this, "setEnterSharedElementCallback");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void setExitSharedElementCallback(SharedElementCallback callback) {
        super.setExitSharedElementCallback(callback);
        MyLogger.log(this, "setExitSharedElementCallback");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void postponeEnterTransition() {
        super.postponeEnterTransition();
        MyLogger.log(this, "postponeEnterTransition");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void startPostponedEnterTransition() {
        super.startPostponedEnterTransition();
        MyLogger.log(this, "startPostponedEnterTransition");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public DragAndDropPermissions requestDragAndDropPermissions(DragEvent event) {
        MyLogger.log(this, "requestDragAndDropPermissions");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.requestDragAndDropPermissions(event);
    }

    @Override
    public void startLockTask() {
        super.startLockTask();
        MyLogger.log(this, "startLockTask");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void stopLockTask() {
        super.stopLockTask();
        MyLogger.log(this, "stopLockTask");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void showLockTaskEscapeMessage() {
        super.showLockTaskEscapeMessage();
        MyLogger.log(this, "showLockTaskEscapeMessage");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        MyLogger.log(this, "attachBaseContext Danger");
        //log.setText("");
        //log.setText(MyLogger.getLogHistory());
        //Danger!
    }

    @Override
    public void applyOverrideConfiguration(Configuration overrideConfiguration) {
        super.applyOverrideConfiguration(overrideConfiguration);
        MyLogger.log(this, "applyOverrideConfiguration");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public AssetManager getAssets() {
        MyLogger.log(this, "getAssets");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getAssets();
    }

    @Override
    public Context getBaseContext() {
        MyLogger.log(this, "getBaseContext Danger");
        return super.getBaseContext();
    }

    @Override
    public PackageManager getPackageManager() {
        MyLogger.log(this, "getPackageManager");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getPackageManager();
    }

    @Override
    public ContentResolver getContentResolver() {
        MyLogger.log(this, "getContentResolver");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getContentResolver();
    }

    @Override
    public Looper getMainLooper() {
        MyLogger.log(this, "getMainLooper");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getMainLooper();
    }

    @Override
    public Context getApplicationContext() {
        MyLogger.log(this, "getApplicationContext");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getApplicationContext();
    }

    @Override
    public ClassLoader getClassLoader() {
        MyLogger.log(this, "getClassLoader Danger");
//        log.setText("");
//        log.setText(MyLogger.getLogHistory());
        return super.getClassLoader();
    }

    @Override
    public String getPackageName() {
        MyLogger.log(this, "getPackageName");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getPackageName();
    }

    @Override
    public String getPackageResourcePath() {
        MyLogger.log(this, "getPackageResourcePath");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getPackageResourcePath();
    }

    @Override
    public String getPackageCodePath() {
        MyLogger.log(this, "getPackageCodePath");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getPackageCodePath();
    }

    @Override
    public SharedPreferences getSharedPreferences(String name, int mode) {
        MyLogger.log(this, "getSharedPreferences");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getSharedPreferences(name, mode);
    }

    @Override
    public boolean moveSharedPreferencesFrom(Context sourceContext, String name) {
        MyLogger.log(this, "moveSharedPreferencesFrom");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.moveSharedPreferencesFrom(sourceContext, name);
    }

    @Override
    public boolean deleteSharedPreferences(String name) {
        MyLogger.log(this, "deleteSharedPreferences");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.deleteSharedPreferences(name);
    }

    @Override
    public FileInputStream openFileInput(String name) throws FileNotFoundException {
        MyLogger.log(this, "openFileInput");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.openFileInput(name);
    }

    @Override
    public FileOutputStream openFileOutput(String name, int mode) throws FileNotFoundException {
        MyLogger.log(this, "openFileOutput");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.openFileOutput(name, mode);
    }

    @Override
    public boolean deleteFile(String name) {
        MyLogger.log(this, "deleteFile");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.deleteFile(name);
    }

    @Override
    public File getFileStreamPath(String name) {
        MyLogger.log(this, "getFileStreamPath");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getFileStreamPath(name);
    }

    @Override
    public String[] fileList() {
        MyLogger.log(this, "fileList");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.fileList();
    }

    @Override
    public File getDataDir() {
        MyLogger.log(this, "getDataDir");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getDataDir();
    }

    @Override
    public File getFilesDir() {
        MyLogger.log(this, "getFilesDir");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getFilesDir();
    }

    @Override
    public File getNoBackupFilesDir() {
        MyLogger.log(this, "getNoBackupFilesDir");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getNoBackupFilesDir();
    }

    @Override
    public File getExternalFilesDir(String type) {
        MyLogger.log(this, "getExternalFilesDir");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getExternalFilesDir(type);
    }

    @Override
    public File[] getExternalFilesDirs(String type) {
        MyLogger.log(this, "getExternalFilesDirs");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getExternalFilesDirs(type);
    }

    @Override
    public File getObbDir() {
        MyLogger.log(this, "getObbDir");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getObbDir();
    }

    @Override
    public File[] getObbDirs() {
        MyLogger.log(this, "getObbDirs");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getObbDirs();
    }

    @Override
    public File getCacheDir() {
        MyLogger.log(this, "getCacheDir");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getCacheDir();
    }

    @Override
    public File getCodeCacheDir() {
        MyLogger.log(this, "getCodeCacheDir");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getCodeCacheDir();
    }

    @Override
    public File getExternalCacheDir() {
        MyLogger.log(this, "getExternalCacheDir");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getExternalCacheDir();
    }

    @Override
    public File[] getExternalCacheDirs() {
        MyLogger.log(this, "getExternalCacheDirs");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getExternalCacheDirs();
    }

    @Override
    public File[] getExternalMediaDirs() {
        MyLogger.log(this, "getExternalMediaDirs");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getExternalMediaDirs();
    }

    @Override
    public File getDir(String name, int mode) {
        MyLogger.log(this, "getDir");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getDir(name, mode);
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory) {
        MyLogger.log(this, "openOrCreateDatabase");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.openOrCreateDatabase(name, mode, factory);
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory, DatabaseErrorHandler errorHandler) {
        MyLogger.log(this, "openOrCreateDatabase");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.openOrCreateDatabase(name, mode, factory, errorHandler);
    }

    @Override
    public boolean moveDatabaseFrom(Context sourceContext, String name) {
        MyLogger.log(this, "moveDatabaseFrom");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.moveDatabaseFrom(sourceContext, name);
    }

    @Override
    public boolean deleteDatabase(String name) {
        MyLogger.log(this, "deleteDatabase");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.deleteDatabase(name);
    }

    @Override
    public File getDatabasePath(String name) {
        MyLogger.log(this, "getDatabasePath");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getDatabasePath(name);
    }

    @Override
    public String[] databaseList() {
        MyLogger.log(this, "databaseList");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.databaseList();
    }

    @Override
    public Drawable getWallpaper() {
        MyLogger.log(this, "getWallpaper");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getWallpaper();
    }

    @Override
    public Drawable peekWallpaper() {
        MyLogger.log(this, "peekWallpaper");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.peekWallpaper();
    }

    @Override
    public int getWallpaperDesiredMinimumWidth() {
        MyLogger.log(this, "getWallpaperDesiredMinimumWidth");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getWallpaperDesiredMinimumWidth();
    }

    @Override
    public int getWallpaperDesiredMinimumHeight() {
        MyLogger.log(this, "getWallpaperDesiredMinimumHeight");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getWallpaperDesiredMinimumHeight();
    }

    @Override
    public void setWallpaper(Bitmap bitmap) throws IOException {
        super.setWallpaper(bitmap);
        MyLogger.log(this, "setWallpaper");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void setWallpaper(InputStream data) throws IOException {
        super.setWallpaper(data);
        MyLogger.log(this, "setWallpaper");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void clearWallpaper() throws IOException {
        super.clearWallpaper();
        MyLogger.log(this, "clearWallpaper");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void sendBroadcast(Intent intent) {
        super.sendBroadcast(intent);
        MyLogger.log(this, "sendBroadcast");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void sendBroadcast(Intent intent, String receiverPermission) {
        super.sendBroadcast(intent, receiverPermission);
        MyLogger.log(this, "sendBroadcast");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void sendOrderedBroadcast(Intent intent, String receiverPermission) {
        super.sendOrderedBroadcast(intent, receiverPermission);
        MyLogger.log(this, "sendOrderedBroadcast");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void sendOrderedBroadcast(Intent intent, String receiverPermission, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) {
        super.sendOrderedBroadcast(intent, receiverPermission, resultReceiver, scheduler, initialCode, initialData, initialExtras);
        MyLogger.log(this, "sendOrderedBroadcast");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void sendBroadcastAsUser(Intent intent, UserHandle user) {
        super.sendBroadcastAsUser(intent, user);
        MyLogger.log(this, "sendBroadcastAsUser");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void sendBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission) {
        super.sendBroadcastAsUser(intent, user, receiverPermission);
        MyLogger.log(this, "sendBroadcastAsUser");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) {
        super.sendOrderedBroadcastAsUser(intent, user, receiverPermission, resultReceiver, scheduler, initialCode, initialData, initialExtras);
        MyLogger.log(this, "sendOrderedBroadcastAsUser");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void sendStickyBroadcast(Intent intent) {
        super.sendStickyBroadcast(intent);
        MyLogger.log(this, "sendStickyBroadcast");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) {
        super.sendStickyOrderedBroadcast(intent, resultReceiver, scheduler, initialCode, initialData, initialExtras);
        MyLogger.log(this, "sendStickyOrderedBroadcast");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void removeStickyBroadcast(Intent intent) {
        super.removeStickyBroadcast(intent);
        MyLogger.log(this, "removeStickyBroadcast");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void sendStickyBroadcastAsUser(Intent intent, UserHandle user) {
        super.sendStickyBroadcastAsUser(intent, user);
        MyLogger.log(this, "sendStickyBroadcastAsUser");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle user, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) {
        super.sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver, scheduler, initialCode, initialData, initialExtras);
        MyLogger.log(this, "sendStickyOrderedBroadcastAsUser");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void removeStickyBroadcastAsUser(Intent intent, UserHandle user) {
        super.removeStickyBroadcastAsUser(intent, user);
        MyLogger.log(this, "removeStickyBroadcastAsUser");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) {
        MyLogger.log(this, "registerReceiver");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.registerReceiver(receiver, filter);
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler) {
        MyLogger.log(this, "registerReceiver");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.registerReceiver(receiver, filter, broadcastPermission, scheduler);
    }

    @Override
    public void unregisterReceiver(BroadcastReceiver receiver) {
        super.unregisterReceiver(receiver);
        MyLogger.log(this, "unregisterReceiver");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public ComponentName startService(Intent service) {
        MyLogger.log(this, "startService");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.startService(service);
    }

    @Override
    public boolean stopService(Intent name) {
        MyLogger.log(this, "stopService");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.stopService(name);
    }

    @Override
    public boolean bindService(Intent service, ServiceConnection conn, int flags) {
        MyLogger.log(this, "bindService");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.bindService(service, conn, flags);
    }

    @Override
    public void unbindService(ServiceConnection conn) {
        super.unbindService(conn);
        MyLogger.log(this, "unbindService");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public boolean startInstrumentation(ComponentName className, String profileFile, Bundle arguments) {
        MyLogger.log(this, "startInstrumentation");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.startInstrumentation(className, profileFile, arguments);
    }

    @Override
    public String getSystemServiceName(Class<?> serviceClass) {
        MyLogger.log(this, "getSystemServiceName");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.getSystemServiceName(serviceClass);
    }

    @Override
    public int checkPermission(String permission, int pid, int uid) {
        MyLogger.log(this, "checkPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.checkPermission(permission, pid, uid);
    }

    @Override
    public int checkCallingPermission(String permission) {
        MyLogger.log(this, "checkCallingPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.checkCallingPermission(permission);
    }

    @Override
    public int checkCallingOrSelfPermission(String permission) {
        MyLogger.log(this, "checkCallingOrSelfPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.checkCallingOrSelfPermission(permission);
    }

    @Override
    public int checkSelfPermission(String permission) {
        MyLogger.log(this, "checkSelfPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.checkSelfPermission(permission);
    }

    @Override
    public void enforcePermission(String permission, int pid, int uid, String message) {
        super.enforcePermission(permission, pid, uid, message);
        MyLogger.log(this, "enforcePermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void enforceCallingPermission(String permission, String message) {
        super.enforceCallingPermission(permission, message);
        MyLogger.log(this, "enforceCallingPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void enforceCallingOrSelfPermission(String permission, String message) {
        super.enforceCallingOrSelfPermission(permission, message);
        MyLogger.log(this, "enforceCallingOrSelfPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void grantUriPermission(String toPackage, Uri uri, int modeFlags) {
        super.grantUriPermission(toPackage, uri, modeFlags);
        MyLogger.log(this, "grantUriPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void revokeUriPermission(Uri uri, int modeFlags) {
        super.revokeUriPermission(uri, modeFlags);
        MyLogger.log(this, "revokeUriPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags) {
        MyLogger.log(this, "checkUriPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.checkUriPermission(uri, pid, uid, modeFlags);
    }

    @Override
    public int checkCallingUriPermission(Uri uri, int modeFlags) {
        MyLogger.log(this, "checkCallingUriPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.checkCallingUriPermission(uri, modeFlags);
    }

    @Override
    public int checkCallingOrSelfUriPermission(Uri uri, int modeFlags) {
        MyLogger.log(this, "checkCallingOrSelfUriPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.checkCallingOrSelfUriPermission(uri, modeFlags);
    }

    @Override
    public int checkUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags) {
        MyLogger.log(this, "checkUriPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.checkUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags);
    }

    @Override
    public void enforceUriPermission(Uri uri, int pid, int uid, int modeFlags, String message) {
        super.enforceUriPermission(uri, pid, uid, modeFlags, message);
        MyLogger.log(this, "enforceUriPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void enforceCallingUriPermission(Uri uri, int modeFlags, String message) {
        super.enforceCallingUriPermission(uri, modeFlags, message);
        MyLogger.log(this, "enforceCallingUriPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void enforceCallingOrSelfUriPermission(Uri uri, int modeFlags, String message) {
        super.enforceCallingOrSelfUriPermission(uri, modeFlags, message);
        MyLogger.log(this, "enforceCallingOrSelfUriPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public void enforceUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags, String message) {
        super.enforceUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags, message);
        MyLogger.log(this, "enforceUriPermission");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    public Context createPackageContext(String packageName, int flags) throws PackageManager.NameNotFoundException {
        MyLogger.log(this, "createPackageContext");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.createPackageContext(packageName, flags);
    }

    @Override
    public Context createConfigurationContext(Configuration overrideConfiguration) {
        MyLogger.log(this, "createConfigurationContext");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.createConfigurationContext(overrideConfiguration);
    }

    @Override
    public Context createDisplayContext(Display display) {
        MyLogger.log(this, "createDisplayContext");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.createDisplayContext(display);
    }

    @Override
    public boolean isRestricted() {
        MyLogger.log(this, "isRestricted");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.isRestricted();
    }

    @Override
    public Context createDeviceProtectedStorageContext() {
        MyLogger.log(this, "createDeviceProtectedStorageContext");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.createDeviceProtectedStorageContext();
    }

    @Override
    public boolean isDeviceProtectedStorage() {
        MyLogger.log(this, "isDeviceProtectedStorage");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
        return super.isDeviceProtectedStorage();
    }
}
