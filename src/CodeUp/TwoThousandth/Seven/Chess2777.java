package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chess2777 {
	static String[][] arr = new String[10][10];
	static void init() {
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], " ");
		}
		
		for (int i = 1; i < arr.length-1; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (i % 2 != 0) {
					if (j % 2 != 0) arr[i][j] = "00";
					else arr[i][j] = "**";
				}
				else {
					if (j % 2 != 0) arr[i][j] = "**";
					else arr[i][j] = "00";
				}
			}
		}
	}
	static void print() {
		for (int i = 1; i < arr.length-1; i++) {
			for (int j = 1; j < arr[i].length-1; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int p = 0, a = 0, b = 0;
		init();
		
		while(true) {
			tmp = br.readLine();
			p = Integer.parseInt(tmp.split(" ")[0]);
			if (p == 14) {
				print();
				break;
			}
			a = Integer.parseInt(tmp.split(" ")[1]);
			b = Integer.parseInt(tmp.split(" ")[2]);
			
			String t = p+"";
			if (t.length() == 1) t = "0" + t;
			arr[b][a] = t;
		}
	}
}
