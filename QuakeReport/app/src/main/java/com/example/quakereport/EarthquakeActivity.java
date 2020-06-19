package com.example.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;



public class EarthquakeActivity extends AppCompatActivity {



    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("8.2","San Francisco","14"));
        earthquakes.add(new Earthquake("8.2","London","14"));
        earthquakes.add(new Earthquake("8.2","Tokyo","14"));
        earthquakes.add(new Earthquake("8.2","Mexico City","14"));
        earthquakes.add(new Earthquake("8.2","Rio de Janeiro","14"));
        earthquakes.add(new Earthquake("8.2","Moscow","14"));
        earthquakes.add(new Earthquake("8.2","Paris","14"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter((ListAdapter) adapter);
    }
}
