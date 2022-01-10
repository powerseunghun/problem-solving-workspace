package Goorm.AlgorithmHeroes.T7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleFourthNumber {
	static int mul(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int[] arr = new int[4];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(tmp.split(" ")[i]);
		}
		
		System.out.println(mul(mul(arr[0], arr[1]), mul(arr[2], arr[3])));
		br.close();
	}
}
