package com.example.cursinho;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhesActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detalhes);

		String nome = (String) getIntent().getExtras().get("nome");
		
		TextView texto = (TextView) findViewById(R.id.nome);
		texto.setText(nome);
	}

}
