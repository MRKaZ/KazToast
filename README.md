# KazToast
[![](https://jitpack.io/v/MRKaZ/KazToast.svg)](https://jitpack.io/#MRKaZ/KazToast)

<div align="center">
	<img src="https://i.imgur.com/H2jEq9x.png" width="128">
</div>

Make Your Custom Toast Here!.

## Prerequisites

Add this in your root `build.gradle` file (**not** in your `build.gradle.app` add it into your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file:

```gradle
dependencies {
	...
	implementation 'com.github.MRKaZ:KazToast:1.3'
	//implementation 'com.github.MRKaZ:KazToast:Tag'
}
```

## Based Config Method..

KazToast Based on This Config Method Follow This:

**First Config Mehtod!, Using @StringRes int**

```java
Toast makeWarnToast(@NonNull Activity Activity,
                    @StringRes int Message,
                    int Length,
                    boolean Icon)
```

**Second Config Mehtod!, Using String**

```java
Toast makeWarnToast(@NonNull Activity Activity,
                    String Message,
                    int Length,
                    boolean Icon)
```

## Important.

Dont forget to add `.show()` in the end of KazToast:

```java
.show() // Required KazToast
```

## Usage

KazToast method always returns to a `KazToast == Toast` object, so you can customize your Toast as you need!.
 **DON'T FORGET THE `.show()` METHOD!**
 
To Display an **Success** KazToast:

``` java
		// KazToast.{makeYourChoice}
                KazToast.makeSuccessToast(
                    	MainActivity.this, // Activity Or Context
                    	R.string.toast_info_message, // Use String Message or Use int Message
                    	KazToast.LENGTH_SHORT, // To Toast LENGTH Use KazToast.LENGTH_SHORT / LENGTH_LONG Or Use int = 0 / 1
                    	true) // Boolean Icon Displaying == true / false
                    	.show(); // Show Toast! Required!
```

Display an **Success** KazToast With **Custom Icon**:

``` java
		// KazToast.{makeYourChoice}
                KazToast.makeSuccessToast(
                	MainActivity.this, // Activity Or Context
                    	R.string.toast_info_message, // Use String Message or Use int Message
                    	KazToast.LENGTH_SHORT, // To Toast LENGTH Use KazToast.LENGTH_SHORT / LENGTH_LONG Or Use int = 0 / 1
                    	R.drawable.ic_kaz_toast_logo) // Set Custom Icon ; Default Method int
                   	true) // Boolean Icon Displaying == true / false
                    	.show(); // Show Toast! Required!
```

To Display an **Info** KazToast:

``` java
		// KazToast.{makeYourChoice}
                KazToast.makeInfoToast(
                	MainActivity.this, // Activity Or Context
                	R.string.toast_info_message, // Use String Message or Use int Message
                	KazToast.LENGTH_SHORT, // To Toast LENGTH Use KazToast.LENGTH_SHORT / LENGTH_LONG Or Use int = 0 / 1
                	true) // Boolean Icon Displaying == true / false
                	.show(); // Show Toast! Required!
```

Display an **Info** KazToast With **Custom Icon**:

``` java
		// KazToast.{makeYourChoice}
                KazToast.makeInfoToast(
               		MainActivity.this, // Activity Or Context
                	R.string.toast_info_message, // Use String Message or Use int Message
               		KazToast.LENGTH_SHORT, // To Toast LENGTH Use KazToast.LENGTH_SHORT / LENGTH_LONG Or Use int = 0 / 1
                	R.drawable.ic_kaz_toast_logo) // Set Custom Icon ; Default Method int
                	true) // Boolean Icon Displaying == true / false
                	.show(); // Show Toast! Required!
```

To Display an **Warning** KazToast:

``` java
		// KazToast.{makeYourChoice}
                KazToast.makeWarnToast(
                    	MainActivity.this, // Activity Or Context
                    	R.string.toast_info_message, // Use String Message or Use int Message
                    	KazToast.LENGTH_SHORT, // To Toast LENGTH Use KazToast.LENGTH_SHORT / LENGTH_LONG Or Use int = 0 / 1
                    	true) // Boolean Icon Displaying == true / false
                    	.show(); // Show Toast! Required!
```

Display an **Warning** KazToast With **Custom Icon**:

``` java
		// KazToast.{makeYourChoice}
                KazToast.makeWarnToast(
                	MainActivity.this, // Activity Or Context
                    	R.string.toast_info_message, // Use String Message or Use int Message
                    	KazToast.LENGTH_SHORT, // To Toast LENGTH Use KazToast.LENGTH_SHORT / LENGTH_LONG Or Use int = 0 / 1
                    	R.drawable.ic_kaz_toast_logo) // Set Custom Icon ; Default Method int
                   	true) // Boolean Icon Displaying == true / false
                    	.show(); // Show Toast! Required!
```

To Display an **Error** KazToast:

``` java
		// KazToast.{makeYourChoice}
                KazToast.makeErrorToast(
                    	MainActivity.this, // Activity Or Context
                    	R.string.toast_info_message, // Use String Message or Use int Message
                    	KazToast.LENGTH_SHORT, // To Toast LENGTH Use KazToast.LENGTH_SHORT / LENGTH_LONG Or Use int = 0 / 1
                    	true) // Boolean Icon Displaying == true / false
                    	.show(); // Show Toast! Required!
```

Display an **Error** KazToast With **Custom Icon**:

``` java
		// KazToast.{makeYourChoice}
                KazToast.makeErrorToast(
                	MainActivity.this, // Activity Or Context
                    	R.string.toast_info_message, // Use String Message or Use int Message
                    	KazToast.LENGTH_SHORT, // To Toast LENGTH Use KazToast.LENGTH_SHORT / LENGTH_LONG Or Use int = 0 / 1
                    	R.drawable.ic_kaz_toast_logo) // Set Custom Icon ; Default Method int
                   	true) // Boolean Icon Displaying == true / false
                    	.show(); // Show Toast! Required!
```

To Display an **Custom** KazToast:

``` java
		// CustomToast.{makeYourChoice}
                KazToast.makeCustomToast(
                        MainActivity.this, // Activity Or Context
                        R.string.toast_warn_message, // Use String Message or Use int Message
                        R.color.white, // Set Text Color
                        R.font.internet, // Set Font
                        KazToast.LENGTH_SHORT, // To Toast LENGTH Use KazToast.LENGTH_SHORT / LENGTH_LONG Or Use int = 0 / 1
                        true, // Boolean icon == true / false
                        R.drawable.ic_male_user, // Set Custom Icon
                        R.drawable.toast_custom_test_background) // Boolean icon == true / false
                        .show(); // Show Toast
```

Display an **Custom** KazToast With **Without Font**:

``` java
		// CustomToast.{makeYourChoice}
                KazToast.makeCustomToast(
                        MainActivity.this, // Activity Or Context
                        R.string.toast_warn_message, // Use String Message or Use int Message
                        R.color.white, // Set Text Color
                        KazToast.LENGTH_SHORT, // To Toast LENGTH Use KazToast.LENGTH_SHORT / LENGTH_LONG Or Use int = 0 / 1
                        true, // Boolean icon == true / false
                        R.drawable.ic_male_user, // Set Custom Icon
                        R.drawable.toast_custom_test_background) // Boolean icon == true / false
                        .show(); // Show Toast
```

# Drawable Background

**KazToast Default Drawable Background**

``` xml 
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
<gradient
    android:startColor="#00FF66" 
    android:endColor="#00B73E"
    android:angle="315"/>

    <corners android:radius="25dp"/>

    <!--6F6F6F-->

    <stroke
        android:color="#6F6F6F"
        android:dashWidth="4dp"
        android:dashGap="0dp"
        android:width="0.5dp"/>
</shape>
````

| **Toast** | **Preview** |
| --- | --- |
| **Success** | <p align="center" width="100%">    <img width="100%" src="https://i.imgur.com/FWlL45i.png"> </p> |
| **Info** | <p align="center" width="100%">    <img width="100%" src="https://i.imgur.com/gjCvtZh.png"> </p> |
| **Warning** | <p align="center" width="100%">    <img width="100%" src="https://i.imgur.com/wsXya16.png"> </p> |
| **Error** | <p align="center" width="100%">    <img width="100%" src="https://i.imgur.com/s5jRqwx.png"> </p> |
| **Custom** | <p align="center" width="100%">    <img width="100%" src="https://i.imgur.com/lkQwPaf.png"> </p> |


## Preview

**Quick Preview GIF**

<div align="center">
	<img src="https://github.com/MRKaZ/KazToast/blob/master/Preview.gif">
</div>

--
