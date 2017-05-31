package com.example.android.varnaguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an Array List of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.title_sea_garden), getString(R.string.address_sea_garden), R.drawable.prw_sea_garden, R.drawable.cvr_sea_garden, getString(R.string.loactionURI_sea_garden), getString(R.string.workingHours_sea_garden), getString(R.string.description_sea_garden)));
        places.add(new Place(getString(R.string.title_cathedral), getString(R.string.address_cathedral), R.drawable.prw_cathedral, R.drawable.cvr_cathedral, getString(R.string.loactionURI_cathedral), getString(R.string.workingHours_cathedral), getString(R.string.description_cathedral)));
        places.add(new Place(getString(R.string.title_roman_therms), getString(R.string.address_roman_therms), R.drawable.prw_roman_therms, R.drawable.cvr_roman_therms, getString(R.string.loactionURI_roman_therms), getString(R.string.workingHours_roman_therms), getString(R.string.description_roman_therms)));
        places.add(new Place(getString(R.string.title_pobiti_kamuni), getString(R.string.address_pobiti_kamuni), R.drawable.prw_pobiti_kamuni, R.drawable.cvr_pobiti_kamuni, getString(R.string.loactionURI_pobiti_kamuni), getString(R.string.workingHours_pobiti_kamuni), getString(R.string.description_pobiti_kamuni)));
        places.add(new Place(getString(R.string.title_alajata), getString(R.string.address_alajata), R.drawable.prw_alajata, R.drawable.cvr_alajata, getString(R.string.loactionURI_alajata), getString(R.string.workingHours_alajata), getString(R.string.description_alajata)));
        places.add(new Place(getString(R.string.title_morska_gara), getString(R.string.address_morska_gara), R.drawable.prw_morska_gara, R.drawable.cvr_morska_gara, getString(R.string.loactionURI_morska_gara), getString(R.string.workingHours_morska_gara), getString(R.string.description_morska_gara)));
        places.add(new Place(getString(R.string.title_dolphinarium), getString(R.string.address_dolphinarium), R.drawable.prw_dolphinarium, R.drawable.cvr_dolphinarium, getString(R.string.loactionURI_dolphinarium), getString(R.string.workingHours_dolphinarium), getString(R.string.description_dolphinarium), getString(R.string.phone_dolphinarium), getString(R.string.siteUrl_dolphinarium)));
        // Creates a{@link PlaceAdapter}, whose data source is a list of {@link place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called place_list
        ListView listView = (ListView) rootView.findViewById(R.id.place_list);

        // Make the {@link ListView} use the {@link PlaceAdapter} created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
