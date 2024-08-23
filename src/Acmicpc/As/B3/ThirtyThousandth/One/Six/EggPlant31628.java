package Acmicpc.As.B3.ThirtyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EggPlant31628 {
	static final int l = 10;
	static String[][] arr = new String[l][l];
	static boolean check() {
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			flag = true;
			for (int j = 1; j < arr[i].length; j++) {
				if (!arr[i][j].equals(arr[i][j-1])) flag = false;
			}
			if (flag) return true;
			
			flag = true;
			for (int j = 1; j < arr[i].length; j++) {
				if (!arr[j][i].equals(arr[j-1][i])) flag = false;
			}
			if (flag) return true;
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = str.split(" ")[j];
			}
		}
		
		System.out.println(check() ? "1" : "0");
		br.close();
	}
}
