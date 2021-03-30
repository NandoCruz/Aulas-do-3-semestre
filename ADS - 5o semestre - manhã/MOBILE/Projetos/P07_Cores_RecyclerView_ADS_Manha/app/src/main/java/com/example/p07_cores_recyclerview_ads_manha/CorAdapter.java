package com.example.p07_cores_recyclerview_ads_manha;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CorAdapter extends RecyclerView.Adapter<CorAdapter.ViewHolder> {
    private List<String> listaCores;
    public CorAdapter(List<String> dados) {
        this.listaCores = dados;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtCor;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtCor = itemView.findViewById(R.id.txt_cor);
        }
    }

    @Override
    public CorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_cor, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtCor.setText(listaCores.get(position));
    }

    @Override
    public int getItemCount() {
        if(listaCores != null)
            return listaCores.size();
        return 0;
    }
}
