package com.example.divya.gpacalculator;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SES2014 extends AppCompatActivity {


    public int temp, temp2, temp3, temp4, temp5, t, i;
    private String[] Grade1;
    private Spinner spinner, spinner2, spinner3, spinner4, spinner5, sp1;
    EditText credit1;
    EditText credit2;
    EditText credit3;
    EditText credit4;
    EditText credit5;
    EditText textnew;
    Button buttoncls, buttoncal;
    private ImageView imageView, imageView2;
    private LinearLayout linearLayout, linearlayout1;
    private int point;
    ArrayAdapter adp1;
    final List<String> list = new ArrayList<>();

    List<Spinner> allspin;


    Float mvalue1, mvalue2, mvalue3, mvalue5, mvalue4, gpa, total, getTotal;
    //   ArrayList<String> spinnerArray = new ArrayList<>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ses2014);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        credit1 = (EditText) findViewById(R.id.EditText1);
        credit2 = (EditText) findViewById(R.id.EditText12);
        credit3 = (EditText) findViewById(R.id.EditText15);
        credit4 = (EditText) findViewById(R.id.EditText13);
        credit5 = (EditText) findViewById(R.id.EditText14);


        spinner = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner12);
        spinner3 = (Spinner) findViewById(R.id.spinner13);
        spinner4 = (Spinner) findViewById(R.id.spinner14);
        spinner5 = (Spinner) findViewById(R.id.spinner15);
        // spinnernew = (Spinner) view.findViewById(R.id.extraspinner);

        buttoncal = (Button) findViewById(R.id.button1);


        buttoncls = (Button) findViewById(R.id.button13);
        Grade1 = getResources().getStringArray(R.array.Grade1);

        imageView = (ImageView) findViewById(R.id.addiconn);
        linearLayout = (LinearLayout) findViewById(R.id.linear1);
        linearlayout1 = (LinearLayout) findViewById(R.id.linear2);
        imageView2 = (ImageView) findViewById(R.id.minusiconn);

        final EditText textView = new EditText(this);
        textView.setHint("Credit");
        allspin = new ArrayList<Spinner>();
        //   ArrayAdapter<String> allspin = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item,list);


        final ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, Grade1);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        spinner2.setAdapter(dataAdapter);
        spinner3.setAdapter(dataAdapter);
        spinner4.setAdapter(dataAdapter);
        spinner5.setAdapter(dataAdapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 1) {
                    point = 10;

                } else if (position == 2) {
                    point = 9;

                } else if (position == 3) {
                    point = 8;
                } else if (position == 4) {
                    point = 7;
                } else if (position == 5) {
                    point = 6;
                } else if (position == 6) {
                    point = 5;
                } else if (position == 7 | position == 8 | position == 9 | position == 10) {
                    point = 0;
                }
                temp = point;

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                if (position == 1) {
                    point = 10;

                } else if (position == 2) {
                    point = 9;

                } else if (position == 3) {
                    point = 8;
                } else if (position == 4) {
                    point = 7;
                } else if (position == 5) {
                    point = 6;
                } else if (position == 6) {
                    point = 5;
                } else if (position == 7 | position == 8 | position == 9 | position == 10) {
                    point = 0;
                }
                temp2 = point;

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                if (position == 1) {
                    point = 10;

                } else if (position == 2) {
                    point = 9;

                } else if (position == 3) {
                    point = 8;
                } else if (position == 4) {
                    point = 7;
                } else if (position == 5) {
                    point = 6;
                } else if (position == 6) {
                    point = 5;
                } else if (position == 7 | position == 8 | position == 9 | position == 10) {
                    point = 0;
                }
                temp3 = point;

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                if (position == 1) {
                    point = 10;

                } else if (position == 2) {
                    point = 9;

                } else if (position == 3) {
                    point = 8;
                } else if (position == 4) {
                    point = 7;
                } else if (position == 5) {
                    point = 6;
                } else if (position == 6) {
                    point = 5;
                } else if (position == 7 | position == 8 | position == 9 | position == 10) {
                    point = 0;
                }
                temp4 = point;

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                if (position == 1) {
                    point = 10;

                } else if (position == 2) {
                    point = 9;

                } else if (position == 3) {
                    point = 8;
                } else if (position == 4) {
                    point = 7;
                } else if (position == 5) {
                    point = 6;
                } else if (position == 6) {
                    point = 5;
                } else if (position == 7 | position == 8 | position == 9 | position == 10) {
                    point = 0;
                }
                temp5 = point;

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //linearLayout.addView(createNewTextView(textView.getText().toString()));
                // ((LinearLayout)textView.getParent()).addView(textView);
                   linearLayout.addView(textView);

                Spinner createspinner = createspinner();
                linearlayout1.addView(createspinner);
                sp1.setAdapter(adp1);


            }

        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                linearLayout.removeView(textnew);
                // linearlayout1.removeView(spinnernew);
                //((LinearLayout) textnew.getParent()).removeView(textnew);
                // linearLayout.removeView(textnew);
                // linearlayout1.removeView(spinnernew);
                linearlayout1.removeView(sp1);


            }
        });


        buttoncal.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {

                                             mvalue1 = Float.parseFloat(credit1.getText() + "");
                                             mvalue2 = Float.parseFloat(credit2.getText() + "");
                                             mvalue3 = Float.parseFloat(credit3.getText() + "");
                                             mvalue4 = Float.parseFloat(credit4.getText() + "");
                                             mvalue5 = Float.parseFloat(credit5.getText() + "");


                                             float total1 = ((mvalue1 * temp) + (mvalue2 * temp2) + (mvalue3 * temp3) + (mvalue4 * temp4) + (mvalue5 * temp5));
                                             gpa = ((total1) / (mvalue1 + mvalue2 + mvalue3 + mvalue4 + mvalue5));

                                             Toast.makeText(getApplicationContext(), "GPA " + gpa, Toast.LENGTH_SHORT).show();

                                             if(gpa==null){
                                                 final AlertDialog alert = new AlertDialog.Builder(getApplication()).create();
                                                 alert.setTitle("Alert!!!");
                                                 alert.setMessage("Please Enter value !!!");
                                                 alert.setButton("OK", new DialogInterface.OnClickListener() {
                                                     @Override
                                                     public void onClick(DialogInterface dialog, int which) {

                                                         alert.dismiss();


                                                     }
                                                 });
                                                 alert.show();

                                             }
                                         }
                                     });

                buttoncls.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        ArrayAdapter<String> dataAdapter;
                        dataAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, Grade1);
                        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                        credit1.setText("");
                        credit2.setText("");
                        credit3.setText("");
                        credit4.setText("");
                        credit5.setText("");

                        spinner.setAdapter(dataAdapter);
                        spinner2.setAdapter(dataAdapter);
                        spinner3.setAdapter(dataAdapter);
                        spinner4.setAdapter(dataAdapter);
                        spinner5.setAdapter(dataAdapter);


                    }

                });
            }


/*
            final List<EditText> allid = new ArrayList<EditText>();

            private EditText createNewTextView(String text) {
                //final LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                final EditText textView = new EditText(this.getApplicationContext());
                //textView.setLayoutParams(layoutParams);

                textView.setHint("Credit" + text);
                textView.setInputType(InputType.TYPE_CLASS_NUMBER);
                textView.setEms(8);
                allid.add(textView);
                textnew = textView;
                return textnew;
            }
            */

            // ArrayAdapter<String> data  = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, list);

            private Spinner createspinner() {
                list.add(" Select Grade");
                list.add("O");
                list.add("A+");
                list.add("A");
                list.add("B+");
                list.add("B");
                list.add("C");
                list.add("D");
                list.add("F");
                list.add("Ab");
                list.add("I");


                final Spinner sp = new Spinner(getApplicationContext());
                final ArrayAdapter<String> adp = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, list);
                adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                //data.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                sp1 = sp;
                adp1 = adp;
                // allspin.add(sp);
                return sp;
            }

}
