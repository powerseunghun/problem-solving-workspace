package Acmicpc.As.S5.TenThousandth.Seven.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AndTheWinner17509 {
	static final int limit = 11;
	static int[] arr1 = new int[limit+1], arr2 = new int[limit+1];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int res = 0;
		
		for (int i = 0; i < limit; i++) {
			str = br.readLine();
			arr1[i] = Integer.parseInt(str.split(" ")[0]);
			arr2[i] = Integer.parseInt(str.split(" ")[1]);
		}
		Arrays.sort(arr1);
		
		for (int i = 0, v = 0; i < arr1.length; i++) {
			res += v + arr1[i];
			v += arr1[i];
		}
		
		for (int el : arr2) {
			res += (20 * el);
		}
		
		System.out.println(res);
		br.close();
	}
}
