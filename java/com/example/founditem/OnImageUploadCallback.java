package com.example.founditem;

public interface OnImageUploadCallback {
    void onSuccess(String imageUrl);

    void onFailure();
}
