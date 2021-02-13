package com.mrkazofficial.kaztoast;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;

/**
 * @author MRKaZ
 * @since 3:53 AM, 1/23/2021, 2021
 * @class KazToast Library > Custom Toast Library
 */

@SuppressLint({"StaticFieldLeak", "ObsoleteSdkInt"})
public class KazToast {

    public static final int LENGTH_SHORT = 0;
    public static final int LENGTH_LONG = 1;

    public static Activity activity;

    public static final int VISIBLE = View.VISIBLE;
    public static final int INVISIBLE = View.INVISIBLE;

    //public static final int VISIBLE_INT = 0x00000000; // == int 0
    //public static final int INVISIBLE_INT = 0x00000004; // == int 4

    public KazToast(Activity _activity){

        this.activity = _activity;

    }

    /*Info Custom Toast*/

    public static Toast makeInfoToast(@NonNull Activity Activity, String Message, int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = Activity.getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_info_toast, Activity.findViewById(R.id.custom_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(Activity);
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeInfoToast(@NonNull Activity Activity, @StringRes int Message, int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = Activity.getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_info_toast, Activity.findViewById(R.id.custom_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(Activity);
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();
        return toastInfo;
    }

    public static Toast makeInfoToast(@NonNull Activity Activity, String Message, int Length, boolean Icon) {
        // Instance Toast
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_info_toast, Activity.findViewById(R.id.custom_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Initiate Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_info_toast_icon_false,
                    Activity.findViewById(R.id.custom_toast_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }
        return toastInfo;
    }

    public static Toast makeInfoToast(@NonNull Activity Activity, @StringRes int Message, int Length, boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_info_toast, Activity.findViewById(R.id.custom_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_info_toast_icon_false,
                    Activity.findViewById(R.id.custom_toast_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }
        return toastInfo;
    }

    public static Toast makeInfoToast(@NonNull Activity Activity, @StringRes int Message, int Length, boolean Icon, @DrawableRes int icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_info_toast, Activity.findViewById(R.id.custom_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Initiate Image View > Set Icon
            ImageView imageView = layout.findViewById(R.id.toastIconInfo);
            // Setting Visible To Icon
            if(android.os.Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Background
                imageView.setBackgroundDrawable(ContextCompat.getDrawable(Activity, icon) );
            } else {
                // Set Drawable Background
                imageView.setBackground(ContextCompat.getDrawable(Activity, icon));
            }
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_info_toast_icon_false,
                    Activity.findViewById(R.id.custom_toast_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }
        return toastInfo;
    }

    public static Toast makeInfoToast(@NonNull Context context, String Message, int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_info_toast, ((Activity) context).findViewById(R.id.custom_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(((Activity) context));
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeInfoToast(@NonNull Context context, @StringRes int Message, int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_info_toast, ((Activity) context).findViewById(R.id.custom_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(((Activity) context));
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeInfoToast(@NonNull Context context, String Message, int Length, boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_info_toast, ((Activity) context).findViewById(R.id.custom_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_info_toast_icon_false,
                    ((Activity) context).findViewById(R.id.custom_toast_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }

    public static Toast makeInfoToast(@NonNull Context context, @StringRes int Message, int Length, boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_info_toast, ((Activity) context).findViewById(R.id.custom_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_info_toast_icon_false,
                    ((Activity) context).findViewById(R.id.custom_toast_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
             toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }

    /*Warning Custom Toast*/

    public static Toast makeWarnToast(@NonNull Activity Activity, String Message, int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = Activity.getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_warn_toast, Activity.findViewById(R.id.custom_warn_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(Activity);
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();
        return toastInfo;
    }

    public static Toast makeWarnToast(@NonNull Activity Activity, @StringRes int Message, int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = Activity.getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_warn_toast, Activity.findViewById(R.id.custom_warn_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(Activity);
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeWarnToast(@NonNull Activity Activity, String Message, int Length, boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_warn_toast, Activity.findViewById(R.id.custom_warn_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_warn_toast_icon_false,
                    Activity.findViewById(R.id.custom_toast_warn_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }

    public static Toast makeWarnToast(@NonNull Activity Activity, @StringRes int Message, int Length, boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_warn_toast, Activity.findViewById(R.id.custom_warn_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_warn_toast_icon_false,
                    Activity.findViewById(R.id.custom_toast_warn_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();
        }

        return toastInfo;
    }

    public static Toast makeWarnToast(@NonNull Activity Activity, @StringRes int Message, int Length, boolean Icon, @DrawableRes int icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_warn_toast, Activity.findViewById(R.id.custom_warn_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Initiate Image View > Set Icon
            ImageView imageView = layout.findViewById(R.id.toastIconWarn);
            // Setting Visible To Icon
            if(android.os.Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Background
                imageView.setBackgroundDrawable(ContextCompat.getDrawable(Activity, icon) );
            } else {
                // Set Drawable Background
                imageView.setBackground(ContextCompat.getDrawable(Activity, icon));
            }
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_warn_toast_icon_false,
                    Activity.findViewById(R.id.custom_toast_warn_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }

    public static Toast makeWarnToast(@NonNull Context context, String Message, int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_warn_toast, ((Activity) context).findViewById(R.id.custom_warn_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(((Activity) context));
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeWarnToast(@NonNull Context context, @StringRes int Message, int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_warn_toast, ((Activity) context).findViewById(R.id.custom_warn_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(((Activity) context));
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeWarnToast(@NonNull Context context, String Message, int Length, boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_warn_toast, ((Activity) context).findViewById(R.id.custom_warn_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_warn_toast_icon_false,
                    ((Activity) context).findViewById(R.id.custom_toast_warn_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }

    public static Toast makeWarnToast(@NonNull Context context, @StringRes int Message, int Length, boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_warn_toast, ((Activity) context).findViewById(R.id.custom_warn_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_warn_toast_icon_false,
                    ((Activity) context).findViewById(R.id.custom_toast_warn_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }

    /*Error Custom Toast*/

    public static Toast makeErrorToast(@NonNull Activity Activity, String Message, int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = Activity.getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_error_toast, Activity.findViewById(R.id.custom_error_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(Activity);
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeErrorToast(@NonNull Activity Activity, @StringRes int Message, int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = Activity.getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_error_toast, Activity.findViewById(R.id.custom_error_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(Activity);
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeErrorToast(@NonNull Activity Activity, String Message, int Length, boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_error_toast, Activity.findViewById(R.id.custom_error_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_error_toast_icon_false,
                    Activity.findViewById(R.id.custom_toast_error_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }

    public static Toast makeErrorToast(@NonNull Activity Activity, @StringRes int Message, int Length, boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_error_toast, Activity.findViewById(R.id.custom_error_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_error_toast_icon_false,
                    Activity.findViewById(R.id.custom_toast_error_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }

    public static Toast makeErrorToast(@NonNull Activity Activity, @StringRes int Message, int Length, boolean Icon, @DrawableRes int icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_error_toast, Activity.findViewById(R.id.custom_error_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Initiate Image View > Set Icon
            ImageView imageView = layout.findViewById(R.id.toastIconError);
            // Setting Visible To Icon
            if(android.os.Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Background
                imageView.setBackgroundDrawable(ContextCompat.getDrawable(Activity, icon) );
            } else {
                // Set Drawable Background
                imageView.setBackground(ContextCompat.getDrawable(Activity, icon));
            }
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_error_toast_icon_false,
                    Activity.findViewById(R.id.custom_toast_error_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }

    public static Toast makeErrorToast(@NonNull Context context, String Message, int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_error_toast, ((Activity) context).findViewById(R.id.custom_error_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(((Activity) context));
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeErrorToast(@NonNull Context context, @StringRes int Message, int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_error_toast, ((Activity) context).findViewById(R.id.custom_error_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(((Activity) context));
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeErrorToast(@NonNull Context context, String Message, int Length, boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_warn_toast, ((Activity) context).findViewById(R.id.custom_warn_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_error_toast_icon_false,
                    ((Activity) context).findViewById(R.id.custom_toast_error_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }
        return toastInfo;
    }

    public static Toast makeErrorToast(@NonNull Context context, @StringRes int Message, int Length, boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_error_toast, ((Activity) context).findViewById(R.id.custom_error_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_error_toast_icon_false,
                    ((Activity) context).findViewById(R.id.custom_toast_error_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }

    /*Success Custom Toast*/

    public static Toast makeSuccessToast(@NonNull Activity Activity,String Message, int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = Activity.getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_success_toast, Activity.findViewById(R.id.custom_success_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(Activity);
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeSuccessToast(@NonNull Activity Activity,
                                         @StringRes int Message,
                                         int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = Activity.getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_success_toast, Activity.findViewById(R.id.custom_success_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(Activity);
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeSuccessToast(@NonNull Activity Activity,
                                         String Message,
                                         int Length,
                                         boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_success_toast, Activity.findViewById(R.id.custom_success_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_success_toast_icon_false,
                    Activity.findViewById(R.id.custom_toast_success_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }
        return toastInfo;
    }

    public static Toast makeSuccessToast(@NonNull Activity Activity,
                                         @StringRes int Message,
                                         int Length,
                                         boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_success_toast, Activity.findViewById(R.id.custom_success_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_success_toast_icon_false,
                    Activity.findViewById(R.id.custom_toast_success_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();
        }

        return toastInfo;
    }

    public static Toast makeSuccessToast(@NonNull Activity Activity,
                                         @StringRes int Message,
                                         int Length,
                                         boolean Icon,
                                         @DrawableRes int icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_success_toast, Activity.findViewById(R.id.custom_success_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Initiate Image View > Set Icon
            ImageView imageView = layout.findViewById(R.id.toastIconSuccess);
            // Setting Visible To Icon
            if(android.os.Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Background
                imageView.setBackgroundDrawable(ContextCompat.getDrawable(Activity, icon) );
            } else {
                // Set Drawable Background
                imageView.setBackground(ContextCompat.getDrawable(Activity, icon));
            }
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_success_toast_icon_false,
                    Activity.findViewById(R.id.custom_toast_success_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }

    public static Toast makeSuccessToast(@NonNull Context context,
                                         String Message,
                                         int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_success_toast, ((Activity) context).findViewById(R.id.custom_success_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(((Activity) context));
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeSuccessToast(@NonNull Context context,
                                         @StringRes int Message,
                                         int Length) {
        // Instance of LayoutInflater
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        // Initiate LayoutInflater R.id
        View layout = inflater.inflate(R.layout.custom_success_toast, ((Activity) context).findViewById(R.id.custom_success_toast_container));
        // Initiate Text View  R.id > Toast Custom Text
        TextView text = layout.findViewById(R.id.text);
        // Set Test Message To Toast
        text.setText(Message);
        // Instance Toast
        Toast toastInfo = new Toast(((Activity) context));
        // Set Gravity To Toast
        toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        // Set length To Toast Message!
        toastInfo.setDuration(Length);
        // Set Custom View To Toast Message!
        toastInfo.setView(layout);
        // Show Toast Message!
//        toastInfo.show();

        return toastInfo;
    }

    public static Toast makeSuccessToast(@NonNull Context context,
                                         String Message,
                                         int Length,
                                         boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_success_toast, ((Activity) context).findViewById(R.id.custom_success_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_success_toast_icon_false,
                    ((Activity) context).findViewById(R.id.custom_toast_success_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }

    public static Toast makeSuccessToast(@NonNull Context context,
                                         @StringRes int Message,
                                         int Length,
                                         boolean Icon) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_success_toast, ((Activity) context).findViewById(R.id.custom_success_toast_container));
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {

            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(
                    R.layout.custom_success_toast_icon_false,
                    ((Activity) context).findViewById(R.id.custom_toast_success_icon_false_container)
            );
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }

    /*Custom Toast*/

    public static Toast makeCustomToast(@NonNull Activity Activity,
                                        @StringRes int Message,
                                        @ColorRes int TextColor,
                                        @FontRes int Font,
                                        int Length,
                                        boolean Icon,
                                        @DrawableRes int icon,
                                        @DrawableRes int Background) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_custom_toast, Activity.findViewById(R.id.custom_custom_toast_icon_container));
            // Instance Of LinearLayout To set Background
            RelativeLayout background = (RelativeLayout) layout.findViewById(R.id.custom_custom_toast_icon_container);
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Initiate Typeface to Set Font
            Typeface typeface = Activity.getResources().getFont(Font);
            // Initiate Image View > Set Icon
            ImageView imageView = layout.findViewById(R.id.toastIconCustom);
            // Setting Visible To Icon
            if(android.os.Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Icon
                imageView.setBackgroundDrawable(ContextCompat.getDrawable(Activity, icon));
                // Set Drawable Background
                background.setBackgroundDrawable(ContextCompat.getDrawable(Activity, Background));
            } else {
                // Set Drawable Icon
                imageView.setBackground(ContextCompat.getDrawable(Activity, icon));
                // Set Drawable Background
                background.setBackground(ContextCompat.getDrawable(Activity, Background));
            }
            if(android.os.Build.VERSION.SDK_INT >= 23) {
                // Set Drawable Color
                text.setTextColor(ContextCompat.getColor(Activity, TextColor));
            } else {
                // Set Drawable COlor
                text.setTextColor(Activity.getResources().getColor(TextColor));
            }
            // Set Test Message To Toast
            text.setText(Message);
            text.setTypeface(typeface);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_custom_toast_icon_false, Activity.findViewById(R.id.custom_toast_custom_icon_false_container));
            // Instance Of LinearLayout To set Background
            RelativeLayout background = (RelativeLayout) layout.findViewById(R.id.custom_toast_custom_icon_false_container);
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Initiate Typeface to Set Font
            Typeface typeface = Activity.getResources().getFont(Font);
            // Setting Visible To Icon
            if(android.os.Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Background
                background.setBackgroundDrawable(ContextCompat.getDrawable(Activity, Background));
            } else {
                // Set Drawable Background
                background.setBackground(ContextCompat.getDrawable(Activity, Background));
            }
            if(android.os.Build.VERSION.SDK_INT >= 23) {
                // Set Drawable Color
                text.setTextColor(ContextCompat.getColor(Activity, TextColor));
            } else {
                // Set Drawable COlor
                text.setTextColor(Activity.getResources().getColor(TextColor));
            }
            // Set Test Message To Toast
            text.setText(Message);
            text.setTypeface(typeface);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }
    

    public static Toast makeCustomToast(@NonNull Activity Activity,
                                        @StringRes int Message,
                                        @ColorRes int TextColor,
                                        int Length,
                                        boolean Icon,
                                        @DrawableRes int icon,
                                        @DrawableRes int Background) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_custom_toast, Activity.findViewById(R.id.custom_custom_toast_icon_container));
            // Instance Of LinearLayout To set Background
            RelativeLayout background = (RelativeLayout) layout.findViewById(R.id.custom_custom_toast_icon_container);
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Initiate Image View > Set Icon
            ImageView imageView = layout.findViewById(R.id.toastIconCustom);
            // Setting Visible To Icon
            if(android.os.Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Icon
                imageView.setBackgroundDrawable(ContextCompat.getDrawable(Activity, icon));
                // Set Drawable Background
                background.setBackgroundDrawable(ContextCompat.getDrawable(Activity, Background));
            } else {
                // Set Drawable Icon
                imageView.setBackground(ContextCompat.getDrawable(Activity, icon));
                // Set Drawable Background
                background.setBackground(ContextCompat.getDrawable(Activity, Background));
            }
            if(android.os.Build.VERSION.SDK_INT >= 23) {
                // Set Drawable Color
                text.setTextColor(ContextCompat.getColor(Activity, TextColor));
            } else {
                // Set Drawable COlor
                text.setTextColor(Activity.getResources().getColor(TextColor));
            }
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {
            // Instance of LayoutInflater
            LayoutInflater inflater = Activity.getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_custom_toast_icon_false, Activity.findViewById(R.id.custom_toast_custom_icon_false_container));
            // Instance Of LinearLayout To set Background
            RelativeLayout background = (RelativeLayout) layout.findViewById(R.id.custom_toast_custom_icon_false_container);
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            if(android.os.Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Background
                background.setBackgroundDrawable(ContextCompat.getDrawable(Activity, Background));
            } else {
                // Set Drawable Background
                background.setBackground(ContextCompat.getDrawable(Activity, Background));
            }
            if(android.os.Build.VERSION.SDK_INT >= 23) {
                // Set Drawable Color
                text.setTextColor(ContextCompat.getColor(Activity, TextColor));
            } else {
                // Set Drawable COlor
                text.setTextColor(Activity.getResources().getColor(TextColor));
            }
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(Activity);
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }


        return toastInfo;
    }

    public static Toast makeCustomToast(@NonNull Context Context,
                                        @StringRes int Message,
                                        @ColorRes int TextColor,
                                        @FontRes int Font,
                                        int Length,
                                        boolean Icon,
                                        @DrawableRes int icon,
                                        @DrawableRes int Background) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity)Context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_custom_toast, ((Activity)Context).findViewById(R.id.custom_custom_toast_icon_container));
            // Instance Of LinearLayout To set Background
            RelativeLayout background = (RelativeLayout) layout.findViewById(R.id.custom_custom_toast_icon_container);
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Initiate Typeface to Set Font
            Typeface typeface = ((Activity)Context).getResources().getFont(Font);
            // Initiate Image View > Set Icon
            ImageView imageView = layout.findViewById(R.id.toastIconCustom);
            // Setting Visible To Icon
            if(android.os.Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Icon
                imageView.setBackgroundDrawable(ContextCompat.getDrawable(((Activity)Context), icon));
                // Set Drawable Background
                background.setBackgroundDrawable(ContextCompat.getDrawable(((Activity)Context), Background));
            } else {
                // Set Drawable Icon
                imageView.setBackground(ContextCompat.getDrawable(((Activity)Context), icon));
                // Set Drawable Background
                background.setBackground(ContextCompat.getDrawable(((Activity)Context), Background));
            }
            if(android.os.Build.VERSION.SDK_INT >= 23) {
                // Set Drawable Color
                text.setTextColor(ContextCompat.getColor(((Activity)Context), TextColor));
            } else {
                // Set Drawable COlor
                text.setTextColor(((Activity)Context).getResources().getColor(TextColor));
            }
            // Set Test Message To Toast
            text.setText(Message);
            text.setTypeface(typeface);
            // Instance Toast
            toastInfo = new Toast(((Activity)Context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity)Context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_custom_toast_icon_false, ((Activity)Context).findViewById(R.id.custom_toast_custom_icon_false_container));
            // Instance Of LinearLayout To set Background
            RelativeLayout background = (RelativeLayout) layout.findViewById(R.id.custom_toast_custom_icon_false_container);
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Initiate Typeface to Set Font
            Typeface typeface = ((Activity)Context).getResources().getFont(Font);
            // Setting Visible To Icon
            if(android.os.Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Background
                background.setBackgroundDrawable(ContextCompat.getDrawable(((Activity)Context), Background));
            } else {
                // Set Drawable Background
                background.setBackground(ContextCompat.getDrawable(((Activity)Context), Background));
            }
            if(android.os.Build.VERSION.SDK_INT >= 23) {
                // Set Drawable Color
                text.setTextColor(ContextCompat.getColor(((Activity)Context), TextColor));
            } else {
                // Set Drawable COlor
                text.setTextColor(((Activity)Context).getResources().getColor(TextColor));
            }
            // Set Test Message To Toast
            text.setText(Message);
            text.setTypeface(typeface);
            // Instance Toast
            toastInfo = new Toast(((Activity)Context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }

        return toastInfo;
    }


    public static Toast makeCustomToast(@NonNull Context Context,
                                        @StringRes int Message,
                                        @ColorRes int TextColor,
                                        int Length,
                                        boolean Icon,
                                        @DrawableRes int icon,
                                        @DrawableRes int Background) {
        Toast toastInfo = null;
        // Setting Visible To Icon
        if (Icon == true){
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity)Context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_custom_toast, ((Activity)Context).findViewById(R.id.custom_custom_toast_icon_container));
            // Instance Of LinearLayout To set Background
            RelativeLayout background = (RelativeLayout) layout.findViewById(R.id.custom_custom_toast_icon_container);
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Initiate Image View > Set Icon
            ImageView imageView = layout.findViewById(R.id.toastIconCustom);
            // Setting Visible To Icon
            if(android.os.Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Icon
                imageView.setBackgroundDrawable(ContextCompat.getDrawable(((Activity)Context), icon));
                // Set Drawable Background
                background.setBackgroundDrawable(ContextCompat.getDrawable(((Activity)Context), Background));
            } else {
                // Set Drawable Icon
                imageView.setBackground(ContextCompat.getDrawable(((Activity)Context), icon));
                // Set Drawable Background
                background.setBackground(ContextCompat.getDrawable(((Activity)Context), Background));
            }
            if(android.os.Build.VERSION.SDK_INT >= 23) {
                // Set Drawable Color
                text.setTextColor(ContextCompat.getColor(((Activity)Context), TextColor));
            } else {
                // Set Drawable COlor
                text.setTextColor(((Activity)Context).getResources().getColor(TextColor));
            }
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity)Context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        } else if (Icon == false) {
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity)Context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_custom_toast_icon_false, ((Activity)Context).findViewById(R.id.custom_toast_custom_icon_false_container));
            // Instance Of LinearLayout To set Background
            RelativeLayout background = (RelativeLayout) layout.findViewById(R.id.custom_toast_custom_icon_false_container);
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Setting Visible To Icon
            if(android.os.Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Background
                background.setBackgroundDrawable(ContextCompat.getDrawable(((Activity)Context), Background));
            } else {
                // Set Drawable Background
                background.setBackground(ContextCompat.getDrawable(((Activity)Context), Background));
            }
            if(android.os.Build.VERSION.SDK_INT >= 23) {
                // Set Drawable Color
                text.setTextColor(ContextCompat.getColor(((Activity)Context), TextColor));
            } else {
                // Set Drawable COlor
                text.setTextColor(((Activity)Context).getResources().getColor(TextColor));
            }
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity)Context));
            // Set Gravity To Toast
            toastInfo.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
            // Set length To Toast Message!
            toastInfo.setDuration(Length);
            // Set Custom View To Toast Message!
            toastInfo.setView(layout);
            // Show Toast Message!
//            toastInfo.show();

        }


        return toastInfo;
    }

}
