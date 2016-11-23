package at.fh.swengb.pointguardlist;

import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.pointguardlist.model.PointGuard;

/**
 * Created by MacS on 23.11.16.
 */

public class CustomAdapter extends android.widget.BaseAdapter{

    List<PointGuard> listPointGuard;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<PointGuard> listPointGuard) {
        this.context = applicationContext;
        this.listPointGuard= listPointGuard;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listPointGuard.size();
    }

    @Override
    public Object getItem(int i) {
        return listPointGuard.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewAge=(TextView)view.findViewById(R.id.textViewListAge);
        TextView viewHeight=(TextView)view.findViewById(R.id.textViewListHeight);
        TextView viewWeight=(TextView)view.findViewById(R.id.textViewListWeight);
        TextView viewAssistsPerGame=(TextView)view.findViewById(R.id.textViewListAssists);

        PointGuard pointGuard = listPointGuard.get(i);
        viewName.setText(pointGuard.getName());
        viewAge.setText(String.valueOf(pointGuard.getAge()));
        viewHeight.setText(String.valueOf(pointGuard.getHeight()));
        viewWeight.setText(String.valueOf(pointGuard.getWeight()));
        viewAssistsPerGame.setText(String.valueOf(pointGuard.getAssistsPerGame()));

        return view;
    }

}
