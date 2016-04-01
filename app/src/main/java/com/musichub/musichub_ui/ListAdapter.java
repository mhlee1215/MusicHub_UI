package com.musichub.musichub_ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by mhlee on 4/1/16.
 */
public class ListAdapter extends BaseAdapter {

    Context context = null;
    List<Music> musicList;
    private static LayoutInflater inflater=null;

    public ListAdapter(Context context, List<Music> musicList){
        this.context = context;
        this.musicList = musicList;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return musicList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView;
        rowView = inflater.inflate(R.layout.activity_list_item, null);
        TextView viewTitle =(TextView) rowView.findViewById(R.id.textTitle);
        TextView viewSigner =(TextView) rowView.findViewById(R.id.textSigner);
        viewTitle.setText(this.musicList.get(position).getTitle());
        viewSigner.setText(this.musicList.get(position).getSinger());


        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TextView viewMain =(TextView) v.findViewById(R.id.textTitle);
                Toast.makeText(context, "You Clicked " + viewMain.getText(), Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }
}