package com.android.launcher3;
import android.widget.Toast;
import com.android.launcher3.DataUtils;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class EduAppReceiver extends BroadcastReceiver
{
    public void onReceive(final Context context, final Intent intent) {
        if (intent.getAction().equals("com.linspirer.edu.getdevicesn")) {
            final String readStringValue = DataUtils.ReadStringValue(context, "SN", "null");
            Toast.makeText(context, (CharSequence)("Received SN:" + readStringValue), 0).show();
            final Intent intent2 = new Intent("com.android.laucher3.mdm.obtaindevicesn");
            intent2.putExtra("device_sn", readStringValue);
            context.sendBroadcast(intent2);
        }
    }
}


