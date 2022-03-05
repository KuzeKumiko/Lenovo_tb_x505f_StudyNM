package f.linspirer.releasecontrol;
import android.app.Activity;
import android.os.Bundle;
import java.io.IOException;
import android.util.Log;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends Activity
{
    private void a() {
        final Intent intent = new Intent();
        intent.setAction("com.drupe.swd.launcher.huoshan.mdm.service.ExecuteCmdService");
        intent.putExtra("cmd", "command_release_control");
        intent.putExtra("active", 1);
        intent.setPackage("com.android.launcher3");
        this.startService(intent);
        Toast.makeText(this.getApplicationContext(), (CharSequence)"搞定", 1).show();
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
            this.a();
        }
    
}


