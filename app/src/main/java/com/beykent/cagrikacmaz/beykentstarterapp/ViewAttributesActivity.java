package com.beykent.cagrikacmaz.beykentstarterapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class ViewAttributesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_attributes);
		TextView tvMain = (TextView) findViewById(R.id.tvMain);
		Log.d("DEBUG", tvMain.getText().toString());
		Toast.makeText(this, tvMain.getText().toString(), Toast.LENGTH_SHORT).show();
	}



}
