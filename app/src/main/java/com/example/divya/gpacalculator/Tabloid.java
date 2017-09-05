package com.example.divya.gpacalculator;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class Tabloid extends AppCompatActivity {

    GridView gridView;
    Context context;
    ArrayList arrayList;

    public static String[] list = {"SRM University", "Other colleges"};

    public static int[] imagelist = {R.drawable.clg5, R.drawable.clg5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabloid);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        gridView = (GridView) findViewById(R.id.gridView2);
        gridView.setAdapter(new CustomAdapter(this, list, imagelist));




    }

@Override
    public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
    }


}


    class  CustomAdapter extends BaseAdapter {
        String[] result;
        Context context;
        int[] imageId;

        private static LayoutInflater inflater = null;

        public CustomAdapter(Tabloid tabloid, String[] list, int[] imagelist) {
            result = list;
            context = tabloid;
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
            final View rowView;

            rowView = inflater.inflate(R.layout.activity_image, null);
            holder.tv = (TextView) rowView.findViewById(R.id.textView0);
            holder.img = (ImageView) rowView.findViewById(R.id.imageView0);

            holder.img.setImageResource(imageId[position]);
            holder.tv.setText(result[position]);


            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (position == 0) {
                        context.startActivity(new Intent(context, Session.class));


                    } else if (position == 1) {

                        final AlertDialog.Builder alert = new AlertDialog.Builder(context);
                        alert.setTitle("Message...");
                        alert.setMessage("COMING SOON!");
                        /*alert.setButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                alert.dismiss();


                            }
                        });*/
                        alert.show();
                    }
                }
            });

            return rowView;

            // Create the AlertDialog object and return i


        }
    }
