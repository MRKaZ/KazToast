package com.mrkazofficial.customtoasts;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.mrkazofficial.kaztoast.KazToast;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Remove Title Action Bar
        getSupportActionBar().hide();
        // Initiate Radio Info Group
        RadioGroup radioGroupInfo = findViewById(R.id.radioGroup);
        // Button Info
        this.findViewById(R.id.btnInfo).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Switch Radio Group Radio Buttons ID
                switch (radioGroupInfo.getCheckedRadioButtonId()){
                    // With Icon Radio Button
                    case R.id.radioWithIcon:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeInfoToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_info_message, // Message
                                KazToast.LENGTH_SHORT, // To Toast LENGTH Or Use - 0 Integer
                                true) // Boolean icon == true / false
                                .show(); // Show Toast
                        break;

                    // Without Icon Radio Button
                    case R.id.radioWithoutIcon:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeInfoToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_info_message, // Message
                                KazToast.LENGTH_SHORT, // Or Use - 0 Integer
                                false) // Boolean icon == true / false
                                .show(); // Show Toast
                        break;

                    // With Custom Icon Radio Button
                    case R.id.radioInfoWithCustomIcon:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeInfoToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_warn_message, // Message
                                KazToast.LENGTH_SHORT, // Or Use - 0 Integer
                                true, // Boolean icon == true / false
                                R.drawable.ic_kaz_toast_logo) // Set Custom Icon
                                .show(); // Show Toast
                        break;
                }
            }
        });

        // Initiate Warning Radio Group
        RadioGroup radioGroupWarn = findViewById(R.id.radioGroupWarn);
        // Button Warning
        this.findViewById(R.id.btnWarn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Switch Radio Group Radio Buttons ID
                switch (radioGroupWarn.getCheckedRadioButtonId()){
                    // With Icon Radio Button
                    case R.id.radioWithIconWarn:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeWarnToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_warn_message, // Message
                                KazToast.LENGTH_SHORT, // Or Use - 0 Integer
                                true) // Boolean icon == true / false
                                .show(); // Show Toast
                        break;

                    // Without Icon Radio Button
                    case R.id.radioWithoutIconWarn:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeWarnToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_warn_message, // Message
                                KazToast.LENGTH_SHORT, // Or Use - 0 Integer
                                false) // Boolean icon == true / false
                                .show(); // Show Toast
                        break;

                    // With Custom Icon Radio Button
                    case R.id.radioWarnWithCustomIcon:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeWarnToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_warn_message, // Message
                                KazToast.LENGTH_SHORT, // Or Use - 0 Integer
                                true, // Boolean icon == true / false
                                R.drawable.ic_kaz_toast_logo) // Set Custom Icon
                                .show(); // Show Toast
                        break;
                }
            }
        });

        // Initiate Error Radio Group
        RadioGroup radioGroupError = findViewById(R.id.radioGroupError);
        // Button Error
        this.findViewById(R.id.btnError).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Switch Radio Group Radio Buttons ID
                switch (radioGroupError.getCheckedRadioButtonId()){
                    // With Icon Radio Button
                    case R.id.radioWithIconError:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeErrorToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_warn_message, // Message
                                KazToast.LENGTH_SHORT, // Or Use - 0 Integer
                                true) // Boolean icon == true / false
                                .show(); // Show Toast
                        break;

                    // Without Icon Radio Button
                    case R.id.radioWithoutIconError:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeErrorToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_warn_message, // Message
                                KazToast.LENGTH_SHORT, // Or Use - 0 Integer
                                false) // Boolean icon == true / false
                                .show(); // Show Toast
                        break;

                    // With Custom Icon Radio Button
                    case R.id.radioErrorWithCustomIcon:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeErrorToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_warn_message, // Message
                                KazToast.LENGTH_SHORT, // Or Use - 0 Integer
                                true, // Boolean icon == true / false
                                R.drawable.ic_kaz_toast_logo) // Set Custom Icon
                                .show(); // Show Toast
                        break;
                }
            }
        });

        // Initiate Success Radio Group
        RadioGroup radioGroupSuccess = findViewById(R.id.radioGroupSuccess);
        // Button Success
        this.findViewById(R.id.btnSuccess).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Switch Radio Group Radio Buttons ID
                switch (radioGroupSuccess.getCheckedRadioButtonId()){
                    // With Icon Radio Button
                    case R.id.radioWithIconSuccess:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeSuccessToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_warn_message, // Message
                                KazToast.LENGTH_SHORT, // Or Use - 0 Integer
                                true) // Boolean icon == true / false
                                .show(); // Show Toast
                        break;

                    // Without Icon Radio Button
                    case R.id.radioWithoutIconSuccess:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeSuccessToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_warn_message, // Message
                                KazToast.LENGTH_SHORT, // Or Use - 0 Integer
                                false) // Boolean icon == true / false
                                .show(); // Show Toast
                        break;

                    // With Custom Icon Radio Button
                    case R.id.radioSuccessWithCustomIcon:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeSuccessToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_warn_message, // Message
                                KazToast.LENGTH_SHORT, // Or Use - 0 Integer
                                true, // Boolean icon == true / false
                                R.drawable.ic_kaz_toast_logo) // Set Custom Icon
                                .show(); // Show Toast
                        break;
                }
            }
        });

        // Initiate Success Radio Group
        RadioGroup radioGroupCustom = findViewById(R.id.radioGroupCustom);
        // Button Success
        this.findViewById(R.id.btnCustom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Switch Radio Group Radio Buttons ID
                switch (radioGroupCustom.getCheckedRadioButtonId()){
                    // With Icon Radio Button
                    case R.id.radioWithIconCustom:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeCustomToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_warn_message, // Message
                                R.color.white, // Set Text Color
                                R.font.internet, // Set Font
                                KazToast.LENGTH_SHORT, // Or Use - 0 Integer
                                true, // Boolean icon == true / false
                                R.drawable.ic_github, // Set Custom Icon
                                R.drawable.toast_custom_test_background) // Boolean icon == true / false
                                .show(); // Show Toast
                        break;
                        
                    // Without Icon Radio Button
                    case R.id.radioWithoutIconCustom:
                        // CustomToast.{makeYourChoice}
                        KazToast.makeCustomToast(
                                MainActivity.this, // Activity Or Context
                                R.string.toast_warn_message, // Message
                                R.color.white, // Set Text Color
                                KazToast.LENGTH_SHORT, // Or Use - 0 Integer
                                true, // Boolean icon == true / false
                                R.drawable.ic_github, // Set Custom Icon
                                R.drawable.toast_custom_test_background) // Boolean icon == true / false
                                .show(); // Show Toast
                        break;

                }
            }
        });
    }
}