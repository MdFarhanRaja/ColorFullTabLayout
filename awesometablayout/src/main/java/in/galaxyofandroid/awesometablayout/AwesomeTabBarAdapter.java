package in.galaxyofandroid.awesometablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Md Farhan Raja on 2/16/2017.
 */

public abstract class AwesomeTabBarAdapter extends FragmentPagerAdapter {

    public AwesomeTabBarAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public abstract int getCount();

    public abstract Fragment getItem(int position);

    public abstract CharSequence getPageTitle(int position);

    public abstract int getColorResource(int position);

    public abstract int getTextColorResource(int position);

    public abstract int getIconResource(int position);
}
