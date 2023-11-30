package com.example.espartaandro.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;




import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.espartaandro.R;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    private int[] imageResources;
    private OnItemClickListener onItemClickListener;

    public ImageAdapter(int[] imageResources) {
        this.imageResources = imageResources;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        int imageResource = imageResources[position];
        holder.bind(imageResource);
    }

    @Override
    public int getItemCount() {
        return imageResources.length;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewItem;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewItem = itemView.findViewById(R.id.imageViewItem);

            // Set click listener for the item
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(getAdapterPosition());
                    }
                }
            });
        }

        public void bind(int imageResource) {
            imageViewItem.setImageResource(imageResource);
        }
    }
}
