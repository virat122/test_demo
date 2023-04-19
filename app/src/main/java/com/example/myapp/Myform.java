package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class Myform extends AppCompatActivity {

    EditText et_name,et_pass,et_phone;
    RadioButton rb_male,rb_female,rb_trans;
    CheckBox cb_java,cb_python,cb_dart;
    Spinner sp_cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myform);
        et_name=(EditText) findViewById(R.id.et_name);
        et_pass=(EditText) findViewById(R.id.et_pass);
        et_phone=(EditText) findViewById(R.id.et_phone);
        rb_male=(RadioButton ) findViewById(R.id.rb_male);
        rb_female=(RadioButton ) findViewById(R.id.rb_female);
        rb_trans=(RadioButton ) findViewById(R.id.rb_Trans);

        cb_dart=(CheckBox) findViewById(R.id.cb_Dart);
        cb_python=(CheckBox) findViewById(R.id.cb_python);
        cb_java=(CheckBox) findViewById(R.id.cb_java);
        sp_cities=(Spinner)findViewById(R.id.sp_cities);

    }
    public void getAllValues(View view){
        String name= et_name.getText().toString();
        String pass= et_pass.getText().toString();
        String phone= et_phone.getText().toString();

        String gender="";
        if(rb_male.isChecked()){
            gender=rb_male.getText().toString();
        } else if (rb_female.isChecked()) {
            gender=rb_female.getText().toString();
          // can have opt  gender="F"

        }else{
            gender=rb_trans.getText().toString();
        }


        String interest="";
        if(cb_java.isChecked()){
            gender+=cb_java.getText().toString();
        }
        if (cb_python.isChecked()) {
            gender+=cb_python.getText().toString();
            // can have opt  gender="F"

        }
        if(cb_dart.isChecked()) {
            gender+=cb_dart.getText().toString();
        }

        String city;
        city=(String)sp_cities.getSelectedItem().toString();
        String result=name+"\n"+pass+"\n"+phone+"\n"+gender+"\n"+interest+"\n"+city;


        Toast.makeText(this ,result,Toast.LENGTH_LONG).show();



    }
}