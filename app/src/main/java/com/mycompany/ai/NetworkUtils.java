package com.mycompany.ai;

import java.io.*;

public class NetworkUtils {
	public static String curl(String[] params, String url) {
		try {
			String args = String.join(" ", params);
			String fullcommand = "";
			fullcommand = "curl " + args + " " + url + "";
			Runtime r = Runtime.getRuntime();
			Process p = r.exec(fullcommand);
			System.out.println("Run: " + fullcommand);
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String response = null;
			String output = "";
			for (int x = 0; (response = stdInput.readLine()) != null; x++) {
				output += response + "\n";
			}
			while (p.isAlive()) {
				// NOTHING!
			}
			if (!p.isAlive()) {
				return String.join("\n", output);
			} else {
				return "this will never appear";
			}
		} catch (IOException e) {
			e.printStackTrace();
			return "Error: " + e.getMessage();
		}
	}

	public static String wget(String[] params, String url) {
		try {
			String args = String.join(" ", params);
			String fullcommand = "";
			fullcommand = "wget " + args + " \"" + url + "\"";
			Runtime r = Runtime.getRuntime();
			Process p = r.exec(fullcommand);
			System.out.println("Run: " + fullcommand);
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String response = null;
			String output = "";
			for (int x = 0; (response = stdInput.readLine()) != null; x++) {
				output += response + "\n";
			}
			while (p.isAlive()) {
				// NOTHING!
			}
			if (!p.isAlive()) {
				return String.join("\n", output);
			} else {
				return "this will never appear";
			}
		} catch (IOException e) {
			e.printStackTrace();
			return "Error: " + e.getMessage();
		}
	}
}
