package Acmicpc.OrderSubmit.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContinuousNumberWrite1748 {
	static int[][] arr = new int[10][10];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int length = 0;
		
		for (int i = 1, weight = 9; i < str.length(); i++, weight *= 10) {
			length += (i * weight);
		}
		// 15 - 10 5
		length += (Integer.parseInt(str)-Math.pow(10, str.length()-1)+1) * str.length();
		
		System.out.println(length);
		br.close();
	}
}
