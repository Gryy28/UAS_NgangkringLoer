package com.gnc.ngangkringloer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private ImageView ivFoto;
    private TextView tvNama;
    private String yNama,yFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivFoto=findViewById(R.id.iv_foto);
        tvNama=findViewById(R.id.tv_nama);

        Intent terima = getIntent();
        yNama = terima.getStringExtra("xNama");
        yFoto = terima.getStringExtra("xFoto");

        tvNama.setText(yNama);
        Glide
                .with(DetailActivity.this)
                .load(yFoto)
                .into(ivFoto);
    }
}