package com.example.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake>{


    public EarthquakeAdapter(Context context,List<Earthquake> earthquakes){
        super(context,0, earthquakes);
    }

    /**
     * Returna a list item taht displays information about the earthquak at the time of earthquake
     * in the list of earthquake.
     */


    @Override
    public View getView(int postion, View convertView,ViewGroup parent){
        // Check if there is an existing list item view (called convertView) that we can resume,
        //otherwise, if convert view is null, then inflate a new list item layout.
        View listItemView = convertView;
        if ( listItemView== null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_items,parent,false);
        }

        //find the earthquake at the given position in the list of earthquake.
        Earthquake currentEarthquake = getItem(postion);

        // Find the textView with view ID magnitude.
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        // Display the magnitude of the current earthquake in that textView.
        magnitudeView.setText(currentEarthquake.getMagnitude());


        // Find the textView with view ID location.
        TextView locationView = (TextView)listItemView.findViewById(R.id.location);
        // Display the location of the current earthquake in that textView.
        locationView.setText(currentEarthquake.getLocation());


        // Find the textView with view ID date.
        TextView dateView = (TextView)listItemView.findViewById(R.id.date);
        // Display the date of the current earthquake in that textView.
        dateView.setText(currentEarthquake.getDate());
        
        //Return the listView item that is shopwing the appropriate data.
        return listItemView;
    }
}