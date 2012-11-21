package com.example.viewpagerandfragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment2 extends Fragment {

	private View fragment2View;
	//Button fragmentRBtn;
	Context context;

	public Fragment2() {

	}

	public static Fragment2 newInstance() {
		return new Fragment2();
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		context = getActivity();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (fragment2View == null)
			fragment2View = inflater.inflate(R.layout.fragment_2, null);
		initViews();
		setRetainInstance(true);
		return fragment2View;
	}

	private void initViews() {
	/*	fragmentRBtn = (Button) fragment2View.findViewById(R.id.fragment1BtnR);

		fragmentRBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				((MainActivity) context)
						.changeViews(MainActivity.FRAGMENT_1);
			}
		});
*/	}

}
