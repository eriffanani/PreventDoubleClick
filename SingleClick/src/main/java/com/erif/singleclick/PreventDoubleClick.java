package com.erif.singleclick;

import android.os.SystemClock;

public class PreventDoubleClick {

    private long interval = 600L;
    private static long lastClickTime = 0L;

    public PreventDoubleClick(Callback callback) {
        prevent(callback);
    }

    public PreventDoubleClick(long interval, Callback callback) {
        this.interval = interval;
        prevent(callback);
    }

    private void prevent(Callback callback) {
        if (SystemClock.elapsedRealtime() - lastClickTime <= interval)
            return;
        lastClickTime = SystemClock.elapsedRealtime();
        callback.onClick();
    }

    public interface Callback {
        public void onClick();
    }

    /* Abstract 1
    public abstract class SingleClick implements View.OnClickListener {

        private long interval = 800L;
        private long lastClickTime = 0L;

        public abstract void onClicked(View view);

        public SingleClick() {}

        public SingleClick(long interval) {
            this.interval = interval;
        }

        @Override
        public void onClick(View view) {
            if (SystemClock.elapsedRealtime() - lastClickTime <= interval)
                return;
            lastClickTime = SystemClock.elapsedRealtime();
            onClicked(view);
        }

    }

    // Abstract 2
    public abstract class SingleClickAll implements View.OnClickListener {

        private long interval = 800L;

        private static final String SP_NAME = "com.erif.prevent.double.click";
        private static final String SP_NAME_CHILD = SP_NAME+".child";

        public abstract void onClicked(View view);

        public SingleClickAll() {}

        public SingleClickAll(long interval) {
            this.interval = interval;
        }

        @Override
        public void onClick(View view) {
            SharedPreferences sp = view.getContext().getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
            long lastClickTime = sp.getLong(SP_NAME_CHILD, 0L);
            if (SystemClock.elapsedRealtime() - lastClickTime <= interval)
                return;
            lastClickTime = SystemClock.elapsedRealtime();
            @SuppressLint("CommitPrefEdits")
            SharedPreferences.Editor edit = sp.edit();
            edit.putLong(SP_NAME_CHILD, lastClickTime);
            edit.apply();
            onClicked(view);
        }

    }*/

}
