package com.example.mukhlish.calender;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CalendarView calenderView;
    TextView myDate;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calenderView = (CalendarView) findViewById(R.id.calenderView);
        myDate =  (TextView) findViewById(R.id.myDate);
        save = (Button) findViewById(R.id.date);

        calenderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2){
                String date = (i1 + 1) + "/" + i2 + "/"+ i;
                myDate.setText(date);
            }

        });



        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent pindah_tempat = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(pindah_tempat);
            }
        });
    }
}


