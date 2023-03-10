package com.gnc.ngangkringloer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.ClassViewHolder>{
    private ArrayList<ModelAngkringan> dataAngkringan;
    private Context ctx;


    public AdapterCard(ArrayList<ModelAngkringan> dataAngkringan, Context ctx) {
        this.dataAngkringan = dataAngkringan;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varView = LayoutInflater.from(ctx).inflate(R.layout.item_card, parent, false);
        return new ClassViewHolder(varView);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassViewHolder holder, int position) {
        ModelAngkringan angkringan = dataAngkringan.get(position);
        holder.tvNama.setText(angkringan.getNama());
        Glide
                .with(ctx)
                .load(angkringan.getFoto())
                .centerCrop()
                .into(holder.ivFoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String xNama, xTentang, xFoto;

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
        TextView tvNama, tvTentang;
        ImageView ivFoto;

        public ClassViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            ivFoto = itemView.findViewById(R.id.iv_foto);
        }
    }
}
