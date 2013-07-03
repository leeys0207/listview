package com.example.listview;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
 
public class MainActivity extends FragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		ArrayList<MyItem> arItem;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		arItem = new ArrayList<MyItem>();
		MyItem mi;
		mi = new MyItem(R.drawable.ic_launcher, "yslee"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "kinajin"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "youngsu"); arItem.add(mi);
		
		MyListAdapter MyAdapter = new MyListAdapter(this, R.layout.icontext, arItem);
		
		
		ListView MyList;
		MyList = (ListView)findViewById(R.id.list);
		MyList.setAdapter((ListAdapter) MyAdapter);
		
	}
}


class MyItem {
	   MyItem(int aIcon, String aName) {
		   Icon = aIcon;
		   Name = aName;
	   }
	   int Icon;
	   String Name;
}
