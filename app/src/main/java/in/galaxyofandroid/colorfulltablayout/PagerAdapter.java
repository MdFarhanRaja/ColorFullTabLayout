package in.galaxyofandroid.colorfulltablayout;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import java.util.ArrayList;


import in.galaxyofandroid.awesometablayout.AwesomeTabBarAdapter;

/**
 * Created by Md Farhan Raja on 2/16/2017.
 */

public class PagerAdapter extends AwesomeTabBarAdapter
{
    ArrayList<Fragment> fragments=new ArrayList<>();
    ArrayList<String> titles=new ArrayList<>();
    int[] colors={R.color.color1,R.color.color2,R.color.color3,R.color.color4,R.color.color5,R.color.color6};
    int[] textColors={R.color.colorWhite};
    int[] icons={R.drawable.ic_blod,R.drawable.ic_blod_uria,R.drawable.ic_ayurveda,R.drawable.ic_complete_blod,R.drawable.ic_body_message,R.drawable.ic_cardiologist};

    public PagerAdapter(FragmentManager fragmentManager)
    {
        super(fragmentManager);
        fragments.add(new TestFragment());
        fragments.add(new TestFragment());
        fragments.add(new TestFragment());
        fragments.add(new TestFragment());
        fragments.add(new TestFragment());
        fragments.add(new TestFragment());

        titles.add("Title 1");
        titles.add("Title 2");
        titles.add("Title 3");
        titles.add("Title 4");
        titles.add("Title 5");
        titles.add("Title 6");

    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public int getColorResource(int position) {
        return colors[position];
    }

    @Override
    public int getTextColorResource(int position) {
        return textColors[0];
    }

    @Override
    public int getIconResource(int position) {
        return icons[position];
    }
}
