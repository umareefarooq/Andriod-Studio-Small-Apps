package com.example.dynamiclayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int Images[] = {R.drawable.img1, R.drawable.img2, R.drawable.img3};
    String Names[] = {"One user", "Two users", "Three users"};
    String Description[] = {"For one user only", "For two users only", "For three users only"};

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
            return Images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView Iv = (ImageView)convertView.findViewById(R.id.imageView);
            TextView tv = (TextView)convertView.findViewById(R.id.textView);
            TextView tv1 = (TextView)convertView.findViewById(R.id.textView2);

            Iv.setImageResource(Images[position]);
            tv.setText(Names[position]);
            tv1.setText(Description[position]);

            return convertView;
        }
    }

}