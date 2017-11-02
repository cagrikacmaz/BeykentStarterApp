package com.beykent.cagrikacmaz.beykentstarterapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ToastFormInputsActivity extends Activity {
	
	EditText etVal;
	CheckBox chkVal;
	RadioGroup rdgVal;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_toast_form_inputs);
		etVal = (EditText) findViewById(R.id.etVal);
		chkVal = (CheckBox) findViewById(R.id.chkVal);
		rdgVal = (RadioGroup) findViewById(R.id.rdgVal);
	}


	
	public void toastInputs(View v) {
		int selected = rdgVal.getCheckedRadioButtonId();
		RadioButton b = (RadioButton) findViewById(selected);
		
		String text = etVal.getText() + " | " + chkVal.isChecked() + " | " + b.getText();
		Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
	}

}
