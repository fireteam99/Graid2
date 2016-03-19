package com.example.gates.graid2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Register extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(android.R.layout.simple_selectable_list_item);
		spinner();
		next();
	}
	public void next(){
		final EditText editText5 = (EditText) findViewById(R.id.edit);
		editText5.setOnKeyListener(new TextView.OnKeyListener() {
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

	public void spinner(){
		Spinner s = (Spinner) findViewById(R.id.text1);
		List<String> l = new ArrayList<String>();
		l.add("Teacher");
		l.add("Learning Center");
		l.add("Self Administration");
		ArrayAdapter<String> ad = new ArrayAdapter<String>(this,R.layout.simple_spinner_dropdown_item,l);
		ad.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
	}

	public void openActivity3(){
		  Intent intent = new Intent(Register.this, Activity3.class);
		  startActivity(intent);
	}

}
