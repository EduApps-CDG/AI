package com.mycompany.ai;

import android.widget.*;
import java.util.*;
import android.content.*;

public class AI {
	ListView VIEW;
	List<String> LIST;
	ArrayAdapter ADAPTER;
	
	public AI(Context ctx, ListView view) {
		VIEW = view;
		LIST = new ArrayList<String>();
		ADAPTER = new ArrayAdapter(ctx, R.layout.ai_message,R.id.AI_TEXT,LIST);
		VIEW.setAdapter(ADAPTER);
		message(Global.message.randomize(Global.message.APP_INIT));
	}
	
	public void learn() {
		
	}
	
	public String think() {
		return "...";
	}
	
	public void message(String message) {
		LIST.add(message);
		//Global.MESSAGE_ID += 1;
	}
}
