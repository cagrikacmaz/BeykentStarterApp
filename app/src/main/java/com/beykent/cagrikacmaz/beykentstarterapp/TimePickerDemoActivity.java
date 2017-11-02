package com.beykent.cagrikacmaz.beykentstarterapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerDemoActivity extends Activity {
	
	TimePicker tpTime;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_time_picker_demo);
		tpTime = (TimePicker) findViewById(R.id.tpTime);
	}


	
	public void displayTime(View v) {
		String time = tpTime.getCurrentHour() + ":" + tpTime.getCurrentMinute();
		Toast.makeText(this, time, Toast.LENGTH_SHORT).show();
	}

}
