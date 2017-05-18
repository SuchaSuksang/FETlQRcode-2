package appewtc.masterung.fetlqrcode;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by THQN150303 on 18/05/2017.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private String[] iconStrings, titleStrings, detailStrings;
    private ImageView imageView;
    private TextView titleTextView,detailTextView;

    public MyAdapter(Context context, String[] iconStrings, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.iconStrings = iconStrings;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {

            return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.listview_layout, parent, false);

        //Inetial View
        imageView = (ImageView) view.findViewById(R.id.imageView);
        titleTextView = (TextView) view.findViewById(R.id.txtTitle);
        detailTextView = (TextView) view.findViewById(R.id.txtDetail);

        return view;
    }
}//Main Class
