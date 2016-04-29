package com.example.oleg.premierua;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ContentFragment extends Fragment {
	
	private TextView txtContent;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.fragment_content, container, false);
		txtContent = (TextView)view.findViewById(R.id.txt_content);
		txtContent.setText(String.valueOf(getArguments().getInt("TEST_CONTENT")));
		
		return view;
	}

}
