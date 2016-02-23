# DataBindingSample
--------------
This project is a sample for using DataBinding library in your project.I have used few features of DataBinding in this project such as:

- Setting text into TextView using DataBinding library
- Setting text into ListView using DataBinding library


Pre-requisites
--------------

- Android SDK v23
- Android Build Tools v23.0.2
- Android Support repository(Available In Extra in SDK Manager)


How to install DataBinding In your Project
--------------
1. To get started with Data Binding, download the library from the Support repository in the Android SDK manager.
2. To configure your app to use data binding, add the dataBinding element to your build.gradle file in the app module.
3. Add following in build.gradle project file classpath 
  - **classpath 'com.android.tools.build:gradle:1.5.0'**
  - **classpath 'com.android.databinding:dataBinder:1.+'**
4. Add following in build.gradle app file <br>
 - **apply plugin: 'com.android.databinding'**

By default, a Binding class will be generated based on the name of the layout file, cnverting it to Pascal case suffixing “Binding” to it.
 
On the Java File
--------------
```java
  ActivitySimpleTextViewBinding activitySimpleTextViewBinding= DataBindingUtil.setContentView(this,R.layout.activity_simple_text_view);
  activitySimpleTextViewBinding.setUserdata(new User("Faisal","Khan"));
  ```
  
On the xml file
--------------
```xml
<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <data>
        <!--accessing reference in which we have data-->
        <variable name="userdata" type="com.example.faisal.databindingsample.Model.User" />
    </data>......
    
     <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="@dimen/activity_vertical_margin"
            android:text="@{userdata.firstName}" />.....
 
```
Screenshots
--------------
![screen1](https://cloud.githubusercontent.com/assets/7554816/13248837/a9837500-da46-11e5-85d6-4654f7120c68.png)
![screen2](https://cloud.githubusercontent.com/assets/7554816/13248839/a996fdd2-da46-11e5-8823-84e9a598b4ce.png)
![screen3](https://cloud.githubusercontent.com/assets/7554816/13248838/a9843f44-da46-11e5-96c1-d53d41a5d1c7.png)
