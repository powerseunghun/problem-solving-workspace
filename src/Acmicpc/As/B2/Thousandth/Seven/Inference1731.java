package Acmicpc.As.B2.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inference1731 {
	static int[] arr = null;
	static int inf() {
		if (arr[2]-arr[1] == arr[1]-arr[0]) return 0;
		else return 1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int flag = 0, q = 0;
		arr = new int[Integer.parseInt(br.readLine())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		flag = inf();
		q = flag == 0 ? arr[1]-arr[0] : arr[1]/arr[0];
		
		System.out.println(flag == 0 ? arr[arr.length-1] + q : arr[arr.length-1] * q);
		br.close();
	}
}