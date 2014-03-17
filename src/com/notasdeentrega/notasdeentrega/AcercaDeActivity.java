package com.notasdeentrega.notasdeentrega;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AcercaDeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acercade);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.acerca_de, menu);
		return true;
	}

}
