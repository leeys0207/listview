package com.example.listview;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentTabs extends Fragment {
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_tab, null);
         
        Button a = (Button) view.findViewById(R.id.btn1);
        Button b = (Button) view.findViewById(R.id.btn2);
        Button c = (Button) view.findViewById(R.id.btn3);
         
        return view;
    }
}