package com.mycompany.ai;

import java.util.*;

public class Global {
	public static int MESSAGE_ID = 0;

	/**
	 * @TODO: Place here the AI, responses and
	 *     messages (Globally), but remember that I
	 *     I will update the code on github, so tell
	 *     me the changes
	 */
	public static class message {

		/**
		 * @TODO: The first message of AI, with base
		 *     on time, if its night, he (or she)
		 *     will not say "Good Morning!"
		 */
		public static final String[] APP_INIT = {
			"Hello, " + randomize(Global.data.USER_NICKNAME, Global.data.USER_NAME) + "!",
			"Hello!\nHow I can help you?",
			"Good Morning!",
			"Good Afternoon!",
			"Good Night!",
			"Hello",
		};

		/**
		 * @TODO: AI will detect the user emote,
		 *     if the user are sad, the AI will not
		 *     tell pranks.
		 */
		public static final String[] USER_EMOTE = {
			"Angry",
			"Sad",
			"Normal",
			"Happy",
		};

		/**
		 * @TODO: AI will detect if the user has 18+,
		 *     if the user are sad, the AI will not
		 *     tell pranks.
		 */
		public static final String[] OFENSIVE = {
			"Fuck",
			"Asshole",
			"Dick",
			"Tits",
			"Cock",
		};

		/**
		 * @TODO: Randomizes a String.
		 * @USAGE: Try:
		 *     Log.i("Global", Global.message.randomize(Global.data.USER_EMOTE));
		 */
		public static final String randomize(String[] msg) {
			Random random = new Random();
			int i = random.nextInt(msg.length);
			return msg[i];
		}

		/**
		 * @TODO: Randomizes a String,
		 * @USAGE: Try:
		 *     Log.i("Global", Global.message.specialRandomize(Global.data.USER_NICKNAME,
		 *           "You dont have username,\n so i will call you John!"));
		 */
		public static final String randomize(String[] msg, String nullmsg) {
			if (msg.length <= (0)) {
				return nullmsg;
			} else {
				return randomize(msg);
			}
		}

		/**
		 * @TODO: Randomizes a String, 
		 * @USAGE: Try:
		 *     Log.i("Global", Global.message.randomize(Global.data.USER_NAME,
		 *           {
		 *				 "Can you tell me your nickname?",
		 * 				 "My name is Core Last Artificial Inteligence for Tratament of Overdose by Nicholas\n" + 
		 * 				 	 "But you can call me CLAITON, whats your nickname?",
		 *				 "Please, tell me your nickname!"
		 * 			 }));
		 */
		public static final String randomize(String[] msg, String[] nullmsg) {
			if (msg.length <= (0)) {
				return randomize(nullmsg);
			} else {
				return randomize(msg);
			}
		}

		/**
		 * @TODO: Randomizes a String, 
		 * @USAGE: Try:
		 *     Log.i("Global", Global.message.randomize(Global.data.USER_NAME,
		 *           {
		 *				 "Can you tell me your name?",
		 * 				 "My name is Core Last Artificial Inteligence for Tratament of Overdose by Nicholas\n" + 
		 * 				 	 "Whats your name?",
		 *				 "Please, tell me your nickname!"
		 * 			 }));
		 */
		public static final String randomize(String msg, String[] nullmsg) {
			if (msg == "" || msg == null) {
				return randomize(nullmsg);
			} else {
				return msg;
			}
		}

		/**
		 * @TODO: Randomizes a String, 
		 * @USAGE: Try:
		 *     Log.i("Global", Global.message.randomize(Global.data.USER_NAME, "You dont have a name"));
		 */
		public static final String randomize(String msg, String nullmsg) {
			if (msg == "" || msg == null) {
				return nullmsg;
			} else {
				return msg;
			}
		}
	}

	/**
	 * @TODO: the DataBase
	 */
	public static class data {
		public static final String[] MONTHS = {
			"Null",
			"January",
			"February",
			"March",
			"April",
			"May",
			"June",
			"July",
			"August",
			"September",
			"October",
			"November",
			"December"
		};

		public static final String[] DAYS = {"nl" + "st","nd","rd","th"};

		/**
		 * @TODO: the User's nicknames
		 */
		public static String[] USER_NICKNAME = {};

		/**
		 * @TODO: the User's name
		 */
		public static String USER_NAME = null;

		/**
		 * @TODO: Birthday utility in US format (Month/Day/Year)
		 */
		public static int USER_BIRTH_DAY = 0;
		public static int USER_BIRTH_MONTH = 0;
		public static int USER_BIRTH_YEAR = 0000;
		public static String USER_BIRTH = USER_BIRTH_MONTH + "/" + USER_BIRTH_DAY;
		public static String USER_BIRTH_DATE = USER_BIRTH + "/" + USER_BIRTH_YEAR;

		/**
		 * @TODO: return extend a date in base of numbers
		 * @USAGE:
		 *     Global.data.extendDate(12,25); //without year
		 *     Global.data.extendDate(-1,-1,-1); //with year
		 *
		 */
		public static String extendDate(int m, int d) {
			String day = null;
			if (d <= 0 || d >= 32) {
				day = d + DAYS[0];
			} else if (d == (1 | 2 | 3)) {
				day = d + DAYS[d];
			} else if (d >= 4) {
				day = d + DAYS[4];
			}

			if (m <=0 || m >=13) {
				m = 0;
			}

			return MONTHS[m] + ", " + day;
		}
		public static String extendDate(int m, int d, int y) {
			String day = null;
			String year = null;

			if (d <= 0 || d >= 32) {
				day = d + DAYS[0];
			} else if (d == (1 | 2 | 3)) {
				day = d + DAYS[d];
			} else if (d >= 4) {
				day = d + DAYS[4];
			}

			if (m <=0 || m >=13) {
				m = 0;
			}

			if (y <= -1) {
				year = Math.abs(y) + "B.C";
			}
			return MONTHS[m] + ", " + day + " of " + year;
		}
	}
}
