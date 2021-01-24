# KazToast
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)

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

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.MRKaZ:KazToast:1.0'
	//implementation 'com.github.MRKaZ:KazToast:Tag'
}
```
