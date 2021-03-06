package com.bottlerocketstudios.vaultsampleapplication.ui;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bottlerocketstudios.vaultsampleapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        wireClick(R.id.keychain_authenticated_vault, mClickListener);
        wireClick(R.id.manually_keyed_vault, mClickListener);
        wireClick(R.id.automatically_keyed_vault, mClickListener);
        wireClick(R.id.password_required_vault, mClickListener);
    }

    private void wireClick(int viewId, View.OnClickListener clickListener) {
        findViewById(viewId).setOnClickListener(clickListener);
    }

    private View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.keychain_authenticated_vault:
                    launchKeychainAuthenticatedVault();
                    break;
                case R.id.automatically_keyed_vault:
                    launchAutomaticallyKeyedVault();
                    break;
                case R.id.password_required_vault:
                    launchPbkdfRequiredVault();
                    break;
                case R.id.manually_keyed_vault:
                    launchManuallyKeyedVault();
                    break;
            }
        }
    };

    private void launchManuallyKeyedVault() {
        startActivity(ManuallyKeyedActivity.createLaunchIntent(this));
    }

    private void launchPbkdfRequiredVault() {
        startActivity(PasswordRequiredActivity.createLaunchIntent(this));
    }

    private void launchAutomaticallyKeyedVault() {
        startActivity(AutomaticallyKeyedActivity.createLaunchIntent(this));
    }

    private void launchKeychainAuthenticatedVault() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            startActivity(KeychainAuthenticatedActivity.createLaunchIntent(this));
        } else {
            Toast.makeText(this, getString(R.string.api_23_error), Toast.LENGTH_LONG).show();
        }
    }
}
