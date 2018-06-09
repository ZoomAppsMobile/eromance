package com.zoomapps.eromance.Adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zoomapps.eromance.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewToolbar extends RecyclerView.Adapter<RecyclerViewToolbar.ViewHolder> {

    private ArrayList<String> dataSet;

    public RecyclerViewToolbar(ArrayList<String> dataSet){
        this.dataSet = dataSet;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_menu,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewToolbar.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView profile_image;
        ViewHolder(View itemView) {
            super(itemView);
            profile_image = (CircleImageView) itemView.findViewById(R.id.profile_image);
        }
    }
}
