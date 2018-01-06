package com.tanyayuferova.franklin.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.tanyayuferova.franklin.services.LocaleChangeIntentService;

/**
 * Receives device language change
 *
 * Created by Tanya Yuferova on 1/4/2018.
 */
public class LocaleChangedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(Intent.ACTION_LOCALE_CHANGED.equals(intent.getAction())) {
            context.startService(new Intent(context, LocaleChangeIntentService.class));
        }
    }
}