package com.keke.testgit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class YuanActivity extends Activity {
	Button butMain;
	Button butSet;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_yuan);
		butMain = (Button) findViewById(R.id.button_yuan_main);
		butSet = (Button) findViewById(R.id.button_yuan_set);

		butMain.setOnClickListener(onClickListener);
		butSet.setOnClickListener(onClickListener);
	}

	OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.button_yuan_main:
				Intent intent = new Intent(YuanActivity.this, MainActivity.class);
				startActivity(intent);
				break;

			case R.id.button_yuan_set:
				Intent intent1 = new Intent(YuanActivity.this, SetActivity.class);
				startActivity(intent1);
				break;
			default:
				break;
			}
		}
	};
}
