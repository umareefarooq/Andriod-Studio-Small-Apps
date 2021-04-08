package com.example.customlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String Names[] = {"Cameras", "Laptops", "Headphones"};
    int Images1 [] = { R.drawable.c1, R.drawable.l1, R.drawable.h1};
    int Images2 [] = { R.drawable.c2, R.drawable.l2, R.drawable.h2};
    int Images3 [] = { R.drawable.c3, R.drawable.l3, R.drawable.h3};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView)findViewById(R.id.listview);
        CustomerAdapter ca = new CustomerAdapter();
        lv.setAdapter(ca);

    }

    class CustomerAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return Images1.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }
        //find the problem and solve it.. watch 25/3/21 at 1;15;23

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayout,null);
            TextView tv = (TextView)convertView.findViewById(R.id.tv);
            ImageView Iv = (ImageView)convertView.findViewById(R.id.iv1);
            ImageView Ivv = (ImageView)convertView.findViewById(R.id.iv2);
            ImageView Ivvv = (ImageView)convertView.findViewById(R.id.iv3);


            tv.setText(Names[position]);
            Iv.setImageResource(Images1[position]);
            Ivv.setImageResource(Images2[position]);
            Ivvv.setImageResource(Images3[position]);



            return convertView;
        }
    }
}