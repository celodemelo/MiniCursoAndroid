package com.example.cursinho;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {

	private String[] nomes = {
			"Marcelo",
			"Joao",
			"Pedro",
			"Maria",
			"Joaquim",
			"Jose",
			"Mateus",
			"Aline",
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button botaoSobre = (Button) findViewById(R.id.botaoSobre);
		botaoSobre.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(MainActivity.this, SobreActivity.class);
				startActivity(intent);
				//Toast.makeText(MainActivity.this, "Clicou no Botao", Toast.LENGTH_LONG).show();
				
			}
		});
		
		ListView lista = (ListView) findViewById(R.id.lista);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1, 
				nomes);

		lista.setAdapter(adapter);
		lista.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
				Intent intent = new Intent(MainActivity.this, DetalhesActivity.class);
				intent.putExtra("nome", nomes[arg2]);
				startActivity(intent);
				//Toast.makeText(MainActivity.this, nomes[arg2], Toast.LENGTH_SHORT).show();
			}
		});
	}
	
}
