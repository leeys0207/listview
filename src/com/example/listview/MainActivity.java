package com.example.listview;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayAdapter<CharSequence> Adapter;
		Adapter = ArrayAdapter.createFromResource(this, R.array.whatthefuck, android.R.layout.simple_list_item_1);
		
		ListView list = (ListView)findViewById(R.id.list);
		list.setAdapter(Adapter);
		
		final TextView text = (TextView)findViewById(R.id.text1);
		
		Button btn1 = (Button)findViewById(R.id.btnpage1);
		btn1.setOnTouchListener(new View.OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction()==MotionEvent.ACTION_DOWN) {
					text.setText("Touched");
					return true;
				} 
				return false;
			}	
		});
	}
}
