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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an Array List of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.title_arch_museum), getString(R.string.address_arch_museum), R.drawable.prw_arch_museum, R.drawable.cvr_arch_museum, getString(R.string.loactionURI_arch_museum), getString(R.string.workingHours_arch_museum), getString(R.string.description_arch_museum), getString(R.string.phone_arch_museum), getString(R.string.siteUrl_arch_museum)));
        places.add(new Place(getString(R.string.title_gallery), getString(R.string.address_gallery), R.drawable.prw_gallery, R.drawable.cvr_gallery, getString(R.string.loactionURI_gallery), getString(R.string.workingHours_gallery), getString(R.string.description_gallery), getString(R.string.phone_gallery), getString(R.string.siteUrl_gallery)));
        places.add(new Place(getString(R.string.title_naval_museum), getString(R.string.address_naval_museum), R.drawable.prw_naval_museum, R.drawable.cvr_naval_museum, getString(R.string.loactionURI_naval_museum), getString(R.string.workingHours_naval_museum), getString(R.string.description_naval_museum), getString(R.string.phone_naval_museum), getString(R.string.siteUrl_naval_museum)));
        places.add(new Place(getString(R.string.title_varnenchek), getString(R.string.address_varnenchek), R.drawable.prw_varnenchek, R.drawable.cvr_varnenchek, getString(R.string.loactionURI_varnenchek), getString(R.string.workingHours_varnenchek), getString(R.string.description_varnenchek), getString(R.string.phone_varnenchek), getString(R.string.siteUrl_varnenchek)));
        places.add(new Place(getString(R.string.title_aquarium), getString(R.string.address_aquarium), R.drawable.prw_aquarium, R.drawable.cvr_aquarium, getString(R.string.loactionURI_aquarium), getString(R.string.workingHours_aquarium), getString(R.string.description_aquarium), getString(R.string.phone_aquarium), getString(R.string.siteUrl_aquarium)));
        places.add(new Place(getString(R.string.title_retro_museum), getString(R.string.address_retro_museum), R.drawable.prw_retro_museum, R.drawable.cvr_retro_museum, getString(R.string.loactionURI_retro_museum), getString(R.string.workingHours_retro_museum), getString(R.string.description_retro_museum), getString(R.string.phone_retro_museum), getString(R.string.siteUrl_retro_museum)));

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
