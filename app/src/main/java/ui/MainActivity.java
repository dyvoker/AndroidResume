package ui;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dyvoker.androidresume.R;
import com.dyvoker.androidresume.TabsAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        NestedScrollView scrollView = (NestedScrollView) findViewById (R.id.nestedScrollView);
        scrollView.setFillViewport(true);
    }

    private void setupViewPager(ViewPager viewPager) {
        TabsAdapter adapter = new TabsAdapter(getSupportFragmentManager());
        adapter.addFragment(new AboutMeFragment(), getString(R.string.about_me));
        adapter.addFragment(new ExperienceFragment(), getString(R.string.experience));
        viewPager.setAdapter(adapter);
    }
}