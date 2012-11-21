package com.example.viewpagerandfragment;

import java.util.ArrayList;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.viewpagerindicator.CirclePageIndicator;

public class MainActivity extends FragmentActivity {
	private ViewPager viewPager;
	private MainFragmentAdapter mainFragmentAdapter;
	CirclePageIndicator mIndicator;
	public static final int HOME_FRAGMENT = 0;// 0 determines, this will be the
												// first home fragment
	public static final int FRAGMENT_1 = 1;// comes after swiping home fragment
	public static final int FRAGMENT_2 = 2;
	private Button leftFragmentBtn, rightFragmentBtn;
	private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
	// creating a fragment list to hold all the fragments
	private int currentPage = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_activity_main);
		initViews();

		mainFragmentAdapter = new MainFragmentAdapter(
				getSupportFragmentManager(), fragmentList);
		viewPager.setOffscreenPageLimit(2);
		viewPager.setAdapter(mainFragmentAdapter);

		mIndicator.setViewPager(viewPager);
		mIndicator.setOnPageChangeListener(fragmentOnPageChangeListener);
	}

	public void initViews() {
		leftFragmentBtn = (Button) findViewById(R.id.globalButtonLeft);
		rightFragmentBtn = (Button) findViewById(R.id.globalButtonRight);

		leftFragmentBtn.setVisibility(View.GONE);
		rightFragmentBtn.setVisibility(View.VISIBLE);
		// add homefragment to the fragment list
		HomeFragment homeFragment = HomeFragment.newInstance();
		fragmentList.add(homeFragment);

		// adding the fragment1 to the fragment lis
		Fragment1 fragment1 = Fragment1.newInstance();
		fragmentList.add(fragment1);

		// adding the fragment1 to the fragment lis
		Fragment2 fragment2 = Fragment2.newInstance();
		fragmentList.add(fragment2);

		viewPager = (ViewPager) findViewById(R.id.viewPager);
		mIndicator = (CirclePageIndicator) findViewById(R.id.indicator);

		if (fragmentList.size() == 3) {
			mIndicator.setBackgroundColor(Color.parseColor("#FFEBF4FB"));
		} else {

			mIndicator.setBackgroundColor(Color.parseColor("#FF4D5860"));
		}

		rightFragmentBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Log.i("Current Page Number Before", currentPage + "");
				changeViews(currentPage + 1);
				Log.i("Current Page Number Right After", currentPage + "");
				// mIndicator.setOnPageChangeListener(fragmentOnPageChangeListener);
			}
		});

		leftFragmentBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i("Current Page Number Left Before", currentPage + "");
				changeViews(currentPage - 1);
				Log.i("Current Page Number Left After", currentPage + "");
				// mIndicator.setOnPageChangeListener(fragmentOnPageChangeListener);
			}
		});

	}

	private OnPageChangeListener fragmentOnPageChangeListener = new OnPageChangeListener() {

		@Override
		public void onPageSelected(int whichPage) {
			int currentItem = viewPager.getCurrentItem();
			switch (whichPage) {

			case 0:
				leftFragmentBtn.setVisibility(View.GONE);
				rightFragmentBtn.setVisibility(View.VISIBLE);

				HomeFragment homeFragment = (HomeFragment) mainFragmentAdapter
						.getItem(currentItem);
				currentPage=0;
				if (fragmentList.size() == 3) {
					mIndicator
							.setBackgroundColor(Color.parseColor("#FFEBF4FB"));
				} else {

					mIndicator
							.setBackgroundColor(Color.parseColor("#FF4D5860"));
				}
				break;
			case 1:
				currentPage = 1;
				rightFragmentBtn.setVisibility(View.VISIBLE);
				leftFragmentBtn.setVisibility(View.VISIBLE);

				Fragment1 fragment1 = (Fragment1) mainFragmentAdapter
						.getItem(currentItem);
				mIndicator.setBackgroundColor(Color.parseColor("#FF4D5860"));
				break;
			case 2:
				currentPage = 2;
				leftFragmentBtn.setVisibility(View.VISIBLE);
				rightFragmentBtn.setVisibility(View.GONE);

				Fragment2 fragment2 = (Fragment2) mainFragmentAdapter
						.getItem(currentItem);
				mIndicator.setBackgroundColor(Color.parseColor("#FF616464"));
				break;
			default:
				break;
			}
		}

		@Override
		public void onPageScrollStateChanged(int arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			// TODO Auto-generated method stub

		}
	};

	/*
	 * // currentPage = arg0; int currentItem = viewPager.getCurrentItem();
	 * 
	 * if (currentItem == 1) { rightFragmentBtn.setVisibility(View.VISIBLE);
	 * leftFragmentBtn.setVisibility(View.VISIBLE); Fragment1 fragment1 =
	 * (Fragment1) mainFragmentAdapter .getItem(currentItem);
	 * 
	 * } else if (currentItem == 0) { leftFragmentBtn.setVisibility(View.GONE);
	 * rightFragmentBtn.setVisibility(View.VISIBLE); HomeFragment homeFragment =
	 * (HomeFragment) mainFragmentAdapter .getItem(currentItem); } else if
	 * (currentItem == 2) { leftFragmentBtn.setVisibility(View.VISIBLE);
	 * rightFragmentBtn.setVisibility(View.GONE);
	 * 
	 * Fragment2 fragment2 = (Fragment2) mainFragmentAdapter
	 * .getItem(currentItem); } }
	 */
	/*
	 * @Override public void onPageScrolled(int arg0, float arg1, int arg2) { //
	 * TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void onPageScrollStateChanged(int arg0) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	public void changeViews(int position) {
		viewPager.setCurrentItem(position, true);

	}

}
