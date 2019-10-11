package com.alonsol.databindingdemo;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingConversion;

public class Image {

    private String url;

    public Image(String url) {
        this.url = url;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @BindingAdapter("url")
    public static void loadImage(ImageView view, String url) {
        Log.e("TAG", "loadImage: url: " + url);
    }

    @BindingAdapter("android:text")
    public static void setText(Button view, String text) {
        view.setText(text + "-Button");
    }

    @BindingConversion
    public static String conversionString(String text) {
        return text + "-conversionString";
    }


    @BindingConversion
    public static Drawable convertStringToDrawable(String str) {
        if (str.equals("红色")) {
            return new ColorDrawable(Color.parseColor("#ff4081"));
        }
        if (str.equals("蓝色")) {
            return new ColorDrawable(Color.parseColor("#3f51b5"));
        }
        return new ColorDrawable(Color.parseColor("#344567"));
    }

    @BindingConversion
    public static int convertStringToColor(String str) {
        if (str.equals("红色")) {
            return Color.parseColor("#ff4081");
        }
        if (str.equals("蓝色")) {
            return Color.parseColor("#3f51b5");
        }

        return Color.parseColor("#344567");
    }
}
