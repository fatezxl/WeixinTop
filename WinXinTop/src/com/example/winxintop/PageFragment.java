package com.example.winxintop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PageFragment extends Fragment {

	public static final String ARG = "arg";

	private TextView text;
	private int position;

	public static PageFragment newInstance(int position) {
		PageFragment pageFragment = new PageFragment();
		Bundle b = new Bundle();
		b.putInt(ARG, position);
		pageFragment.setArguments(b);
		return pageFragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		position = getArguments().getInt(ARG, 0);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_page, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		text = (TextView) getView().findViewById(R.id.text);
		text.setText(String.valueOf(position));
	}
}
