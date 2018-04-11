MediaCodecTestRun
=================================

This application is a sample Android Studio project with MediaCodec Test Run.



Usage
-----

copy the 4 files in your project

step1 : 

1.CodecManager.java
2.MediaCodecTest.java
3.NV21Convertor.java
4.VideoQuality.java

step2:
init MediaCodecTest like : 
```
        if(mMediaCodeTest == null) {
            MediaCodeTest.Builder builder = new MediaCodeTest.Builder(this);
            mMediaCodeTest = builder.build(3840, 2160, 15, 500000);//int resX, int resY, int framerate, int bitrate
            mMediaCodeTest.onStartTest();
        }
```
step3:
* Grant camera permission
  * Add the following lines in the `AndroidManifest.xml` file

    ```
    <uses-feature android:name="android.hardware.camera" />
    <uses-feature android:name="android.hardware.camera.autofocus" />
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.RECORD_AUDIO" />
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.WAKE_LOCK" />
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
    ```



