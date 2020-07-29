package com.example.atlitoskeleton.ui.cake;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atlitoskeleton.R;
import com.example.atlitoskeleton.model.CakeModel;

import java.util.ArrayList;

public class CakeAdapter extends RecyclerView.Adapter<CakeAdapter.ViewHolder> {

    ArrayList<CakeModel> cakeModels;

    public CakeAdapter(ArrayList<CakeModel> cakeModels) {
        this.cakeModels = cakeModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_cake, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textCake.setText(cakeModels.get(position).nameCake);
    }

    @Override
    public int getItemCount() {
        return cakeModels.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textCake;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textCake = itemView.findViewById(R.id.tv_cake);
        }
    }
}
