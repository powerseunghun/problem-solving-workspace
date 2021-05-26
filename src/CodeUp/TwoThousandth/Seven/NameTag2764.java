package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameTag2764 {
	static void drawLine(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (i == 0) System.out.print("+");
			System.out.print("-+");
		}
		System.out.println();
	}
	static void drawName(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (i == 0) System.out.print("|");
			System.out.print(name.charAt(i) + "|");
		}
		System.out.println();
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		
		drawLine(name);
		drawName(name);
		drawLine(name);
		
	}
}
