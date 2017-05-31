package com.example.android.varnaguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AR on 26.5.2017 г..
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    private Context context = getContext();

    //Create a new {@link PlaceAdapter} object.
    //@param context is the current context (i.e. Activity) that the adapter is being created in.
    //@param places is the list of {@link Places}s to be displayed.
    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        //Get the details of the place
        String title = currentPlace.getTitle();
        String address = currentPlace.getAddress();
        int imagePreview = currentPlace.getImageResourceId();
        int coverImage = currentPlace.getCoverResourceId();
        String location = currentPlace.getLocationDataURI();
        String hours = currentPlace.getWorkingHours();
        String description = currentPlace.getDescription();
        String phone = currentPlace.getPhone();
        String website = currentPlace.getWebUrl();

        //Find the textView in list_item.xml where the title should be displayed
        TextView titleOfPlace = (TextView) listItemView.findViewById(R.id.title_of_place);

        //Get the title of this place from the current Place object and set this text on the name TextView
        titleOfPlace.setText(title);

        //Find the imageView in list_item.xml where the image of the place should be displayed
        ImageView imageOfPlace = (ImageView) listItemView.findViewById(R.id.image_of_place);

        //display the provided image based on the resource ID
        imageOfPlace.setImageResource(imagePreview);

        //Declare implicit intent to display the detailed information about the place, on listItem touch
        final Intent listItemIntent = new Intent(context, DetailsActivity.class);

        //Put the details of the tapped Place to the intent
        listItemIntent.putExtra("placeTitle", title);
        listItemIntent.putExtra("placeAddress", address);
        listItemIntent.putExtra("placeCover", coverImage);
        listItemIntent.putExtra("placeLocation", location);
        listItemIntent.putExtra("placeHours", hours);
        listItemIntent.putExtra("placeDescription", description);
        listItemIntent.putExtra("placePhone", phone);
        listItemIntent.putExtra("placeWebsite", website);

        //On touch of listItem start listItemIntent to displat details of the place
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(listItemIntent);
            }
        });

        // Return the whole list item layout (containing Title and Image Snippet)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
