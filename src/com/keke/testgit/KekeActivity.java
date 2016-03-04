package com.keke.testgit;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.Chronometer;

@SuppressWarnings("deprecation")
public class KekeActivity extends Activity {
	Chronometer mTime;
	AnalogClock mClock;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_keke);
		mTime = (Chronometer) findViewById(R.id.time);
		mClock = (AnalogClock) findViewById(R.id.analogClock1);
	}
}
