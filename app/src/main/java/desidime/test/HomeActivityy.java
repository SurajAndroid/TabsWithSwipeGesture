package desidime.test;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import desidime.test.adapter.CandidateSearchAdapter;
import desidime.test.adapter.TopDealAdapter;


public class HomeActivityy extends Activity implements View.OnClickListener
{

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
    ArrayList arrayList = new ArrayList();
    ListView list_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_new);
        mContext = this;
        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer_layout.setOnClickListener(this);

        list_item=(ListView)findViewById(R.id.list_item);

 arrayList.add("it was popularised in the 1960 with the release of Letra seets Containing " +
         "Lorem ipsum sages,and more precisely with desktop publish");
        arrayList.add("it was popularised in the 1960 with the release of Letra seets Containing " +
                "Lorem ipsum sages,and more precisely with desktop publish");
        arrayList.add("it was popularised in the 1960 with the release of Letra seets Containing " +
                "Lorem ipsum sages,and more precisely with desktop publish");
        arrayList.add("it was popularised in the 1960 with the release of Letra seets Containing " +
                "Lorem ipsum sages,and more precisely with desktop publish");
        arrayList.add("it was popularised in the 1960 with the release of Letra seets Containing " +
                "Lorem ipsum sages,and more precisely with desktop publish");
        arrayList.add("it was popularised in the 1960 with the release of Letra seets Containing " +
                "Lorem ipsum sages,and more precisely with desktop publish");
        arrayList.add("it was popularised in the 1960 with the release of Letra seets Containing " +
                "Lorem ipsum sages,and more precisely with desktop publish");
        arrayList.add("it was popularised in the 1960 with the release of Letra seets Containing " +
                "Lorem ipsum sages,and more precisely with desktop publish");
        arrayList.add("it was popularised in the 1960 with the release of Letra seets Containing " +
                "Lorem ipsum sages,and more precisely with desktop publish");
        arrayList.add("it was popularised in the 1960 with the release of Letra seets Containing " +
                "Lorem ipsum sages,and more precisely with desktop publish");

//        scheduleListAdapter = new ScheduleListAdapter(HomeActivityy.this, R.layout.scheduleadapter, arrayList);
//        list_item.setAdapter(scheduleListAdapter);


        CandidateSearchAdapter topDealAdapter = new CandidateSearchAdapter(HomeActivityy.this,arrayList);
        list_item.setAdapter(topDealAdapter);
    /*    ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arrayList);
        // Set The Adapter
        list_item.setAdapter(arrayAdapter);*/
        username_nav = (TextView) findViewById(R.id.username_nav);
        username_nav.setText("USER NAME " + username_navigation);
        //refresh_user = (ImageView) findViewById(R.id.refresh_user);
        //refresh_user.setOnClickListener(this);
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
//                Toast.makeText(HomeActivityy.this, "Missed call clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.email_drawer:
//                Toast.makeText(HomeActivityy.this, "Cammpaign clicked", Toast.LENGTH_LONG).show();
                drawer_layout.closeDrawers();
                break;
            case R.id.order_list_drawer:
//                Toast.makeText(HomeActivityy.this, "Account clicked", Toast.LENGTH_LONG).show();
                drawer_layout.closeDrawers();
                break;

            case R.id.my_order_list_drawer:
//                Toast.makeText(HomeActivityy.this, "Profile clicked", Toast.LENGTH_LONG).show();
                drawer_layout.closeDrawers();
                break;
            case R.id.return_order_list_drawer:
//                Toast.makeText(HomeActivityy.this, "Default Service clicked", Toast.LENGTH_LONG).show();
                drawer_layout.closeDrawers();
                break;

            case R.id.drawer_nav:
                drawer_layout.openDrawer(GravityCompat.START);
                break;


        }
    }
}
