package com.example.gates.graid2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;


public class Login extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_layout);
		final EditText editText2 = (EditText) findViewById(R.id.editText2);
		editText2.setOnKeyListener(new TextView.OnKeyListener() {
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
						(keyCode == KeyEvent.KEYCODE_ENTER)) {
					openActivity3();
					return true;
				}
				return false;
			}
		});

	}

	public void openActivity3(){
		  Intent intent = new Intent(Login.this, Activity3.class);
		  startActivity(intent);
	}
}
