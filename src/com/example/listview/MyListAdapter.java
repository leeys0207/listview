package com.example.listview;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


class MyListAdapter extends BaseAdapter {
	Context maincon;
	LayoutInflater Inflater;
	ArrayList<MyItem> arSrc;
	int layout;
	
	public MyListAdapter(Context context, int alayout, ArrayList<MyItem> aarSrc) {
		maincon = context;
		Inflater = (LayoutInflater)context.getSystemService(
				Context.LAYOUT_INFLATER_SERVICE);
		arSrc = aarSrc;
		layout = alayout;
	}
	
	public int getCount() {
		return arSrc.size();
	}
	
	public String getItem(int position) {
		return arSrc.get(position).Name;
	}
	
	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		final int pos = position;
		if (convertView==null) {
			convertView = Inflater.inflate(layout,  parent, false);
		}
		ImageView img = (ImageView)convertView.findViewById(R.id.img);
		img.setImageResource(arSrc.get(position).Icon);
		
		TextView txt = (TextView)convertView.findViewById(R.id.text);
		txt.setText(arSrc.get(position).Name);
		
		Button btn = (Button)convertView.findViewById(R.id.btn);
		btn.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				String str = arSrc.get(pos).Name + " loves you.";
				Toast.makeText(maincon, str, 0).show();
			}
		});
		return convertView;
	}
}