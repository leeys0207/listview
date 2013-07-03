package com.example.listview;

import android.annotation.SuppressLint;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

@SuppressLint("NewApi")
public class FragmentList extends ListFragment {
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_list, null);
        
        ListView FragList;
		FragList = (ListView)view.findViewById(R.id.fragmentlist);
		FragList.setAdapter((ListAdapter) MyAdapter);
         
        return view;
    }
}