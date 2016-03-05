package com.keke.testgit;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Keke2Activity extends Activity {

	LinearLayout mLayout;
	TextView text;
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		mLayout = new LinearLayout(this);
		mLayout.setOrientation(LinearLayout.VERTICAL);
		mLayout.setGravity(Gravity.CENTER_HORIZONTAL);
		setContentView(mLayout);
		text = new TextView(getApplicationContext());
		text.setTextSize(22);
		text.setEllipsize(TruncateAt.MARQUEE);
		text.setSingleLine(true);

		text.setTextColor(Color.BLUE);
		text.setFocusable(true);
		text.setFocusableInTouchMode(true);
		text.setText("这是王科开发的页面(2)  这是王科开发的页面(2) 这是王科开发的页面(2) 这是王科开发的页面(2) ");
		btn = new Button(getApplicationContext());
		btn.setText("点我会动");
		mLayout.addView(text, -1, -2);
		mLayout.addView(btn, -2, -2);

		btn.setOnClickListener(l);

	}

	OnClickListener l = new OnClickListener() {

		@Override
		public void onClick(View v) {
			btn.setX(btn.getX() + 20);
			btn.setY(btn.getY() + 20);

			if (btn.getX() + 30 > getResources().getDisplayMetrics().widthPixels
					|| btn.getY() + 30 > getResources().getDisplayMetrics().heightPixels) {

				Intent intent = getIntent();
				intent.setClass(getApplicationContext(), Keke3Activity.class);
				startActivity(intent);
				finish();
			}
		}
	};

}
