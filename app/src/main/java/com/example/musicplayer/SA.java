package com.example.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SA extends ArrayAdapter<s> {
    public SA(Activity contect, ArrayList<s> song){
        super(contect,0,song);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView==null)
        {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.listviewbg,parent,false);
        }
        s currentPosition=getItem(position);
        TextView song=(TextView) convertView.findViewById(R.id.song);
        song.setText(currentPosition.getSongName());
        TextView sing=(TextView) convertView.findViewById(R.id.singer);
        sing.setText(currentPosition.getSinger());
        return  convertView;

    }
}
