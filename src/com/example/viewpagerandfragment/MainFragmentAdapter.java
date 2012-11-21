package com.example.viewpagerandfragment;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainFragmentAdapter extends FragmentPagerAdapter {
	ArrayList<Fragment> fragmentList;

	public MainFragmentAdapter(FragmentManager fm,
			ArrayList<Fragment> fragmentList) {
		super(fm);
		this.fragmentList = fragmentList;

		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		return fragmentList.get(position);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return fragmentList.size();
	}

}
