package com.beykent.cagrikacmaz.beykentstarterapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BasicClickHandlersActivity extends Activity {
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic_click_handlers);
		Button secondButton = (Button) findViewById(R.id.btnClick2);
		secondButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				secondButtonClicked(v);
			}
		});
	}


	
	public void firstButtonClicked(View v) {
		SimpleAlertDialog.displayWithOK(this, "Bu Buton Xml Handler ile oluşturulmuştur.");
	}
	
	private void secondButtonClicked(View v) {
		SimpleAlertDialog.displayWithOK(this, "Bu Buton Java Handler Create ile oluşturulmuştur. ");
	}

}
