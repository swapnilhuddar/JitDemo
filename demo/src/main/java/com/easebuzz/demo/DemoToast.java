package com.easebuzz.demo;

import android.content.Context;
import android.widget.Toast;

public class DemoToast {
    public static void ShowToast(Context context, String Message){
        Toast.makeText(context, Message, Toast.LENGTH_SHORT).show();
    }
}
