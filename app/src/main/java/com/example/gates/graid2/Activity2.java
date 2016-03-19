
package com.example.gates.graid2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;


public class Activity2 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.s);
	}

	public void openRegister(View view){
		  Intent intent = new Intent(Activity2.this, Register.class);
		  startActivity(intent);
	}
	public void openLogin(View view){
		  Intent intent = new Intent(Activity2.this, Login.class);
		  startActivity(intent);
	}
}
