package com.commutestream.example.ads.simplebanner;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;

import com.commutestream.ads.*;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

/* The CommuteStream ad network is specifically designed for apps that
 * are used in an around mass transit systems. This, of course is not
 * a transit app, and serves only as a basic example of how CommuteStream
 * ties in with AdMod to serve ads.
 */

public class SimpleBanner extends Activity {
	// The view to show the ad.
	private AdView adView;

	// Your AdMob Ad ID; provided from the AdMob web interface
	final String ADMOB_AD_ID = "INSERT_YOUR_ADMOB_AD_ID_HERE";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Create an adView and add it to the layout
		adView = new AdView(this, AdSize.BANNER, ADMOB_AD_ID);
		LinearLayout layout = (LinearLayout) findViewById(R.id.linearLayout);
		layout.addView(adView);

		// Initializes the CommuteStream SDK
		CommuteStream.init();

		// Tells CommuteStream that we are developing and that it should
		// serve a test banner, rather than real ads.
		// This line should be commented or removed before releasing an app.
		CommuteStream.setTesting();
		
		// Create a new AdMob adRequest
		final AdRequest adRequest = new AdRequest();

		// If your testing you might want to add your device below
		// adRequest.addTestDevice(AdRequest.TEST_EMULATOR);
		// adRequest.addTestDevice("C1E53EE71C84E96A028AB7CE4F626483");

		// Let's pretend that our app just displayed some arrival time 
		// information for two different train stops, and also diplayed
		// some alert information for the "Red" line route. This is how
		// we would tell CommuteStream about it.
		CommuteStream.trackingDisplayed("CTA","Red","41420");
		CommuteStream.trackingDisplayed("CTA","Red","41450");
		CommuteStream.alertDisplayed("cta", "Red", null);

		// Acquire a reference to the system Location Manager
		LocationManager locationManager = (LocationManager) this
				.getSystemService(Context.LOCATION_SERVICE);

		String NetworkLocationProvider = LocationManager.NETWORK_PROVIDER;

		// Grab the last known location from the NETWORK_PROVIDER.
		Location lastKnownLocation = locationManager
				.getLastKnownLocation(NetworkLocationProvider);

		// This is how we normally give AdMob the location
		adRequest.setLocation(lastKnownLocation);

		// And this is how we pass the location to CommuteStream
		CommuteStream.setLocation(lastKnownLocation);

		// Start loading the ad in the background.
		adView.loadAd(adRequest);

		/*
		 * CommuteStream pays you more when you supply more information about
		 * your users. Specifically the user's location, what transit information
		 * they are viewing on the app, and when they do things like bookmarking
		 * or planning a trip.
		 */

		// Define a listener that responds to location updates
		LocationListener locationListener = new LocationListener() {
			public void onLocationChanged(Location location) {
				// When a new location is found we update AdMob and
				// CommuteStream
				adRequest.setLocation(location);
				CommuteStream.setLocation(location);

				// Do some other stuff with the new location
				// ...
			}

			public void onStatusChanged(String provider, int status,
					Bundle extras) {
			}

			public void onProviderEnabled(String provider) {
			}

			public void onProviderDisabled(String provider) {
			}
		};

		// Register listeners with the Location Manager to receive location
		// updates
		locationManager.requestLocationUpdates(NetworkLocationProvider, 0, 0,
				locationListener);

		// This button just shows how the commuteStream variable
		// can be used to update what we know about the users
		// interests in the transit system
		final Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// update some parameters
				CommuteStream.favoriteAdded("cta", "Brn", "40710");
			}
		});

	}

	/** Called before the activity is destroyed. */
	@Override
	public void onDestroy() {
		// Destroy the AdView.
		if (adView != null) {
			adView.destroy();
		}

		super.onDestroy();
	}
}
