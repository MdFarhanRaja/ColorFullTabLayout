# ColorFullTabLayout
Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.MdFarhanRaja:ColorFullTabLayout:1.0'
	}

Step 3. Place Is Your Layout

    <in.galaxyofandroid.awesometablayout.AwesomeTabBar
        android:id="@+id/tabBar"
        app:atb_indicatorHeight="2dp"
        app:atb_indicatorColor="#bebebe"
        app:atb_imageHeight="30dp"
        app:atb_imageWidth="30dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
    </in.galaxyofandroid.awesometablayout.AwesomeTabBar>

    <android.support.v4.view.ViewPager
        android:id="@+id/pager"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
    </android.support.v4.view.ViewPager>
    
    Step 4. Inside Java
    
     AwesomeTabBar tabBar=(AwesomeTabBar)findViewById(R.id.tabBar);
     ViewPager pager=(ViewPager)findViewById(R.id.pager);
     pager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
     tabBar.setupWithViewPager(pager);
        
     Step 5. Viewpager Adapter Class
     
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

     
