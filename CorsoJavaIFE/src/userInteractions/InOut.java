package userInteractions;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class InOut {
	
	public void print(String s){
		System.out.println(s);
	}

	public int catchInt () {		
		
		int k=0;
		
		InputStreamReader reader = new InputStreamReader (System.in);
		BufferedReader myInput = new BufferedReader (reader);
		
		try {
			String str = myInput.readLine();
			k = Integer.parseInt (str);
		} catch (IOException s) {
			System.out.println("Si è verificato un errore: "+s);
			System.exit(-1);
		}
		
		return k;

	}
	public double catchDoub () {		
		
		double k=0;
		
		InputStreamReader reader = new InputStreamReader (System.in);
		BufferedReader myInput = new BufferedReader (reader);
		
		try {
			String str = myInput.readLine();
			k = Double.parseDouble (str);
		} catch (IOException s) {
			System.out.println("Si è verificato un errore: "+s);
			System.exit(-1);
		}
		
		return k;

	}
	
	public String catchString () {
		
		String str = new String();
		
		InputStreamReader reader = new InputStreamReader (System.in);
		BufferedReader myInput = new BufferedReader (reader);
		
		try { str = myInput.readLine();
		} catch (IOException s) {
			System.out.println("Si è verificato un errore: "+s);
			System.exit(-1);
		}
		return str;
	}
	
	public String[] catchWords (String regexp) {
		
		String str = new String();
		
		InputStreamReader reader = new InputStreamReader (System.in);
		BufferedReader myInput = new BufferedReader (reader);
		
		try { str = myInput.readLine();
		} catch (IOException s) {
			System.out.println("Si è verificato un errore: "+s);
			System.exit(-1);
		}
		String[] wrd = str.split(regexp);
		for (int i = 0; i < wrd.length; i++) {
		    wrd[i] = wrd[i].replaceAll("[^\\w]", ""); // tolgo virgole e altri caratteri
		}
		
		return wrd;
	}
	
}
