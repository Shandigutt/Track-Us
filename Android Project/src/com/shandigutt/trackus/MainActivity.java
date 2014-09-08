package com.shandigutt.trackus;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {
	
	private GoogleMap map;
	//static final LatLng TutorialsPoint = new LatLng(21 , 57);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_single);
        
        //map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        //map.getUiSettings().setZoomControlsEnabled(true);
		try {
			if (map == null) {
				map = ((MapFragment) getFragmentManager().findFragmentById(
						R.id.fragment1)).getMap();
			}
			map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			map.getUiSettings().setZoomControlsEnabled(true);
			
			//Marker TP = map.addMarker(new MarkerOptions().position(
			//		TutorialsPoint).title("TutorialsPoint"));

		} catch (Exception e) {
			e.printStackTrace();
		}
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
