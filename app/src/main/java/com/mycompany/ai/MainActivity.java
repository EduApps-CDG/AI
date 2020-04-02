package com.mycompany.ai;

import android.app.*;
import android.os.*;
import android.widget.*;
import net.eduapps.android.widget.*;

public class MainActivity extends Activity {
	EListView messages;
	
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		messages = findViewById(R.id.CHAT_MESSAGES);
		AI ai = new AI(this,messages);
    }
}
