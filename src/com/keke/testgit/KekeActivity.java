package com.keke.testgit;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AnalogClock;
import android.widget.Chronometer;

@SuppressWarnings("deprecation")
public class KekeActivity extends Activity {
	Chronometer mTime;
	AnalogClock mClock;

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
