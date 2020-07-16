package com.example.myfarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Black extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black);
    }
    public void seed(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://krushikendra.com/Field_Crops_Seeds_online "));
        startActivity(intent);
    }
    public void ferti(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://krushikendra.com/index.php?route=product/search&search=fertilizers&description=true"));
        startActivity(intent);
    }
    public void pest(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://krushikendra.com/pesticide_insecticides_online"));
        startActivity(intent);
    }
}