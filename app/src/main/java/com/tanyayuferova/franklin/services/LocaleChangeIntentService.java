package com.tanyayuferova.franklin.services;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import com.tanyayuferova.franklin.data.VirtuesDbHelper;

/**
 * Created by Tanya Yuferova on 1/4/2018.
 */

public class LocaleChangeIntentService extends IntentService {

    public LocaleChangeIntentService() {
        super("LocaleChangeIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        //We need to update virtues values in the data base according to current device localization
        VirtuesDbHelper dbHelper = new VirtuesDbHelper(this);
        dbHelper.updateDefaultVirtuesValues(dbHelper.getWritableDatabase());
        dbHelper.close();
    }
}