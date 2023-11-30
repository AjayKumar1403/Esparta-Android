package com.example.espartaandro.Model;


public class ImageData {
    private int imageResource;
    private String title;
    private String description;

    public ImageData(int imageResource, String title, String description) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}

