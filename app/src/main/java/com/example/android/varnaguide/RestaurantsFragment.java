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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an Array List of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.title_staria_chinar), getString(R.string.address_staria_chinar), R.drawable.prw_staria_chinar, R.drawable.cvr_staria_chinar, getString(R.string.loactionURI_staria_chinar), getString(R.string.workingHours_staria_chinar), getString(R.string.description_staria_chinar), getString(R.string.phone_staria_chinar), getString(R.string.siteUrl_staria_chinar)));
        places.add(new Place(getString(R.string.title_labocca), getString(R.string.address_labocca), R.drawable.prw_labocca, R.drawable.cvr_labocca, getString(R.string.loactionURI_labocca), getString(R.string.workingHours_labocca), getString(R.string.description_labocca), getString(R.string.phone_labocca), getString(R.string.siteUrl_labocca)));
        places.add(new Place(getString(R.string.title_bunata), getString(R.string.address_bunata), R.drawable.prw_bunata, R.drawable.cvr_bunata, getString(R.string.loactionURI_bunata), getString(R.string.workingHours_bunata), getString(R.string.description_bunata), getString(R.string.phone_bunata), getString(R.string.siteUrl_bunata)));
        places.add(new Place(getString(R.string.title_elkapan), getString(R.string.address_elkapan), R.drawable.prw_elkapan, R.drawable.cvr_elkapan, getString(R.string.loactionURI_elkapan), getString(R.string.workingHours_elkapan), getString(R.string.description_elkapan), getString(R.string.phone_elkapan), getString(R.string.siteUrl_elkapan)));
        places.add(new Place(getString(R.string.title_happy), getString(R.string.address_happy), R.drawable.prw_happy, R.drawable.cvr_happy, getString(R.string.loactionURI_happy), getString(R.string.workingHours_happy), getString(R.string.description_happy), getString(R.string.phone_happy), getString(R.string.siteUrl_happy)));
        places.add(new Place(getString(R.string.title_sundogs), getString(R.string.address_sundogs), R.drawable.prw_sundogs, R.drawable.cvr_sundogs, getString(R.string.loactionURI_sundogs), getString(R.string.workingHours_sundogs), getString(R.string.description_sundogs), getString(R.string.phone_sundogs), getString(R.string.siteUrl_sundogs)));
        places.add(new Place(getString(R.string.title_seaterrace), getString(R.string.address_seaterrace), R.drawable.prw_seaterrace, R.drawable.cvr_seaterrace, getString(R.string.loactionURI_seaterrace), getString(R.string.workingHours_seaterrace), getString(R.string.description_seaterrace), getString(R.string.phone_seaterrace), getString(R.string.siteUrl_seaterrace)));

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
