# KazToast
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14) [![](https://github.com/MRKaZ/KazToast/blob/master/app/src/main/res/mipmap-xxxhdpi/ic_launcher_round.png)](https://jitpack.io/#MRKaZ/KazToast/1.0)

<div align="center">
	<img src="https://i.imgur.com/H2jEq9x.png" width="128">
</div>

Make Your Custom Toast Here!.

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.MRKaZ:KazToast:1.0'
	//implementation 'com.github.MRKaZ:KazToast:Tag'
}
```
