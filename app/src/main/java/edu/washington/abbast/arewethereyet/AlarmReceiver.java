package edu.washington.abbast.arewethereyet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.widget.Toast;

/**
 * Created by Abbas on 2/22/17.
 */

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
//        String message = "Texting " + intent.getStringExtra("number") + "\n\n " + intent.getStringExtra("message");
//        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(intent.getStringExtra("number"), null,
                intent.getStringExtra("message"), null, null);
    }
}
