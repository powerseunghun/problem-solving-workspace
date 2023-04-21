package Acmicpc.As.B2.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArithmeticSequence6992 {
	static final int nextLen = 5;
	static int[] arr = null;
	static int[] nextArr = null;
	static boolean check() {
		int base = arr[1]-arr[0];
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] - arr[i-1] != base) return false;
		}
		nextArr[0] = arr[arr.length-1] + base;
		for (int i = 1; i < nextArr.length; i++) {
			nextArr[i] = nextArr[i-1] + base;
		}
		return true;
	}
	static String strParsing(int[] arr) {
		String[] strs = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			strs[i] = String.valueOf(arr[i]);
		}
		return "[" + String.join(", ", strs) + "]";
	}
	static String strFormat(boolean flag) {
		return flag 
				? "The next 5 numbers after " + strParsing(arr) + " are : " + strParsing(nextArr) 
				: "The sequence " + strParsing(arr) + " is not an arithmetic sequence.";
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			arr = new int[Integer.parseInt(st.nextToken())];
			nextArr = new int[nextLen];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			sb.append(strFormat(check())).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
