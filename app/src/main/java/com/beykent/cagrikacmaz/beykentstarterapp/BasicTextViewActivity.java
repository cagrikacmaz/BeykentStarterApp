package com.beykent.cagrikacmaz.beykentstarterapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class BasicTextViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic_text_view);
		Log.d("DEBUG", "onCreate çağırıldı!");
	}
	
	protected void onResume() {
		super.onResume();
		Log.d("DEBUG", "onResume çağırıldı!!");
	}
	
	protected void onPause() {
		super.onPause();
		Log.d("DEBUG", "onPause çağırıldı!");
	}



}
