========================================================================
Copyright 2013, CommuteStream. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
========================================================================

SimpleBanner is a basic example of how to use the CommuteStream SDK.

Requirements:
- Android SDK 3.2 or higher
- Google AdMob Ads SDK for Android
- CommuteStream SDK for Android
- AdMob Ad ID
- Eclipse (recommended)

Getting started with SimpleBanner in Eclipse:
1. Create an Android project from existing source.
   - Create a new Android Project in Eclipse, and select "Create project from
     existing source."
   - Browse to the base directory of the source code.  The Project Name and
     Target name should be populated.  Click Finish.
2. Add the Google AdMob Ads Jar to your Eclipse Project.
   - Right click on your app project in Eclipse and select "Properties.
   - Select "Java Build Path" and the "Libraries" tab. 
   - Click "Add External JARs..." to add the Google AdMob Ads Jar.
   - Select the Order and Export tab; check the box next to the Jar file.
3. Add the CommuteStream Jar file to your Eclipse Project.
   - Download from https://commutestreamdev.com/downloads/commutestream.jar
   - Include this jar the same way as the Google AdMob Ads jar in step 2.
4. Add the android-support-v4.jar to your Eclipse Project.
   - The android-support-v4.jar is included in the Android Compatibility
     package.  For instructions on how to download this package, visit
     http://developer.android.com/sdk/compatibility-library.html#Downloading.
   - Include this jar the same way as the Google AdMob Ads jar in step 2s.
5. Insert your AdMob publisher ID into the application.
   - In the admob_id string in res/values/strings.xml, replace the
     "INSERT_YOUR_ADMOB_AD_ID_HERE" text with your publisher ID.

