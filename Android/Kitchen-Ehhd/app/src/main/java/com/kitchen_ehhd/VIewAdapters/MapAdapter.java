package com.kitchen_ehhd.VIewAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kitchen_ehhd.R;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by vishalkuo on 15-09-19.
 */
public class MapAdapter extends BaseAdapter {
    private final ArrayList mapData;

    public MapAdapter(Map<String, Integer> map) {
        mapData = new ArrayList();
        mapData.addAll(map.entrySet());
    }

    @Override
    public int getCount() {
        return mapData.size();
    }

    @Override
    public Map.Entry<String, Integer> getItem(int i) {
        return (Map.Entry)mapData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View endView;

        if (view == null){
            endView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_adapter, viewGroup, false);
        } else{
            endView = view;
        }

        Map.Entry<String, Integer> items = getItem(i);

        ((TextView)endView.findViewById(R.id.item_name)).setText(items.getKey());
        ((TextView)endView.findViewById(R.id.drawer_number)).setText(String.valueOf(items.getValue()));

        return endView;
    }
}
