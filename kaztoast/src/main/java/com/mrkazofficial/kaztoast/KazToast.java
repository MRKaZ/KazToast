package com.mrkazofficial.kaztoast;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
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

    //public static final int VISIBLE = View.VISIBLE;
    //public static final int INVISIBLE = View.INVISIBLE;

    //public static final int VISIBLE_INT = 0x00000000; // == int 0
    //public static final int INVISIBLE_INT = 0x00000004; // == int 4

    public KazToast(Activity _activity){

        this.activity = _activity;
    }

    /*Info Custom Toast*/

    public static Toast makeInfoToast(@NonNull Context context, CharSequence Message, int Length) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_info_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeInfoToast(@NonNull Context context, @StringRes int Message, int Length) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_info_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeInfoToast(@NonNull Context context, CharSequence Message, int Length, boolean Icon) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_info_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.toastIconInfo);
        if (Icon == true){
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeInfoToast(@NonNull Context context, @StringRes int Message, int Length, boolean Icon) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_info_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.toastIconInfo);
        if (Icon == true){
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeInfoToast(
            @NonNull Context context,
            @StringRes int Message,
            int Length, boolean Icon,
            @DrawableRes int setIcon,
            @DrawableRes int Background) {

        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_info_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.toastIconInfo);
        RelativeLayout background = (RelativeLayout) view.findViewById(R.id.custom_toast_container);
        if (Icon == true){
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        if(Build.VERSION.SDK_INT >= 21) {
            // Set Drawable Icon
            imageView.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) context), setIcon));
            // Set Drawable Background
            background.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) context), Background));
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                // Set Drawable Icon
                imageView.setBackground(ContextCompat.getDrawable(((Activity) context), setIcon));
                // Set Drawable Background
                background.setBackground(ContextCompat.getDrawable(((Activity) context), Background));
            }
        }
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }


    /*Warning Custom Toast*/

    public static Toast makeWarnToast(@NonNull Context context, CharSequence Message, int Length) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_warn_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeWarnToast(@NonNull Context context, @StringRes int Message, int Length) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_warn_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeWarnToast(@NonNull Context context, CharSequence Message, int Length, boolean Icon) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_warn_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.toastIconWarn);
        if (Icon == true){
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeWarnToast(@NonNull Context context, @StringRes int Message, int Length, boolean Icon) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_warn_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.toastIconWarn);
        if (Icon == true){
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeWarnToast(
            @NonNull Context context,
            @StringRes int Message,
            int Length, boolean Icon,
            @DrawableRes int setIcon,
            @DrawableRes int Background) {

        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_warn_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.toastIconWarn);
        RelativeLayout background = (RelativeLayout) view.findViewById(R.id.custom_warn_toast_container);
        if (Icon == true){
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        if(Build.VERSION.SDK_INT >= 21) {
            // Set Drawable Icon
            imageView.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) context), setIcon));
            // Set Drawable Background
            background.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) context), Background));
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                // Set Drawable Icon
                imageView.setBackground(ContextCompat.getDrawable(((Activity) context), setIcon));
                // Set Drawable Background
                background.setBackground(ContextCompat.getDrawable(((Activity) context), Background));
            }
        }
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    /*Error Custom Toast*/

    public static Toast makeErrorToast(@NonNull Context context, CharSequence Message, int Length) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_error_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeErrorToast(@NonNull Context context, @StringRes int Message, int Length) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_error_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeErrorToast(@NonNull Context context, CharSequence Message, int Length, boolean Icon) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_error_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.toastIconError);
        if (Icon == true){
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeErrorToast(@NonNull Context context, @StringRes int Message, int Length, boolean Icon) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_error_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.toastIconError);
        if (Icon == true){
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeErrorToast(
            @NonNull Context context,
            @StringRes int Message,
            int Length,
            boolean Icon,
            @DrawableRes int setIcon,
            @DrawableRes int Background) {

        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_error_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.toastIconError);
        RelativeLayout background = (RelativeLayout) view.findViewById(R.id.custom_error_toast_container);
        if (Icon == true){
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        if(Build.VERSION.SDK_INT >= 21) {
            // Set Drawable Icon
            imageView.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) context), setIcon));
            // Set Drawable Background
            background.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) context), Background));
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                // Set Drawable Icon
                imageView.setBackground(ContextCompat.getDrawable(((Activity) context), setIcon));
                // Set Drawable Background
                background.setBackground(ContextCompat.getDrawable(((Activity) context), Background));
            }
        }
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    /*Success Custom Toast*/

    public static Toast makeSuccessToast(@NonNull Context context,
                                         CharSequence Message,
                                         int Length) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_success_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeSuccessToast(@NonNull Context context,
                                         @StringRes int Message,
                                         int Length) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_success_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeSuccessToast(@NonNull Context context,
                                         String Message,
                                         int Length,
                                         boolean Icon) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_success_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.toastIconSuccess);

        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams)textView.getLayoutParams();
        params.setMargins(0, 0, 12, 0); //substitute parameters for left, top, right, bottom

        if (Icon == true){
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
            textView.setLayoutParams(params);
        }
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeSuccessToast(@NonNull Context context,
                                         @StringRes int Message,
                                         int Length,
                                         boolean Icon) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_success_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.toastIconSuccess);

        if (Icon == true){
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    public static Toast makeSuccessToast(
            @NonNull Context context,
            @StringRes int Message,
            int Length,
            boolean Icon,
            @DrawableRes int setIcon,
            @DrawableRes int Background) {

        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.custom_success_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.text);
        ImageView imageView = (ImageView) view.findViewById(R.id.toastIconSuccess);
        RelativeLayout background = (RelativeLayout) view.findViewById(R.id.custom_success_toast_container);
        if (Icon == true){
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        if(Build.VERSION.SDK_INT >= 21) {
            // Set Drawable Icon
            imageView.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) context), setIcon));
            // Set Drawable Background
            background.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) context), Background));
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                // Set Drawable Icon
                imageView.setBackground(ContextCompat.getDrawable(((Activity) context), setIcon));
                // Set Drawable Background
                background.setBackground(ContextCompat.getDrawable(((Activity) context), Background));
            }
        }
        textView.setText(Message);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 50);
        toast.setDuration(Length);
        return toast;
    }

    /*Custom Toast*/

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
        if (Icon == true) {
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) Context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_custom_toast, ((Activity) Context).findViewById(R.id.custom_custom_toast_icon_container));
            // Instance Of LinearLayout To set Background
            RelativeLayout background = (RelativeLayout) layout.findViewById(R.id.custom_custom_toast_icon_container);
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Initiate Typeface to Set Font
            Typeface typeface = null;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                typeface = ((Activity) Context).getResources().getFont(Font);
            }
            // Initiate Image View > Set Icon
            ImageView imageView = layout.findViewById(R.id.toastIconCustom);
            // Setting Visible To Icon
            if (Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Icon
                imageView.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) Context), icon));
                // Set Drawable Background
                background.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) Context), Background));
            } else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    // Set Drawable Icon
                    imageView.setBackground(ContextCompat.getDrawable(((Activity) Context), icon));
                    // Set Drawable Background
                    background.setBackground(ContextCompat.getDrawable(((Activity) Context), Background));
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                // Set Drawable Color
                text.setTextColor(ContextCompat.getColor(((Activity) Context), TextColor));
            } else {
                // Set Drawable COlor
                text.setTextColor(((Activity) Context).getResources().getColor(TextColor));
            }
            // Set Test Message To Toast
            text.setText(Message);
            text.setTypeface(typeface);
            // Instance Toast
            toastInfo = new Toast(((Activity) Context));
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
            LayoutInflater inflater = ((Activity) Context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_custom_toast, ((Activity) Context).findViewById(R.id.custom_custom_toast_icon_container));
            // Instance Of LinearLayout To set Background
            RelativeLayout background = (RelativeLayout) layout.findViewById(R.id.custom_custom_toast_icon_container);
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            ImageView imageView = layout.findViewById(R.id.toastIconCustom);
            imageView.setVisibility(View.GONE);
            // Initiate Typeface to Set Font
            Typeface typeface = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                typeface = ((Activity) Context).getResources().getFont(Font);
            }
            // Setting Visible To Icon
            if (Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Background
                background.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) Context), Background));
            } else {
                // Set Drawable Background
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    background.setBackground(ContextCompat.getDrawable(((Activity) Context), Background));
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                // Set Drawable Color
                text.setTextColor(ContextCompat.getColor(((Activity) Context), TextColor));
            } else {
                // Set Drawable Color
                text.setTextColor(((Activity) Context).getResources().getColor(TextColor));
            }
            // Set Test Message To Toast
            text.setText(Message);
            text.setTypeface(typeface);
            // Instance Toast
            toastInfo = new Toast(((Activity) Context));
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
        if (Icon == true) {
            // Instance of LayoutInflater
            LayoutInflater inflater = ((Activity) Context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_custom_toast, ((Activity) Context).findViewById(R.id.custom_custom_toast_icon_container));
            // Instance Of LinearLayout To set Background
            RelativeLayout background = (RelativeLayout) layout.findViewById(R.id.custom_custom_toast_icon_container);
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            // Initiate Typeface to Set Font
            // Initiate Image View > Set Icon
            ImageView imageView = layout.findViewById(R.id.toastIconCustom);
            // Setting Visible To Icon
            if (Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Icon
                imageView.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) Context), icon));
                // Set Drawable Background
                background.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) Context), Background));
            } else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    // Set Drawable Icon
                    imageView.setBackground(ContextCompat.getDrawable(((Activity) Context), icon));
                    // Set Drawable Background
                    background.setBackground(ContextCompat.getDrawable(((Activity) Context), Background));
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                // Set Drawable Color
                text.setTextColor(ContextCompat.getColor(((Activity) Context), TextColor));
            } else {
                // Set Drawable COlor
                text.setTextColor(((Activity) Context).getResources().getColor(TextColor));
            }
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) Context));
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
            LayoutInflater inflater = ((Activity) Context).getLayoutInflater();
            // Initiate LayoutInflater R.id
            View layout = inflater.inflate(R.layout.custom_custom_toast, ((Activity) Context).findViewById(R.id.custom_custom_toast_icon_container));
            // Instance Of LinearLayout To set Background
            RelativeLayout background = (RelativeLayout) layout.findViewById(R.id.custom_custom_toast_icon_container);
            // Initiate Text View  R.id > Toast Custom Text
            TextView text = layout.findViewById(R.id.text);
            ImageView imageView = layout.findViewById(R.id.toastIconCustom);
            imageView.setVisibility(View.GONE);
            // Initiate Typeface to Set Font
            // Setting Visible To Icon
            if (Build.VERSION.SDK_INT >= 21) {
                // Set Drawable Background
                background.setBackgroundDrawable(ContextCompat.getDrawable(((Activity) Context), Background));
            } else {
                // Set Drawable Background
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    background.setBackground(ContextCompat.getDrawable(((Activity) Context), Background));
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                // Set Drawable Color
                text.setTextColor(ContextCompat.getColor(((Activity) Context), TextColor));
            } else {
                // Set Drawable COlor
                text.setTextColor(((Activity) Context).getResources().getColor(TextColor));
            }
            // Set Test Message To Toast
            text.setText(Message);
            // Instance Toast
            toastInfo = new Toast(((Activity) Context));
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
