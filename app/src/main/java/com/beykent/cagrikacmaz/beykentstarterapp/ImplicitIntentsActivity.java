package com.beykent.cagrikacmaz.beykentstarterapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ImplicitIntentsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_implicit_intents);
	}


	
	public void visitUrlAddress(View v) {
		Uri url = getUriToVisit();
		if (url != null) {
			Intent i = new Intent(Intent.ACTION_VIEW);
			i.setData(url);
			startActivity(i); 
		}
			
	}
	
	public Uri getUriToVisit() {
		String urlAddress =  ((TextView) findViewById(R.id.txtUrlAddress)).getText().toString();
		if (urlAddress != null) {
		  if (!urlAddress.startsWith("http://"))
		     urlAddress = "http://" + urlAddress;
		  return Uri.parse(urlAddress);
		} else {
		  return null;
		}
	}

}
