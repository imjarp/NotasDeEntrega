package com.notasdeentrega.notasdeentrega;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
// import android.widget.Toast;

public class MainActivity extends Activity {

	private Button bAcercaDe;
	private Button bCaptura;
	private Button bSalir;
	private Button bCapturaPedido;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bCapturaPedido = (Button)findViewById(R.id.botonCapturaPedido);
		bCapturaPedido.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				capturaPedido();
			}
		});
		
		bAcercaDe = (Button) findViewById(R.id.botonAcercaDe);
		bAcercaDe.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mostrarAcercaDe();
			}
		});
		bCaptura = (Button) findViewById(R.id.botonCaptura);
		bCaptura.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mostrarCaptura();
				
			}
		});
		
		bSalir = (Button) findViewById(R.id.botonSalir);
		bSalir.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);


		return true;
	}
	
	@Override
	 public boolean onOptionsItemSelected(MenuItem item) {
	  int id = item.getItemId();
//	  Toast.makeText(this, "apachurrado btn" + id, Toast.LENGTH_SHORT).show();
	  switch(id)
	  {
	  case  R.id.itemAcercaDe : 
		  mostrarAcercaDe();  
		  return true;
	  case  R.id.itemCaptura :
		  mostrarCaptura();  
		  return true;
	  case  R.id.itemSalir :
		  finish();  
		  return true;
	  }

	  
	  return true;
	 }
	private void mostrarCaptura() 
	{
		Intent intento = new Intent(this, Captura.class);
		startActivity(intento);
		
	}

	private void mostrarAcercaDe()
	{
		Intent intento = new Intent(this, AcercaDeActivity.class);
		startActivity(intento);
	}
	
	private void capturaPedido()
	{
		Intent mIntent = new Intent(this,Captura_Pedido.class);
		startActivity(mIntent);	
	}

} 
