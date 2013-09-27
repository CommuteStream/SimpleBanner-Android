SimpleBanner provides a basic example of how to use the CommuteStream SDK.

# Requirements:
- Android SDK 3.2 or higher
- Google AdMob Ads SDK for Android
- CommuteStream SDK for Android
- Working AdMob Ad ID
- Eclipse (recommended)

# Getting started with SimpleBanner in Eclipse

### Download or clone SimpleBanner from GitHub.
1. https://github.com/CommuteStream/simplebanner.git

### In Eclipse, Click the File menu, and select Import.
1. Select "Existing Android Code Into Workspace", click Next.
2. Click the Browse button and select the base directory of the source code. 
3. Click Finish.

### Add the Google AdMob Ads Jar to your Eclipse Project.
1. Right click on your app project in Eclipse and select "Properties.
2. Select "Java Build Path" and the "Libraries" tab. 
3. Click "Add External JARs..." to add the Google AdMob Ads Jar.
4. Select the Order and Export tab; check the box next to the Jar file.

### Add the CommuteStream Jar file to your Eclipse Project.
1. Download from https://commutestreamdev.com/downloads/commutestream.jar
2. Include this jar the same way as the Google AdMob Ads jar in step 2.

### Add the android-support-v4.jar to your Eclipse Project.
1. The android-support-v4.jar is included in the Android SDK in the \extras\android\support\v4 folder. Visit http://developer.android.com/sdk/compatibility-library.html#Downloading for more information.
2.Include this jar the same way as the Google AdMob Ads jar in step 2s.
 
### Insert your AdMob publisher ID into the application.
1. In SimpleBanner.java, replace "INSERT_YOUR_ADMOB_AD_ID_HERE" with a valid Admob ID.

### Add CommuteStream as an AdMob ad network
1. Go to http://commutestream.com/publisherinterface/app. After signing in you will be provided with an Ad Unit ID. Leave the browser window open, as we will need this ID in step 8 below.
2. Log into the AdMob interface.
3. Click on "Monetize" tab of main menu. 
4. Click on "All apps" in left column, then select the app you want to add CommuteStream to.
5. On the right side of the screen click "Edit mediation" link next to the ad unit you wish to add CommuteStream to.
6. Click "+ New ad network"
7. Click "+ Custom Event", then enter the following in the three fields that pop up, and click Continue:

        Class Name: *com.commutestream.ads.Banner*
        Label: *CommuteStream*
        Parameter: *<Your Ad Unit ID obtained in step 1>*
        
8. Adjust the Default eCPM for CommuteStream to be the largest amount. Since we pay you the most you will want our ads to have first priority. 
9. If your app has more than one ad unit, repeat steps 6-9


