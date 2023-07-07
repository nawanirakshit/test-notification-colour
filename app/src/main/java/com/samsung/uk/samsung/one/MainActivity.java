package com.samsung.uk.samsung.one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFCMToken();
    }

    /**
     * Code block added to get the FCM push token
     * Will only print logs won't effect any code part
     * Calling function is commented
     * <p>
     * Code updated when library was updated SAO-139
     */
    public void getFCMToken() {

        FirebaseMessaging.getInstance().getToken()
                .addOnCompleteListener(task -> {
                    if (!task.isSuccessful()) {
                        return;
                    }

                    // Get new FCM registration token
                    String token = task.getResult();
                    System.out.println("TOKEN >> " + token);
//                    ClipboardManager _clipboard = (ClipboardManager) SamsungOneApplication.application.getSystemService(Context.CLIPBOARD_SERVICE);
//                    _clipboard.setText(token);
                });
    }
}