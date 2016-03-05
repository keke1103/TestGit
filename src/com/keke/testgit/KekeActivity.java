package com.keke.testgit;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AnalogClock;
import android.widget.Chronometer;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class KekeActivity extends Activity {
	Chronometer mTime;
	AnalogClock mClock;
	TextView textView1;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_keke);
		mTime = (Chronometer) findViewById(R.id.time);
		mClock = (AnalogClock) findViewById(R.id.analogClock1);
		mClock.animate().start();

		mClock.setOnClickListener(l);
		textView1=(TextView) findViewById(R.id.textView1);
		textView1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 
				Intent intent = getIntent();
				intent.setClass(KekeActivity.this, Keke2Activity.class);
				startActivity(intent);
			}
		});
	}

	OnClickListener l = new OnClickListener() {

		@Override
		public void onClick(View v) {
			Intent intent = getIntent();
			intent.setClass(KekeActivity.this, SetActivity.class);
			startActivity(intent);

		}
	};
}
