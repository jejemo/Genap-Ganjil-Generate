package com.maho.upi.ggappjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class ListAdapter extends ArrayAdapter<Model> {
    private ArrayList<Model> dataSet;
    Context mContext;

    private static class ViewHolder{
        TextView txtNum;
        TextView txtBil;
        TextView txtGG;
    }

    public ListAdapter(ArrayList<Model> data, Context context) {
        super(context, R.layout.list_gg, data);
        this.dataSet = data;
        this.mContext = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Model model = getItem(position);
        ViewHolder viewHolder;

        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_gg, parent, false);
            viewHolder.txtNum = (TextView)convertView.findViewById(R.id.txtnum);
            viewHolder.txtBil = (TextView)convertView.findViewById(R.id.txtbilangan);
            viewHolder.txtGG = (TextView)convertView.findViewById(R.id.txtgg);

            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder =(ViewHolder)convertView.getTag();
            result = convertView;
        }

        viewHolder.txtNum.setText(model.getNum());
        viewHolder.txtBil.setText(model.getBil());
        viewHolder.txtGG.setText(model.getGg());

        return convertView;
    }


}
