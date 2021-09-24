package SWExpertAcademy.D3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome1215 {
	static char[][] arr = new char[8][8];
	static int count = 0;
	static boolean check(String str) {
		for (int i = 0, j = str.length()-1; i <= j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) return false;
		}
		return true;
	}
	static void func(int N) {
		String str = null;
		// horizon check
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= arr.length-N; j++) {
				str = "";
				for (int k = j; k < j+N; k++) {
					str += arr[i][k];
				}
				if (check(str)) count++;
			}
		}
		// vertical
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= arr.length-N; j++) {
				str = "";
				for (int k = j; k < j+N; k++) {
					str += arr[k][i];
				}
				if (check(str)) count++;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = 0;
		
		for (int i = 1; i <= 10; i++) {
			N = Integer.parseInt(br.readLine());
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				tmp = br.readLine();
				for (int k = 0; k < arr[j].length; k++) {
					arr[j][k] = tmp.charAt(k);
				}
			}
			func(N);
			sb.append("#" + i + " " + count + "\n");
		}
		System.out.print(sb.toString());
	}
}
