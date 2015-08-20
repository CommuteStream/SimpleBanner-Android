#This Eclipse project is outdated. Please refer to the Android Studio app for a more current example of how to use the CommuteStream SDK: https://github.com/CommuteStream/SimpleBanner-AndroidStudio

## Introduction
SimpleBanner provides a basic example of how to use the CommuteStream SDK. These instructions are designed for Eclipse users.

## Requirements:
- Android SDK 3.2 or higher
- Google Play Services SDK and Google Mobile Ads SDK for Android
- CommuteStream SDK for Android
- Working AdMob Ad ID
- Eclipse 

## Getting started with SimpleBanner in Eclipse

#### Download or clone SimpleBanner from GitHub.
1. https://github.com/CommuteStream/simplebanner.git
2. In Eclipse, Click the **File** menu, and select **Import**.
3. Select **Existing Android Code Into Workspace**, click **Next**.
4. Click the **Browse** button and select the base directory of the source code. 
5. Click **Finish**.

#### Make sure you're compiling against at least Android v3.2 
1. Right click on your app project in Eclipse and select **Properties**.
2. Select **Android** and make sure you have selected a version greater that 3.2 under **Project Build Target**. 

#### Add the Google Play Services and Mobile Ads SDK to your Eclipse Project.
1. If you havn't already, install Google Play Services: https://developer.android.com/sdk/installing/adding-packages.html
2. Right click on your app project in Eclipse and select Properties.
3. Select Android and then click Add.... Find the google-play-services_lib project and select OK to add the Google Play services library.

#### Add the CommuteStream Jar file to your Eclipse Project.
1. Download the jar file from https://commutestreamdev.com/downloads/commutestream.jar
2. Right click on your app project in Eclipse and select **Properties**.
3. Select **Java Build Path** and the **Libraries** tab. 
4. Click **Add External JARs...** to add the CommuteStream Jar file.
5. Select the **Order and Export** tab; check the box next to the Jar file.

#### Add the android-support-v4.jar to your Eclipse Project.
1. The android-support-v4.jar is included in the Android SDK in the \extras\android\support\v4 folder. Visit http://developer.android.com/sdk/compatibility-library.html#Downloading for more information.
2. Include this jar the same way as the CommuteStream jar above.

#### Insert your AdMob Ad Unit ID into the application.
1. Log into the AdMob interface (https://apps.admob.com/).
2. Setup a new **+ New ad unit** or find an Ad Unit ID that you already have setup.
3. In SimpleBanner.java, replace "INSERT_YOUR_ADMOB_AD_UNIT_ID_HERE" with the valid Ad unit ID.

#### Add CommuteStream as an AdMob ad network
1. Go to http://commutestream.com/publisherinterface/app. After signing in you will be provided with a CommuteStream Ad Unit ID. Leave the browser window open, as we will need this ID in step 8 below.
2. Log into the AdMob interface (https://apps.admob.com/).
3. Click on **Monetize** tab of main menu. 
4. Click on **All apps** in left column, then select the app that contains the ad unit you are using.
5. On the right side of the screen click **Edit mediation** link next to the ad unit you are using.
6. Click **+ New ad network**
7. Click **+ Custom Event**, then enter the following in the three fields that pop up, and click Continue:

        Class Name: com.commutestream.ads.Banner
        Label: CommuteStream
        Parameter: <Your Ad Unit ID obtained in step 1>
        
8. Adjust the Default eCPM for CommuteStream to be the largest amount. Since we pay you the most you will want our ads to have first priority.


