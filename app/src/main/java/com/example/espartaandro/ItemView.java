package com.example.espartaandro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ItemView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view);


//        Button addToCart = findViewById(R.id.addcart);
        Button buyNow = findViewById(R.id.buyNow);

        // Retrieve the image resource ID from the intent
        int imageResource = getIntent().getIntExtra("imageResource", 0);

        // Find the ImageView in the target layout
        ImageView itemImageView = findViewById(R.id.imageView10);

        // Set the image resource to the ImageView
        itemImageView.setImageResource(imageResource);




        buyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemView.this, ConfirmationActivity.class);
                startActivity(intent);
            }
        });
    }
}