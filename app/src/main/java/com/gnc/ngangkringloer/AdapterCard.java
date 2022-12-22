package com.gnc.ngangkringloer;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.ClassViewHolder>{
    private ArrayList<ModelAngkringan> dataAngkringan;
    private Context ctx;

    public AdapterCard(ArrayList<ModelAngkringan> dataPahlawan, Context ctx) {
        this.dataAngkringan = dataAngkringan;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public AdapterCard.ClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCard.ClassViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
