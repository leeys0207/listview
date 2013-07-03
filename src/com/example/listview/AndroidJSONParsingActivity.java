package com.example.listview;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class AndroidJSONParsingActivity extends ListActivity {

	// url to make request
	private static String url = "http://yslee.kr/zzal/zzal.json";
	
	// JSON Node names
	private static final String ITEMS = "items";
	private static final String TITLE = "title";
	private static final String IMG_URL = "img_url";

	// contacts JSONArray
	JSONArray zzal = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_list);
		
		// Hashmap for ListView
		ArrayList<HashMap<String, String>> zzalList = new ArrayList<HashMap<String, String>>();

		// Creating JSON Parser instance
		JSONParser jParser = new JSONParser();

		// getting JSON string from URL
		JSONObject json = jParser.getJSONFromUrl(url);

		try {
			// Getting Array of zzal
			zzal = json.getJSONArray(ITEMS);
			
			// looping through All zzal
			for(int i = 0; i < zzal.length(); i++){
				JSONObject c = zzal.getJSONObject(i);
				
				// Storing each json item in variable
				String title = c.getString(TITLE);
				String img_url = c.getString(IMG_URL);
				
				// creating new HashMap
				HashMap<String, String> map = new HashMap<String, String>();
				
				// adding each child node to HashMap key => value
				map.put(TITLE, title);
				map.put(IMG_URL, img_url);

				// adding HashList to ArrayList
				zzalList.add(map);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		
		/**
		 * Updating parsed JSON data into ListView
		 * */
		ListAdapter adapter = new SimpleAdapter(this, zzalList,
				R.layout.list_item,
				new String[] { TAG_NAME, TAG_EMAIL, TAG_PHONE_MOBILE }, new int[] {
						R.id.name, R.id.email, R.id.mobile });

		setListAdapter(adapter);

		// selecting single ListView item
		ListView lv = getListView();

		// Launching new screen on Selecting Single ListItem
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// getting values from selected ListItem
				String name = ((TextView) view.findViewById(R.id.name)).getText().toString();
				String cost = ((TextView) view.findViewById(R.id.email)).getText().toString();
				String description = ((TextView) view.findViewById(R.id.mobile)).getText().toString();
				
				// Starting new intent
				Intent in = new Intent(getApplicationContext(), SingleMenuItemActivity.class);
				in.putExtra(TAG_NAME, name);
				in.putExtra(TAG_EMAIL, cost);
				in.putExtra(TAG_PHONE_MOBILE, description);
				startActivity(in);

			}
		});
		
		

	}

}