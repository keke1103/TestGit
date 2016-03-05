package com.keke.testgit;

import com.keke.testgit.R.id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TestGetActivity extends Activity {
	Button setMain;
	Button setKeke;
	Button setYuan;
	Button setSet;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_get);
		setMain = (Button) findViewById(R.id.button_test_get_main);
		setKeke = (Button) findViewById(R.id.button_test_get_keke);
		setYuan = (Button) findViewById(R.id.button_test_get_yuan);
		setSet = (Button) findViewById(R.id.button_test_get_set);

		setMain.setOnClickListener(clickListener);
		setKeke.setOnClickListener(clickListener);
		setYuan.setOnClickListener(clickListener);
		setSet.setOnClickListener(clickListener);
	}

	OnClickListener clickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.button_test_get_main:
				Intent intent = new Intent(TestGetActivity.this, MainActivity.class);
				startActivity(intent);
				break;

			case R.id.button_test_get_keke:
				Intent intent1 = new Intent(TestGetActivity.this, KekeActivity.class);
				startActivity(intent1);
				break;
			case R.id.button_test_get_yuan:
				Intent intent2 = new Intent(TestGetActivity.this, YuanActivity.class);
				startActivity(intent2);
				break;
			case R.id.button_test_get_set:
				Intent intent3 = new Intent(TestGetActivity.this, SetActivity.class);
				startActivity(intent3);
				break;
			default:
				break;
			}
		}
	};
}
