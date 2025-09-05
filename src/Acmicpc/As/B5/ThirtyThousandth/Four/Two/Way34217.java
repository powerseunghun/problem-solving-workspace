package Acmicpc.As.B5.ThirtyThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Way34217 {
	static int[] arr = new int[2];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		
		for (int i = 0; i < 2; i++) {
			str = br.readLine();
			arr[0] += Integer.parseInt(str.split(" ")[0]);
			arr[1] += Integer.parseInt(str.split(" ")[1]);
		}
		
		System.out.println(arr[0]==arr[1] ? "Either" : arr[0] < arr[1] ? "Hanyang Univ." : "Yongdap");
		br.close();
	}
}
