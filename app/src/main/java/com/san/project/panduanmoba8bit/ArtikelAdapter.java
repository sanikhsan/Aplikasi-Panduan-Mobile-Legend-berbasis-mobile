package com.san.project.panduanmoba8bit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ArtikelAdapter extends RecyclerView.Adapter<ArtikelAdapter.ListViewHolder> {
    private ArrayList<Postingan> listArtikel;

    public ArtikelAdapter(ArrayList<Postingan> list){
        this.listArtikel = list;
    }

    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.artikel_list, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Postingan post = listArtikel.get(position);
        Glide.with(holder.itemView.getContext())
                .load(post.getPhoto())
                .apply(new RequestOptions().override(95, 95))
                .into(holder.imgPhoto);
        holder.tvName.setText(post.getJudul());
        holder.tvTag.setText(post.getTag());
        holder.tvDetail.setText(post.getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return listArtikel.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvTag;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvTag = itemView.findViewWithTag(R.id.tv_item_tag);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
