package com.example.viewpagerandfragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends Fragment {

	private View fragment1View;
	//Button homeFragmentBtn;
	Context context;

	public Fragment1() {

	}

	public static Fragment1 newInstance() {
		return new Fragment1();
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		context = getActivity();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (fragment1View == null)
			fragment1View = inflater.inflate(R.layout.fragment_1, null);
		initViews();
		setRetainInstance(true);
		return fragment1View;
	}

	private void initViews() {
		/*homeFragmentBtn = (Button) fragment1View.findViewById(R.id.fragment1Btn);

		homeFragmentBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				((MainActivity) context)
						.changeViews(MainActivity.HOME_FRAGMENT);
			}
		});*/
	}

	

}
