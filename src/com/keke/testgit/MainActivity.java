package com.keke.testgit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends FragmentActivity {

	View b1;
	View b2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1 = findViewById(R.id.but1);
		b2 = findViewById(R.id.but2);
		b1.setOnClickListener(l);
		b2.setOnClickListener(l);
	}

	private OnClickListener l = new OnClickListener() {

		@Override
		public void onClick(View v) {
			Intent intent;
			switch (v.getId()) {
			case R.id.but2:
				intent = new Intent(getApplicationContext(), KekeActivity.class);
				startActivity(intent);
				break;

			default:
				break;
			}

		}
	};
}
