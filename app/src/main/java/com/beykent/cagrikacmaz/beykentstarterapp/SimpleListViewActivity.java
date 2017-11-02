package com.beykent.cagrikacmaz.beykentstarterapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_list_view);
		String[] myStringArray = { "Beşiktaş", "Fenerbahçe", "Galatasaray" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		  R.layout.simple_list_view_item, myStringArray);

		ListView listView = (ListView) findViewById(R.id.lvDemo);
		listView.setAdapter(adapter);
	}


}
