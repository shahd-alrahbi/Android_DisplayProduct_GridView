package com.example.displayproduct_gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    Context context;
    String [] productName;
    int[]image;

    LayoutInflater inflater;

    public GridAdapter(Context context, String[] productName, int[] image) {
        this.context = context;
        this.productName = productName;
        this.image = image;
    }

    @Override
    public int getCount() {
        return productName.length;
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

        if(inflater==null)
            inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
          convertView=inflater.inflate(R.layout.grid_item,null);
        }

        ImageView imageView=convertView.findViewById(R.id.grid_image);
        TextView textView=convertView.findViewById(R.id.nameofitem);

        imageView.setImageResource(image[position]);
        textView.setText(productName[position]);
        return convertView;
    }
}
