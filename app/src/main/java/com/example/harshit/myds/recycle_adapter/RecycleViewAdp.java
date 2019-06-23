package com.example.harshit.myds.recycle_adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import com.example.harshit.myds.R;

public class RecycleViewAdp extends RecyclerView.Adapter<RecycleViewAdp.ViewHolder> {
    //private Context context;
    private ArrayList<String> arrayList;

    public RecycleViewAdp(Context context, ArrayList<String> arrayList) {
      //  this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layInFlt = LayoutInflater.from(viewGroup.getContext());
        View listitem = layInFlt.inflate(R.layout.recycler_cell, viewGroup, false);
        ViewHolder v = new ViewHolder(listitem);
        return v;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        viewHolder.titv.setText(arrayList.get(i));
        viewHolder.destv.setText(arrayList.get(i));


    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoaIm;
        TextView titv, destv;
        Button okBut;

        public ViewHolder(@NonNull View itemview) {
            super(itemview);
            logoaIm = itemview.findViewById(R.id.im1);
            titv = itemview.findViewById(R.id.tv1);
            destv = itemview.findViewById(R.id.tv2);
            okBut = itemview.findViewById(R.id.bt1);
        }

    }

}
