package com.example.divya.gpacalculator;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.Batch;

import java.util.ArrayList;

public class Session extends AppCompatActivity {


        GridView gridView;
        Context context;
        ArrayList arrayList;

        public static String[] list1 = {"2014", "2015", "2016"};

        public static int[] imagelist1 = {R.drawable.session, R.drawable.session, R.drawable.session};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_session);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
// relativeLayout.setBackgroundColor(Color.LTGRAY);
            if (getSupportActionBar() != null){
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setDisplayShowHomeEnabled(true);
            }

            gridView = (GridView) findViewById(R.id.gridView3);
            gridView.setAdapter(new CustomAdapter1(this, list1, imagelist1));


        }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


    @Override
        public boolean onCreateOptionsMenu(Menu menu){
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }


    }


    class  CustomAdapter1 extends BaseAdapter {
        String[] result;
        Context context;
        int[] imageId;

        private static LayoutInflater inflater = null;

        public CustomAdapter1(Session session, String[] list, int[] imagelist) {
            result = list;
            context = session;
            imageId = imagelist;
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            return result.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;

        }

        public class Holder {

            TextView tv;
            ImageView img;
        }

        @Override
        public View getView(final int position, final View convertView, ViewGroup parent) {

            Holder holder = new Holder();
            View rowView;

            rowView = inflater.inflate(R.layout.activity_image, null);
            holder.tv = (TextView) rowView.findViewById(R.id.textView0);
            holder.img = (ImageView) rowView.findViewById(R.id.imageView0);

            holder.img.setImageResource(imageId[position]);
            holder.tv.setText(result[position]);


            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (position == 0) {
                        context.startActivity(new Intent(context, MainActivity.class));

                    }
                    else if(position == 1){
                        context.startActivity(new Intent(context, SES2014.class));
                    }
                    else {
                        final AlertDialog.Builder alert = new AlertDialog.Builder(context);
                        alert.setTitle("Message...");
                        alert.setMessage("COMING SOON!");
                    }
                }


            });

            return rowView;
        }
    }
