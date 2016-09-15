package com.alexander_topilskii.full_test.Logging;

import android.os.Environment;
import android.text.format.Time;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {
    static private StringBuilder logHistory = new StringBuilder();
    static private Time time = new Time(Time.getCurrentTimezone());

    static public void log(final Object obj, final String text) {
        log(obj, text, "v");
    }

    private static void saveHistory(String from, String text) {
        appendLog(from + " " + text);
        logHistory.append(from).append(" ").append(text).append("\n");
    }

    static public void log(final Object obj, final String text, String level) {
        time.setToNow();
        String TAG = level + " " + time.hour + ":" + time.minute + ":" + time.second + " " + obj.getClass().getSimpleName();
        saveHistory(TAG, text);

        if (level.contains("v")) logv(TAG, text);
        if (level.contains("d")) logd(TAG, text);
        if (level.contains("e")) loge(TAG, text);
        if (level.contains("i")) logi(TAG, text);
        if (level.contains("wtf")) logWtf(TAG, text);
        else logw(obj.getClass().getSimpleName(), text);
    }

    static private void logv(final String TAG, final String text) {
        Log.v(TAG, text);
    }

    static private void logd(final String TAG, final String text) {
        Log.d(TAG, text);
    }

    static private void loge(final String TAG, final String text) {
        Log.e(TAG, text);
    }

    static private void logi(final String TAG, final String text) {
        Log.i(TAG, text);
    }

    static private void logw(final String TAG, final String text) {
        Log.w(TAG, text);
    }

    static private void logWtf(final String TAG, final String text) {
        Log.wtf(TAG, text);
    }

    public static String getLogHistory() {
        return logHistory.toString();
    }

    public static void clearHistory() {
        logHistory = new StringBuilder();
    }

    private static void appendLog(String text) {
        String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/myLog.txt";
        File logFile = new File(path);
        if (!logFile.exists()) {
            try {
                logFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            BufferedWriter buf = new BufferedWriter(new FileWriter(logFile, true));
            buf.append(text);
            buf.newLine();
            buf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
