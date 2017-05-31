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
public class BarFragment extends Fragment {


    public BarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create an Array List of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.title_cubo), getString(R.string.address_cubo), R.drawable.prw_cubo, R.drawable.cvr_cubo, getString(R.string.loactionURI_cubo), getString(R.string.workingHours_cubo), getString(R.string.description_cubo), getString(R.string.phone_cubo), getString(R.string.siteUrl_cubo)));
        places.add(new Place(getString(R.string.title_pampero), getString(R.string.address_pampero), R.drawable.prw_pampero, R.drawable.cvr_pampero, getString(R.string.loactionURI_pampero), getString(R.string.workingHours_pampero), getString(R.string.description_pampero), getString(R.string.phone_pampero), getString(R.string.siteUrl_pampero)));
        places.add(new Place(getString(R.string.title_averi), getString(R.string.address_averi), R.drawable.prw_averi, R.drawable.cvr_averi, getString(R.string.loactionURI_averi), getString(R.string.workingHours_averi), getString(R.string.description_averi), getString(R.string.phone_averi), getString(R.string.siteUrl_averi)));
        places.add(new Place(getString(R.string.title_menthol), getString(R.string.address_menthol), R.drawable.prw_menthol, R.drawable.cvr_menthol, getString(R.string.loactionURI_menthol), getString(R.string.workingHours_menthol), getString(R.string.description_menthol), getString(R.string.phone_menthol), getString(R.string.siteUrl_menthol)));
        places.add(new Place(getString(R.string.title_bolla), getString(R.string.address_bolla), R.drawable.prw_bolla, R.drawable.cvr_bolla, getString(R.string.loactionURI_bolla), getString(R.string.workingHours_bolla), getString(R.string.description_bolla), getString(R.string.phone_bolla), getString(R.string.siteUrl_bolla)));
        places.add(new Place(getString(R.string.title_vintage), getString(R.string.address_vintage), R.drawable.prw_vintage, R.drawable.crv_vintage, getString(R.string.loactionURI_vintage), getString(R.string.workingHours_vintage), getString(R.string.description_vintage), getString(R.string.phone_vintage), getString(R.string.siteUrl_vintage)));
        places.add(new Place(getString(R.string.title_makalali), getString(R.string.address_makalali), R.drawable.prw_makalali, R.drawable.cvr_makalali, getString(R.string.loactionURI_makalali), getString(R.string.workingHours_makalali), getString(R.string.description_makalali), getString(R.string.phone_makalali), getString(R.string.siteUrl_makalali)));

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
