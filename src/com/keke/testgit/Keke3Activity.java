package com.keke.testgit;

import com.keke.testgit.view.Ball;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class Keke3Activity extends Activity {

	RelativeLayout mLayout;
	TextView text;
	Button btn;
	Ball ball;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		mLayout = new RelativeLayout(this);
		LayoutParams mparams = new LayoutParams(-1, -1);

		setContentView(mLayout, mparams);
		text = new TextView(getApplicationContext());
		text.setId(101);
		text.setText("这是王科开发的页面3");
		btn = new Button(getApplicationContext());
		btn.setText("点我我不会变化");
		btn.setId(102);
		btn.setOnClickListener(l);
		btn.setOnLongClickListener(new OnLongClickListener() {

			@Override
			public boolean onLongClick(View v) {

				Intent intent = getIntent();
				intent.setClass(getApplicationContext(), MainActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
				startActivity(intent);
				finish();

				return false;
			}
		});
		mparams = new LayoutParams(-2, -2);
		mparams.addRule(RelativeLayout.CENTER_HORIZONTAL);
		mLayout.addView(btn, mparams);
		LayoutParams params = new LayoutParams(-2, -2);
		params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		params.addRule(RelativeLayout.CENTER_HORIZONTAL);
		params.setMargins(100, 100, 100, 100);
		mLayout.addView(text, params);
		ball = new Ball(this);
		ball.setSpeedByAngle(60, 200);
		params = new LayoutParams(80, 80);

		mLayout.addView(ball, params);
	}

	private OnClickListener l = new OnClickListener() {

		@Override
		public void onClick(View v) {
			if (ball.isMoving()) {
				ball.stop();
			} else
				ball.start();

		}
	};
}
