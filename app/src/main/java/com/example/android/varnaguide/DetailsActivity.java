package com.example.android.varnaguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.description;

/**
 * Created by Alexander Rashkov on 27.5.2017 г..
 */

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_details);

        //Get the details of the Places from the intent
        Bundle passedDetails = getIntent().getExtras();
        final String title = passedDetails.getString("placeTitle");
        String address = passedDetails.getString("placeAddress");
        int coverImageId = passedDetails.getInt("placeCover");
        final String locationDataURI = passedDetails.getString("placeLocation");
        String workingHours = passedDetails.getString("placeHours");
        String description = passedDetails.getString("placeDescription");
        final String phone = passedDetails.getString("placePhone");
        final String webUrl = passedDetails.getString("placeWebsite");

        //Set the Title in the acion Bar taken from tapped Place
        this.setTitle(title);

        //Activate Up Button to enable the navigation back to the MainActivity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Set cover Image to the ImageView in the place_details.xml
        ImageView coverImageView = (ImageView) findViewById(R.id.coverOfPlace);
        coverImageView.setImageResource(coverImageId);

        //Set address to the TextView in the place_details.xml
        TextView addressTextView = (TextView) findViewById(R.id.detailsAddress);
        addressTextView.setText(address);

        //Set working hours to the TextView in the place_details.xml
        TextView hoursTextView = (TextView) findViewById(R.id.detailsHours);
        hoursTextView.setText(workingHours);

        //Set description to the TextView in the place_details.xml
        TextView descriptionTextView = (TextView) findViewById(R.id.detailsDescription);
        descriptionTextView.setText(description);

        //Set phone number to the TextView in the place_details.xml
        TextView phoneTextView = (TextView) findViewById(R.id.detailsPhone);

        //Check if phone variable is passed (Sights do not have phone)
        if (phone != null && !phone.isEmpty()) {
            //if phone variable is there and not empty,
            // then display it on phone textView in the place_details.xml
            phoneTextView.setText(phone);
        } else {
            //if phone variable is not inserted or it is empty,
            // then make the phone textView disappear from the place_details.xml
            phoneTextView.setVisibility(View.GONE);
        }

        //Set website link to the TextView in the place_details.xml
        TextView websiteTextView = (TextView) findViewById(R.id.detailsWebPage);

        //Check if website variable is passed (Sights do not have websites)
        if (webUrl != null && !webUrl.isEmpty()) {
            //if webUrl variable is there and not empty,
            // then display it on webPage textView in the place_details.xml
            websiteTextView.setText(webUrl);
        } else {
            //if webUrl variable is not inserted or it is empty,
            // then make the webPage textView disappear from the place_details.xml
            websiteTextView.setVisibility(View.GONE);
        }

        //Create onClickListener when website textView is tapped,
        //to open the link in a web browser
        websiteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the url from bundled variables above,
                // and assign it to a new Uri variable
                Uri webAddress = Uri.parse(webUrl);

                //Make browser intent to open the web address in a browser
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, webAddress);
                if (browserIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(browserIntent);
                }
            }
        });

        //Create onClickListener when address textView is tapped,
        //to open the location in Google Maps
        addressTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the url location from bundled variables above,
                // and concatenate a string that will be the google maps link
                //@param title is the label of the place shown in maps
                String mapsUrl = "http://maps.google.com/maps?q=loc:" + locationDataURI + " (" + title + ")";

                //Create implicit intent to open google maps with the link above
                Intent mapsIntent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(mapsUrl));
                mapsIntent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                if (mapsIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapsIntent);
                }
            }
        });


        //Create onClickListener when phone textView is tapped,
        //to open dialer with phone number entered ready to make a call
        phoneTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the phone number from bundled variables above,
                // assign it to Uri variable
                Uri phoneNumber = Uri.parse("tel:" + phone);

                //Make phone call intent to open the phone in a dialer
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL, phoneNumber);
                startActivity(phoneIntent);
            }
        });
    }
}
