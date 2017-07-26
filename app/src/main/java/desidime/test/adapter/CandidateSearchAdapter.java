package desidime.test.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import desidime.test.R;


/**
 * Created by Suraj shakya on 11/8/16.
 * shakyasuraj08@mail.com
 */
public class CandidateSearchAdapter extends BaseAdapter {

    LayoutInflater layoutInflater;
    Context context;
    Activity activity;
    public ArrayList<String> candidateList;
    SharedPreferences sharedPreferences;
    String TAG;

    public CandidateSearchAdapter(Context context, ArrayList<String> candidateList){
        this.context = context;
        this.candidateList = candidateList;
    }

    @Override
    public int getViewTypeCount() {
        return getCount();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return candidateList.size();
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        layoutInflater = LayoutInflater.from(context);
        final ViewHolder holder;
        if(convertView==null){
          holder = new ViewHolder();
          convertView = layoutInflater.inflate(R.layout.dealrow_item,null);
          holder.messageTxt = (TextView) convertView.findViewById(R.id.messageTxt);
          convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.messageTxt.setText(candidateList.get(position));
        return convertView;
    }

    class ViewHolder{
        TextView messageTxt;

    }
}
