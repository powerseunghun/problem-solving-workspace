package Acmicpc.OrderSubmit.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EasyProblem1292 {
	static int[] arr = new int[1001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0, val = 1;
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		// 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 
		// 1 3 5 8 11 14 18 22
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = val;
			count++;
			if (val == count) {
				val++;
				count = 0;
			}
		}
		
		val = 0;
		for (int i = A; i <= B; i++) {
			val += arr[i];
		}
		
		System.out.println(val);
		br.close();
	}
}
