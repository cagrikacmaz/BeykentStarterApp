package com.beykent.cagrikacmaz.beykentstarterapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewClicksActivity extends Activity {
	ArrayAdapter<String> adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view_clicks);
		String[] myCountries = { "İstanbul", "İzmir", "Düzce", "Adana" };
		adapter = new ArrayAdapter<String>(this,
		  android.R.layout.simple_list_item_1, myCountries);

		ListView listView = (ListView) findViewById(R.id.lvDemo);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				String country = adapter.getItem(position);
				SimpleAlertDialog.displayWithOK(ListViewClicksActivity.this, country);
				Toast.makeText(ListViewClicksActivity.this, country, Toast.LENGTH_SHORT).show();
			}
			
		});
	}



}
