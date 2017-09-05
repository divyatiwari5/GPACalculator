package com.example.divya.gpacalculator;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.opengl.EGLDisplay;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SearchViewCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class batch2 extends Fragment {

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



    Float mvalue1, mvalue2, mvalue3, mvalue5, mvalue4, gpa2;
    //   ArrayList<String> spinnerArray = new ArrayList<>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_batch2, container, false);


        credit1 = (EditText) view.findViewById(R.id.EditText1);
        credit2 = (EditText) view.findViewById(R.id.EditText12);
        credit3 = (EditText) view.findViewById(R.id.EditText15);
        credit4 = (EditText) view.findViewById(R.id.EditText13);
        credit5 = (EditText) view.findViewById(R.id.EditText14);


        spinner = (Spinner) view.findViewById(R.id.spinner1);
        spinner2 = (Spinner) view.findViewById(R.id.spinner12);
        spinner3 = (Spinner) view.findViewById(R.id.spinner13);
        spinner4 = (Spinner) view.findViewById(R.id.spinner14);
        spinner5 = (Spinner) view.findViewById(R.id.spinner15);
        // spinnernew = (Spinner) view.findViewById(R.id.extraspinner);

        buttoncal = (Button) view.findViewById(R.id.button1);


        buttoncls = (Button) view.findViewById(R.id.button13);
        Grade1 = getResources().getStringArray(R.array.Grade1);

        imageView = (ImageView) view.findViewById(R.id.addiconn);
        linearLayout = (LinearLayout) view.findViewById(R.id.linear1);
        linearlayout1 = (LinearLayout) view.findViewById(R.id.linear2);
        imageView2 = (ImageView) view.findViewById(R.id.minusiconn);

        final EditText textView = new EditText(this.getContext());
        textView.setHint("Credit");
        allspin = new ArrayList<Spinner>();
     //   ArrayAdapter<String> allspin = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item,list);


        final ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_dropdown_item_1line, Grade1);
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
                linearLayout.addView(createNewTextView(textView.getText().toString()));

                Spinner createspinner = createspinner();
                linearlayout1.addView(createspinner);
                sp1.setAdapter(adp1);




            }

        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                linearLayout.removeView(textnew);

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

                                             float total = ((mvalue1 * temp) + (mvalue2 * temp2) + (mvalue3 * temp3) + (mvalue4 * temp4) + (mvalue5 * temp5));
                                             gpa2 = ((total) / (mvalue1 + mvalue2 + mvalue3 + mvalue4 + mvalue5));

                                             Toast.makeText(getActivity(), "GPA " + gpa2, Toast.LENGTH_SHORT).show();

            }
        });





        buttoncls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ArrayAdapter<String> dataAdapter;
                dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, Grade1);
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
        return view;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    final List<EditText> allid = new ArrayList<EditText>();

    private EditText createNewTextView(String text) {
        //final LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        final EditText textView = new EditText(this.getContext());
        //textView.setLayoutParams(layoutParams);

        textView.setHint("Credit" + text);
        textView.setInputType(InputType.TYPE_CLASS_NUMBER);
        textView.setEms(10);
        allid.add(textView);
        textnew = textView;
        return textnew;
    }

    // ArrayAdapter<String> data  = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, list);

    private Spinner createspinner() {
        list.add("Grade");
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


        final Spinner sp = new Spinner(getActivity());
        final ArrayAdapter<String> adp = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, list);
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //data.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp1 = sp;
        adp1 = adp;
       // allspin.add(sp);
        return sp;
    }

}