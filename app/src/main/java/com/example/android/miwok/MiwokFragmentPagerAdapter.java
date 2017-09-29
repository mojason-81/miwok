package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jason on 9/29/17.
 */

public class MiwokFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Numbers", "Colors", "Family", "Phrases" };
    private Context mContext;
    private Fragment mSectionFragment;

    public MiwokFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: mSectionFragment =  new NumbersFragment();
                break;
            case 1: mSectionFragment =  new ColorsFragment();
                break;
            case 2: mSectionFragment =  new FamilyFragment();
                break;
            case 3: mSectionFragment =  new PhrasesFragment();
                break;
        }
        return mSectionFragment;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
