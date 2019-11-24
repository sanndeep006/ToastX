package com.androidx.toastx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

public class ToastX {
    public ToastX() { }

    public static Toast normal(Context context, String message){
        return customToast(context, message, false, 0, R.drawable.toast_normal_background);
    }

    public static Toast success(Context context, String message){
        return customToast(context, message,true, R.drawable.ic_success_24dp, R.drawable.toast_success_background);
    }

    public static Toast error(Context context, String message){
        return customToast(context, message,true, R.drawable.ic_error_24dp, R.drawable.toast_error_background);
    }

    public static Toast customToast(Context context, String message, boolean hasIcon, int iconRes, int background) {

        final Toast currentToast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
        final View toastLayout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null);

        final LinearLayout ll =  toastLayout.findViewById(R.id.toast_root);
        final ImageView toastIcon = toastLayout.findViewById(R.id.toast_icon);
        final TextView toastTextView = toastLayout.findViewById(R.id.toast_text);

        if (hasIcon) {
            toastIcon.setImageResource(iconRes);
            toastTextView.setTextColor(ContextCompat.getColor(context, R.color.text_color));
        } else {
            toastIcon.setVisibility(View.GONE);
            toastTextView.setTextColor(ContextCompat.getColor(context, R.color.text_color));
        }

        toastTextView.setText(message);
        ll.setBackgroundResource(background);
        currentToast.setView(toastLayout);

        return currentToast;
    }
}
