package com.keke.testgit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SetActivity extends Activity {
	Button setMain;
	Button setKeke;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_set);
		setMain = (Button) findViewById(R.id.button_set_main_activity);
		setKeke = (Button) findViewById(R.id.button_set_keke);
		setKeke.setOnClickListener(onClickListener);
		setMain.setOnClickListener(onClickListener);
	}

	OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.button_set_main_activity:
				Intent intent = new Intent(SetActivity.this, MainActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
				startActivity(intent);
				finish();
				break;
			case R.id.button_set_keke:
				Intent intent2 = new Intent(SetActivity.this, KekeActivity.class);
				startActivity(intent2);
				break;
			default:
				break;
			}

		}
	};
}
