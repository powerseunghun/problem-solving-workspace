package Acmicpc.As.B3.TwentyThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SpecialEvent28288 {
	static final int c = 5;
	static char[][] arr = null;
	static List<String> list = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE;
		String str = null;
		arr = new char[N][c];
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		// 00,10,20,30,40
		for (int i = 0, v = 0; i < arr[0].length; i++, v=0) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i] == 'Y') 
					v++;
			}
			max = Math.max(max, v);
		}
		for (int i = 0, v = 0; i < arr[0].length; i++, v=0) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i] == 'Y') {
					v++;
				}
			}
			if (v == max) {
				list.add(String.valueOf(i+1));
			}
		}
		
		System.out.println(String.join(",", list));
		br.close();
	}
}
