package com.lazarus.farmersmarket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {


    private Context mContext;
    private List<Product> mdata;

    public RecyclerAdapter(Context mContext, List<Product> mdata) {
        this.mContext = mContext;
        this.mdata = mdata;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater= LayoutInflater.from(mContext);
        view=mInflater.inflate(R.layout.product_card,parent,false);

        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.name.setText(mdata.get(position).getName());
        holder.iv.setImageResource(mdata.get(position).getThumbnail());
        holder.desc.setText(mdata.get(position).getDesc());
        holder.cost.setText(mdata.get(position).getCost());
        holder.qty.setText(mdata.get(position).getQuantity());
        holder.fnme.setText(mdata.get(position).getFarmerName());
        holder.rtng.setText(mdata.get(position).getRating());
        holder.expdt.setText(mdata.get(position).getExpiry());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name,cost, qty, desc, fnme, rtng,expdt,thmbnl;
        ImageView iv;



        public MyViewHolder(View itemView) {
            super(itemView);


            name = itemView.findViewById(R.id.Pname);
            cost = itemView.findViewById(R.id.Pcost);
            qty = itemView.findViewById(R.id.Pqty);
            desc = itemView.findViewById(R.id.Pdesc);
            fnme = itemView.findViewById(R.id.Pfname);
            rtng = itemView.findViewById(R.id.Prating);
            expdt = itemView.findViewById(R.id.Pexp);

            iv= itemView.findViewById(R.id.img);

        }
    }
}
