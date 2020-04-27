package com.example.digitcode;

import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class ElemAdapter extends ArrayAdapter<Elem> {
    private LayoutInflater inflater;
    private int layout;
    private List<Elem> states;

    public ElemAdapter(Context context, int resource, List<Elem> states) {
        super(context, resource, states);
        this.states = states;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view=inflater.inflate(this.layout, parent, false);
        ImageView flagView = (ImageView) view.findViewById(R.id.flag);
        TextView nameView = (TextView) view.findViewById(R.id.name);

        Elem state = states.get(position);
        flagView.setImageResource(state.getFlagResource());
        nameView.setText(state.getName());
        (view.findViewById(R.id.bg)).setBackgroundColor(state.getColor());
        return view;
    }
}
