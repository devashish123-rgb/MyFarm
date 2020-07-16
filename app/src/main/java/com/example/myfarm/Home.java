package com.example.myfarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void rs(View view)
    {
        Intent intent=new Intent(this, Red.class);
        startActivity(intent);
    }
    public void ys(View view)
    {
        Intent intent=new Intent(this, Yellow.class);
        startActivity(intent);
    }
    public void bs(View view)
    {
        Intent intent=new Intent(this, Brown.class);
        startActivity(intent);
    }
    public void bls(View view)
    {
        Intent intent=new Intent(this, Black.class);
        startActivity(intent);
    }
    public void ws(View view)
    {
        Intent intent=new Intent(this, White.class);
        startActivity(intent);
    }
    public void gs(View view)
    {
        Intent intent=new Intent(this, Grey.class);
        startActivity(intent);
    }
    public void krs(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/Krushikendra+near+me"));
        startActivity(intent);
    }
    public void wea(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=weather+report+in+my+location"));
        startActivity(intent);
    }


}