package com.mycompany.ai;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity {
	ListView messages;
	
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		messages = findViewById(R.id.CHAT_MESSAGES);
		AI ai = new AI(this,messages);
    }
}
