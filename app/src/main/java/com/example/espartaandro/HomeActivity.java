package com.example.espartaandro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;




import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.example.espartaandro.Adapters.ImageAdapter;

import io.paperdb.Paper;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Assuming you have an array or list of image resources
        final int[] imageResources = {R.drawable.art1, R.drawable.art2, R.drawable.art3, R.drawable.art4, R.drawable.art5, R.drawable.art6, R.drawable.art7, R.drawable.art8, R.drawable.art9, R.drawable.art10};

        recyclerView = findViewById(R.id.recyclerView);
        ImageAdapter imageAdapter = new ImageAdapter(imageResources);

        // Use a LinearLayoutManager for a vertical list
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(imageAdapter);

        // Set a click listener for the adapter
        imageAdapter.setOnItemClickListener(new ImageAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                int selectedImageResource = imageResources[position];

                Intent intent = new Intent(HomeActivity.this, ItemView.class);
                intent.putExtra("imageResource", selectedImageResource);
                startActivity(intent);
            }
        });
    }
}
