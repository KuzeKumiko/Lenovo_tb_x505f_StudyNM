package com.mia.flash;
import com.mia.flash.R;
import android.app.mia.MiaMdmPolicyManager;
import android.os.*;
import android.app.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.main);
    }

	public void OnClick(final View view) {
        try {
            switch (view.getId()) {
                case R.id.clean: {
						if (!(new MiaMdmPolicyManager((Context)MainActivity.this)).appWhiteListWrite(null)) {
							Toast.makeText((Context)MainActivity.this, "成功", 0).show();
							return;
						} 
						Toast.makeText((Context)MainActivity.this, "失败", 0).show();

						break;
					}
            }
        }
        catch (Exception ex) {}
    }


}

