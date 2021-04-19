package com.mrais.percakapan3bahasa.Activity.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mrais.percakapan3bahasa.Activity.Model.ModelListPercakapan;
import com.mrais.percakapan3bahasa.R;

import java.util.List;

public class AdapterDataPercakapan extends RecyclerView.Adapter<AdapterDataPercakapan.MyHolder> {

    List<ModelListPercakapan> listData;

    public AdapterDataPercakapan(List<ModelListPercakapan> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public AdapterDataPercakapan.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_data_percakapan, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDataPercakapan.MyHolder holder, int position) {

        ModelListPercakapan modelListPercakapan = listData.get(position);

        holder.judulPercakapan.setText(modelListPercakapan.getJudulPercakapan());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView judulPercakapan;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            judulPercakapan = itemView.findViewById(R.id.judulPercakapan);
        }
    }
}
