package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcAge1704 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		StringBuilder sb = new StringBuilder();
		char s = ' ';
		switch(n.charAt(7)) {
		case '1':
			s = 'M'; sb.append("19");
			break;
		case '2':
			s = 'F'; sb.append("19");
			break;
		case '3':
			s = 'M'; sb.append("20");
			break;
		case '4':
			s = 'F'; sb.append("20");
			break;
		}
		sb.append(n.substring(0,2));
		
		System.out.println((2012 - (Integer.parseInt(sb.toString()))+1 + " " + s));
	}
}
