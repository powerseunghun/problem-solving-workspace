package Acmicpc.As.B3.EightThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Wykreślanka8721 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), val = 1, res = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] != val) {
				res++;
			}
			else val++;
		}
		
		System.out.println(res);
		br.close();
	}
}
