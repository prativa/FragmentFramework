package com.example.viewpagerandfragment;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
	//Button fragment1Btn;
	private View homeFragmentView;
	Context context;

	public HomeFragment() {
		// as per Android Fragment documentation, here is an empty constructor,
		// so it can be instantiated when restoring its activity's state
	}

	public static HomeFragment newInstance() {
		return new HomeFragment();
	}
	
	@Override
	public void onAttach(Activity activity) {
		//since fragment is activity dependent, we need activity context in various cases.
		super.onAttach(activity);
		context = getActivity();
		//now our entire fragment use context rather than getActivity()
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		if (homeFragmentView == null) {
			homeFragmentView = inflater.inflate(R.layout.home_fragment, null);
		}
		initViews();
		// setUIListener();
		setRetainInstance(true);
		return homeFragmentView;
	}

	private void initViews() {
		/*fragment1Btn = (Button) homeFragmentView.findViewById(R.id.fragment1Btn);
		fragment1Btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			((MainActivity) context).changeViews(MainActivity.FRAGMENT_1);	
			}
		});*/
	}

}
