package Acmicpc.As.B1.TwentyThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InPlace25400 {
	static int[] arr = null;
	static int check() {
		int res = arr.length;
		for (int i = 0, t = 1; i < arr.length; i++) {
			if (arr[i] == t) {
				res--;
				t++;
			}
		}
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(check());
		br.close();
	}
}
