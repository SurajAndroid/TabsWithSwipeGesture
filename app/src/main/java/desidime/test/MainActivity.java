package desidime.test;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    private ViewPager viewPager;
    String username_navigation = "";
    TextView username_nav;
    ImageView refresh_user, drawer_nav;
    LinearLayout logout_drawer, home_drawer, email_drawer, order_list_drawer, my_order_list_drawer, return_order_list_drawer;
    DrawerLayout drawer_layout;
    private LinearLayout linear;
    Context mContext;
    //This is our tablayout
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer_layout.setOnClickListener(this);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText("TOP"));
        tabLayout.addTab(tabLayout.newTab().setText("POPULAR"));
        tabLayout.addTab(tabLayout.newTab().setText("FEATURED"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        // Initilization
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        //Creating our pager adapter

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        //Adding onTabSelectedListener to swipe views


        username_nav = (TextView) findViewById(R.id.username_nav);
        username_nav.setText("Hello,Guice " + username_navigation);
        refresh_user = (ImageView) findViewById(R.id.refresh_user);
        refresh_user.setOnClickListener(this);
        drawer_nav = (ImageView) findViewById(R.id.drawer_nav);
        drawer_nav.setOnClickListener(this);
        home_drawer = (LinearLayout) findViewById(R.id.home_drawer);
        home_drawer.setOnClickListener(this);
        email_drawer = (LinearLayout) findViewById(R.id.email_drawer);
        email_drawer.setOnClickListener(this);
        order_list_drawer = (LinearLayout) findViewById(R.id.order_list_drawer);
        order_list_drawer.setOnClickListener(this);
        my_order_list_drawer = (LinearLayout) findViewById(R.id.my_order_list_drawer);
        my_order_list_drawer.setOnClickListener(this);
        return_order_list_drawer = (LinearLayout) findViewById(R.id.return_order_list_drawer);
        return_order_list_drawer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final int id = v.getId();
        switch (id) {

            case R.id.home_drawer:
                drawer_layout.closeDrawers();
                Toast.makeText(MainActivity.this, "Home clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.email_drawer:
                Toast.makeText(MainActivity.this, "Email clicked", Toast.LENGTH_LONG).show();
                drawer_layout.closeDrawers();
                break;
            case R.id.order_list_drawer:
                Toast.makeText(MainActivity.this, "Order clicked", Toast.LENGTH_LONG).show();
                drawer_layout.closeDrawers();
                break;

            case R.id.my_order_list_drawer:
                Toast.makeText(MainActivity.this, "My Order clicked", Toast.LENGTH_LONG).show();
                drawer_layout.closeDrawers();
                break;
            case R.id.return_order_list_drawer:
                Toast.makeText(MainActivity.this, "Return Order clicked", Toast.LENGTH_LONG).show();
                drawer_layout.closeDrawers();
                break;

            case R.id.drawer_nav:
                drawer_layout.openDrawer(GravityCompat.START);
                break;


        }
    }

}
