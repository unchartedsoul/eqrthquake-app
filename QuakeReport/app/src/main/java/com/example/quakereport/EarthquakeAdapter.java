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

    public View getView(int postion, View convertView,ViewGroup parent){
        View listItemView = convertView;
        if ( listItemView== null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_items,parent,false);
        }
        Earthquake currentEarthquake = getItem(postion);

        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthquake.getMagnitude());


        TextView locationView = (TextView)listItemView.findViewById(R.id.location);
        locationView.setText(currentEarthquake.getLocation());
        
        
        TextView dateView = (TextView)listItemView.findViewById(R.id.date);
        dateView.setText(currentEarthquake.getDate());
        
        return listItemView;
    }
}