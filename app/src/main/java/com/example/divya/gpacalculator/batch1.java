package com.example.divya.gpacalculator;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
//import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.divya.gpacalculator.R.layout.*;

public class batch1 extends Fragment {

    private String[] Grade;
    private ImageView imageView, imageView2, imageView3, imageView4, imageView5, imageView6,
            imageView7, imageView8, imageView9, imageView10;
    private RelativeLayout relativeLayout;
    private LinearLayout linearLayout;
    private  int point, temp, temp2, temp3, temp4, temp5;
    private Spinner spinner, spinner2, spinner3, spinner4, spinner5;
    EditText credit1, credit2, credit3, credit4, credit5 ;


    Button buttoncls, buttoncal;

    Float mvalue11, mvalue21 , mvalue31, mvalue51,
            mvalue41, gpa1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_batch1, container, false);


        imageView  = (ImageView) view.findViewById(R.id.addicon);
        imageView2  = (ImageView) view.findViewById(R.id.addicon);
        imageView3  = (ImageView) view.findViewById(R.id.addicon);
        imageView4  = (ImageView) view.findViewById(R.id.addicon);
        imageView5  = (ImageView) view.findViewById(R.id.addicon);
        imageView6  = (ImageView) view.findViewById(R.id.minusicon);
        imageView7  = (ImageView) view.findViewById(R.id.minusicon2);
        imageView8  = (ImageView) view.findViewById(R.id.minusicon3);
        imageView9  = (ImageView) view.findViewById(R.id.minusicon4);
        imageView10  = (ImageView) view.findViewById(R.id.minusicon5);



        credit1 = (EditText) view.findViewById(R.id.EditText);
        credit2 = (EditText) view.findViewById(R.id.EditText2);
        credit3 = (EditText) view.findViewById(R.id.EditText3);
        credit4 = (EditText) view.findViewById(R.id.EditText4);
        credit5 = (EditText) view.findViewById(R.id.EditText5);




        spinner = (Spinner) view.findViewById(R.id.spinner);
        spinner2 = (Spinner) view.findViewById(R.id.spinner2);
        spinner3 = (Spinner) view.findViewById(R.id.spinner3);
        spinner4 = (Spinner) view.findViewById(R.id.spinner4);
        spinner5 = (Spinner) view.findViewById(R.id.spinner5);


        buttoncal = (Button) view.findViewById(R.id.button);
        buttoncls = (Button) view.findViewById(R.id.button3);
        Grade = getResources().getStringArray(R.array.Grade);

        relativeLayout = (RelativeLayout) view.findViewById(R.id.relative);
        linearLayout = (LinearLayout) view.findViewById(R.id.linear);


        final EditText textView = new EditText(this.getContext());
        textView.setHint("Credit");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_dropdown_item_1line, Grade);
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
                    point = 5;
                }
                else if (position == 6 | position == 7 | position==8) {
                    point = 0;
                }
                temp=point;

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
                    point = 5;
                }
                 else if (position == 6 | position == 7 | position==8) {
                    point = 0;
                }
                temp2=point;

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
                }  else if (position == 5) {
                    point = 5;
                }
                else if (position == 6 | position == 7 | position==8) {
                    point = 0;
                }
                temp3=point;

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
                }  else if (position == 5) {
                    point = 5;
                }
                else if (position == 6 | position == 7 | position==8) {
                    point = 0;
                }
                temp4=point;

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
                    Toast.makeText(getContext(), "point is :" + point,
                            Toast.LENGTH_SHORT).show();

                } else if (position == 2) {
                    point = 9;

                } else if (position == 3) {
                    point = 8;
                } else if (position == 4) {
                    point = 7;
                }  else if (position == 5) {
                    point = 5;
                }
                else if (position == 6 | position == 7 | position==8) {
                    point = 0;
                }
                temp5=point;

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.addView(createNewTextView(textView.getText().toString()));
               // ((LinearLayout)textView.getParent()).addView(textView);

               // linearLayout.addView(textView);

            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // ((LinearLayout) textView.getParent()).removeView(textView);
                linearLayout.removeView(textView);

            }
        });


        buttoncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                float sum = mvalue1 + mvalue2 + mvalue3 + mvalue4 + mvalue5;


                mvalue11 = Float.parseFloat(credit1.getText() + "");
                mvalue21 = Float.parseFloat(credit2.getText() + "");
                mvalue31 = Float.parseFloat(credit3.getText() + "");
                mvalue41 = Float.parseFloat(credit4.getText() + "");
                mvalue51 = Float.parseFloat(credit5.getText() + "");
                float total = ((mvalue11 * temp) + (mvalue21 * temp2) + (mvalue31 * temp3) + (mvalue41 * temp4) + (mvalue51 * temp5));
                gpa1 = ((total) / (mvalue11 + mvalue21 + mvalue31 + mvalue41 + mvalue51));

                Toast.makeText(getActivity(), "GPA " + gpa1, Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity(),"point of 5"+ temp,Toast.LENGTH_LONG).show();
            }
        });



        buttoncls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ArrayAdapter<String> dataAdapter;
                dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, Grade);
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                //

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


    private EditText createNewTextView(String text) {
        //final LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        final EditText textView = new EditText(this.getContext());
        //textView.setLayoutParams(layoutParams);
        textView.setHint("Credit" + text);
        return textView;

    }


}