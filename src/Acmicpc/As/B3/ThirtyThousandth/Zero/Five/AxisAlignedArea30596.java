package Acmicpc.As.B3.ThirtyThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AxisAlignedArea30596 {
	static final int l = 4;
	static int[] arr = new int[l];
	static int[] res = new int[l-1];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		res[0] = Math.min(arr[0], arr[1]) * Math.min(arr[2], arr[3]);
		res[1] = Math.min(arr[0], arr[2]) * Math.min(arr[1], arr[3]);
		res[2] = Math.min(arr[0], arr[3]) * Math.min(arr[1], arr[2]);
		
		System.out.println(Math.max(res[0], Math.max(res[1], res[2])));
		br.close();
	}
}
