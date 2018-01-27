package com.example.dev.parkingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    TextView fee ;
    Button calculate;
    RadioGroup vehicleType;
    EditText hours;
    RadioButton nissan,car,bus,lorry, motorcycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        vehicleType = (RadioGroup)findViewById(R.id.vehicle_type);
        lorry = (RadioButton) findViewById(R.id.lorry);
        car = (RadioButton) findViewById(R.id.car);
        nissan = (RadioButton) findViewById(R.id.nissan);
        bus = (RadioButton) findViewById(R.id.bus);
        motorcycle = (RadioButton) findViewById(R.id.motorcycle);
        calculate = (Button) findViewById(R.id.calculate);
        fee = (TextView) findViewById(R.id.fee);
        hours = (EditText) findViewById(R.id.hours);


        vehicleType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.lorry) {
                    Toast.makeText(HomeActivity.this,"Lorry selected",Toast.LENGTH_SHORT).show();

                } else if(checkedId == R.id.car) {
                    Toast.makeText(HomeActivity.this,"Car selected",Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.bus) {
                    Toast.makeText(HomeActivity.this,"Bus selected",Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.nissan) {
                    Toast.makeText(HomeActivity.this,"Nissan selected",Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.motorcycle) {
                    Toast.makeText(HomeActivity.this,"Motorcycle selected",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(HomeActivity.this,"Nothing selected",Toast.LENGTH_SHORT).show();
                }

            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!hours.getText().toString().isEmpty()) {

                    int selectedId = vehicleType.getCheckedRadioButtonId();
                    int parkingHours = Integer.parseInt(hours.getText().toString().trim());
                    if(selectedId == lorry.getId()) {

                    }
                } else {
                    Toast.makeText(HomeActivity.this,"Enter Hours",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }




}


