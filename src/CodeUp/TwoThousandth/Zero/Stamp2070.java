package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stamp2070 {
	static void initStamp(char[][] stamp, char effect) {
		for (int i = 0; i < stamp.length; i++) {
			for (int j = 0; j < stamp[i].length; j++) {
				if (i == 0 || i == stamp.length-1) {
					if (j == 0 || j == stamp[i].length - 1) {
						stamp[i][j] = '+';
					}
					else {
						switch(effect) {
						case 'X':
							stamp[i][j] = '-';
							break;
						case 'T':
							stamp[i][j] = '*';
							break;
						case 'D':
							stamp[i][j] = '%';
							break;
						case 'G':
							stamp[i][j] = '#';
							break;
						}
					}
				}
				else {
					if (j == 0 || j == stamp[i].length - 1) {
						switch(effect) {
						case 'X':
							stamp[i][j] = '|';
							break;
						case 'T':
							stamp[i][j] = '*';
							break;
						case 'D':
							stamp[i][j] = '%';
							break;
						case 'G':
							stamp[i][j] = '#';
							break;
						}
					}
					else {
						stamp[i][j] = '.';
					}
				}
			}
		}
	}
	
	static void makeStamp(char[][] stamp, int m, int n, int k) {
		int r = 0, startIndex = 0, index = 0;
		String s = "";
		
		for (int i = 0; i < 4; i++) {
			switch(i) {
			case 0:
				s = "CodeUp";
				r = (m + 1) / 2 - 1;
				break;
			case 1:
				s = "1,000,000";
				r = (m + 1) / 2;
				break;
			case 2:
				s = "Congratulations!";
				r = (m + 1) / 2 + 1;
				break;
			case 3:
				s = k + "";
				r = m;
				break;
			}
			startIndex = i == 3 ? n - s.length() : ((n - s.length()) / 2) + 1;
			if (n % 2 != 0 && i % 2 == 0) startIndex+= 1;
			for (int j = startIndex; j < startIndex + s.length(); j++) {
				stamp[r][j] = s.charAt(j - startIndex);
			}
		}
	}
	
	static int getPrice(int n, int m, int k, char bc, int a, char e) {
		double price = 0;
		int area = n * m;
		
		if (area <= 50) price = 300;
		else if (area <= 100) price = 500;
		else if (area <= 300) price = 700;
		else if (area > 300) price = 1000;
		
		if (k <= 100) price = price + (price * 0.05);
		else if (k <= 200) price = price + (price * 0.1);
		else if (k <= 300) price = price + (price * 0.2);
		else if (k > 300) price = price + (price * 0.3);
		
		if (bc == 'C') price = price + (price * 0.1);
		
		if (a <= 100) price = price - (price * 0.05);
		else if(a <= 200) price = price - (price * 0.1);
		else if (a <= 500) price = price - (price * 0.2);
		else if (a > 500) price = price - (price * 0.3);
		
		if (e == 'T') price = price + (price * 0.1);
		else if (e == 'D') price = price + (price * 0.3);
		else if (e == 'G') price = price + (price * 0.5);
		
		return (int) price - ((int) price % 10);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int k = Integer.parseInt(tmp.split(" ")[2]);
		char bc = tmp.split(" ")[3].charAt(0);
		int a = Integer.parseInt(tmp.split(" ")[4]);
		char effect = tmp.split(" ")[5].charAt(0);
		char[][] stamp = new char[m + 2][n + 2];
		initStamp(stamp, effect);
		makeStamp(stamp, m, n, k);
		
		for (int i = 0; i < stamp.length; i++) {
			for (int j = 0; j < stamp[i].length; j++) {
				System.out.print(stamp[i][j]);
			}
			System.out.println();
		}
		System.out.println(getPrice(n, m, k, bc, a, effect) * a);
	}
}
