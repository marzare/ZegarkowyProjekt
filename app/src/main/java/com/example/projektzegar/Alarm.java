package com.example.projektzegar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
public class Alarm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm triggered!", Toast.LENGTH_SHORT).show();
        // Tutaj możesz wykonać dowolne działania, np. uruchomić inny serwis lub aktywność.
    }
}
