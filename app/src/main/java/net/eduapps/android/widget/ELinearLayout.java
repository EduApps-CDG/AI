package net.eduapps.android.widget;
import android.widget.*;
import android.content.*;
import android.util.*;
import android.view.*;

public class ELinearLayout extends LinearLayout {
	private void init() {
		setOnHoverListener(new OnHoverListener() {
			@Override public boolean onHover(View p1, MotionEvent p2) {
				boolean bool = false;
				if (p2.getAction() == p2.ACTION_HOVER_ENTER) {
					setBackgroundColor(0xFFCC0000);
					bool = true;
				} else if (p2.getAction() == p2.ACTION_HOVER_EXIT) {
					setBackgroundColor(0xFFFFFFFF);
					bool = false;
				}
				
				return bool;
			}
		});
		
		setOnTouchListener(new View.OnTouchListener() {
			@Override public boolean onTouch(View p1, MotionEvent p2) {
				boolean bool = false;
				if (p2.getAction() == p2.ACTION_DOWN) {
					setBackgroundColor(0xFFCC0000);
					bool = true;
				} else if (p2.getAction() == p2.ACTION_UP) {
					setBackgroundColor(0xFFFFFFFF);
					bool = false;
				}
				return bool;
			}
		});
	}
	
	public ELinearLayout(Context context) {
		super(context);
		init();
	}
	
	public ELinearLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public ELinearLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}
}
