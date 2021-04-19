package com.mrais.percakapan3bahasa.Activity.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.mrais.percakapan3bahasa.Activity.Model.SlideItemImage;
import com.mrais.percakapan3bahasa.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class SlideImageAdapter extends SliderViewAdapter<SlideImageAdapter.SliderAdapter> {
    private Context context;
    private List<SlideItemImage> listdataslide = new ArrayList<>();

    public SlideImageAdapter(Context context) {
        this.context = context;
    }

    public void renewItems(List<SlideItemImage> slideItemImages) {
        this.listdataslide = slideItemImages;
        notifyDataSetChanged();
    }

    public void deleteItem(int position) {
        this.listdataslide.remove(position);
        notifyDataSetChanged();
    }

    public void addItem(SlideItemImage slideItemImage) {
        this.listdataslide.add(slideItemImage);
        notifyDataSetChanged();
    }

    @Override
    public SliderAdapter onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.imge_slide_show, null);
        return new SliderAdapter(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapter viewHolder, final int position) {
        SlideItemImage slideItemImage = listdataslide.get(position);

        viewHolder.textView.setText(slideItemImage.getDeskripsi());
        viewHolder.textView.setTextSize(16);
        viewHolder.textView.setTextColor(Color.WHITE);
//        memanggil gambar
        Glide.with(viewHolder.itemView)
                .load(slideItemImage.getImg1())
                .fitCenter()
                .into(viewHolder.imageView1);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This is item in position" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getCount() {
        return listdataslide.size();
    }

    public class SliderAdapter extends SliderViewAdapter.ViewHolder {

        View view;
        ImageView imageView1, imageView2;
        TextView textView;

        public SliderAdapter(View itemView) {
            super(itemView);

            imageView1 = itemView.findViewById(R.id.iv_auto_image_slider);
            imageView2 = itemView.findViewById(R.id.iv_gif_container);
            textView = itemView.findViewById(R.id.tv_auto_image_slider);
            this.view = itemView;
        }
    }
}
