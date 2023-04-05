package Acmicpc.As.B2.FiveThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HayBales5919 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0, g = 0;
		int[] arr = new int[Integer.parseInt(br.readLine())];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		g = sum/arr.length;
		sum = 0;
		
		for (int el : arr) {
			sum += Math.abs(el-g);
		}
		
		System.out.println(sum/2);
		br.close();
	}
}
