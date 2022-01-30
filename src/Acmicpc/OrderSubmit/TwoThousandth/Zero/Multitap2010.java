package Acmicpc.OrderSubmit.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multitap2010 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		res = arr[0];
		for (int i = 1; i < arr.length; i++) {
			res-=1;
			res += arr[i];
		}
		
		System.out.println(res);
		br.close();
	}
}
