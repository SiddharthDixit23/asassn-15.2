package com.acadgild.siddharth.materialdesignassignment;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by siddharth on 7/5/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] title = {"Alpha","Beta","CupCake","Donut","Eclair","Froyo","GingerBread","HoneyComb","Ice cream Sandwich","Jelly Bean","KitKat","Lollipop","Marshmellow","Nought"};

// View inside the recyclerview
    class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView mtv;
        public ViewHolder(View itemView) {
            super(itemView);
            mtv = (TextView) itemView.findViewById(R.id.text);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    // onclick on the view
                    Snackbar.make(view,"You clicked : "+title[position],Snackbar.LENGTH_SHORT).show();
                }
            });
        }
    }

// layout displayed inside the recycler view
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }
// adding data inside the cardview
    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        holder.mtv.setText(title[position]);
    }
// no. of items inside the card view
    @Override
    public int getItemCount() {
        return title.length;
    }
}

