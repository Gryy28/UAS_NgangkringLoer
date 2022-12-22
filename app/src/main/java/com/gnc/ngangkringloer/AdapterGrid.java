package com.gnc.ngangkringloer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterGrid extends RecyclerView.Adapter<AdapterGrid.ClassViewHolder>{
    private ArrayList<ModelAngkringan> dataAngkringan;
    private Context ctx;

    public AdapterGrid(ArrayList<ModelAngkringan> dataAngkringan, Context ctx) {
        this.dataAngkringan = dataAngkringan;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varView = LayoutInflater.from(ctx).inflate(R.layout.item_grid, parent, false);
        return new ClassViewHolder(varView);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassViewHolder holder, int position) {
        ModelAngkringan angkringan = dataAngkringan.get(position);
        Glide
                .with(ctx)
                .load(angkringan.getFoto())
                .into(holder.ivGrid);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String xNama, xFoto;

                xNama = angkringan.getNama();
                xFoto = angkringan.getFoto();

                Intent kirim = new Intent(ctx, DetailActivity.class);
                kirim.putExtra("xNama", xNama);
                kirim.putExtra("xFoto", xFoto);
                ctx.startActivity(kirim);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataAngkringan.size();
    }

    public class ClassViewHolder extends RecyclerView.ViewHolder {
        ImageView ivGrid;

        public ClassViewHolder(@NonNull View itemView) {
            super(itemView);
            ivGrid = itemView.findViewById(R.id.iv_grid);
        }
    }

}
