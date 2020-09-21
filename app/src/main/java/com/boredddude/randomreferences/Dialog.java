package com.boredddude.randomreferences;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class Dialog extends AppCompatDialogFragment {
    private Button button2;
    public int nop;
    public int tim;

    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_dialog, new LinearLayout((getActivity())));
        builder.setView(view).setTitle("Select");
        nop = 20;
        tim = 30;



        RadioGroup rgtime = view.findViewById(R.id.rgtime);
        rgtime.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.tradioButton:
                        Toast.makeText(Dialog.this.getActivity(), "30", Toast.LENGTH_SHORT).show();
                        tim = 30;
                        break;
                    case R.id.tradioButton2:
                        Toast.makeText(Dialog.this.getActivity(), "45", Toast.LENGTH_SHORT).show();
                        tim = 45;
                        break;
                    case R.id.tradioButton3:
                        Toast.makeText(Dialog.this.getActivity(), "60", Toast.LENGTH_SHORT).show();
                        tim = 60;
                        break;
                    case R.id.tradioButton4:
                        Toast.makeText(Dialog.this.getActivity(), "90", Toast.LENGTH_SHORT).show();
                        tim = 90;
                        break;
                    case R.id.tradioButton5:
                        tim = 120;
                        Toast.makeText(Dialog.this.getActivity(), "120", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

        RadioGroup rgnopics = view.findViewById(R.id.rgnopics);
        rgnopics.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.radioButton:
                        nop = 10;
                        if(nop==10) {
                            Toast.makeText(Dialog.this.getActivity(), "10", Toast.LENGTH_SHORT).show();
                        }break;
                    case R.id.radioButton2:
                        nop = 20;
                        if(nop==20) {
                            Toast.makeText(Dialog.this.getActivity(), "20", Toast.LENGTH_SHORT).show();
                        }break;
                    case R.id.radioButton3:
                        nop = 30;
                        if(nop==30) {
                            Toast.makeText(Dialog.this.getActivity(), "30", Toast.LENGTH_SHORT).show();
                        }


                        break;

                }

            }
        });

        button2 = view.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(Dialog.this.getActivity(), Integer.toString(tim)+" "+Integer.toString(nop), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Dialog.this.getActivity(), SlideShowActivity.class);

                intent.putExtra("nop", nop);
                intent.putExtra("tim", tim);

                startActivity(intent);
                getDialog().dismiss();



            }
        });
        return builder.create();
    }


}
