package com.shubham.customlistview;

import android.app.Activity;
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Custom extends ArrayAdapter<String> {
    Activity c;
    String[] s1;
    Integer[] img;

    public Custom(Context context, String[] resource, Integer[] textViewResourceId) {
        super(context, R.layout.activity_main, resource);

        c=(Activity)context;
        s1=resource;
        img=textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater LF=c.getLayoutInflater();
        convertView=LF.inflate(R.layout.simple,null);
        ImageView im=convertView.findViewById(R.id.images);
        TextView tv=convertView.findViewById(R.id.texts);
        im.setImageResource(img[position]);
        tv.setText(s1[position]);
        return convertView;
    }
}
