package com.example.displayproduct_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gridview);

        String [] productName={"product1","product2","product3","product4","product5","product6"};
        int[]image={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.a};

        GridAdapter gridAdapter=new GridAdapter(MainActivity.this,productName,image);
        gridView.setAdapter(gridAdapter);

    }
}