package com.android.launcher3;

import android.app.*;
import android.os.*;
import android.os.Bundle;
import com.android.launcher3.R;
import com.android.launcher3.DataUtils;
import android.widget.EditText;
import android.content.Context;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends Activity
{
    public void OnClick(final View view) {
        try {
            switch (view.getId()) {
                case R.id.button: {
						Toast.makeText((Context)this, (CharSequence)"成功", 0).show();
						DataUtils.saveStringValue((Context)this, "SN", ((EditText)this.findViewById(R.id.SN)).getText().toString());
						break;
					}
            }
        }
        catch (Exception ex) {}
    }

    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.main);
    }
}

