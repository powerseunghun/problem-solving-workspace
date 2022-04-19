package Codeforce.OrderSubmit.OneThousandth.ThreeHundered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StonesOnTheTable {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		br.readLine();
		char[] arr = br.readLine().toCharArray();
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i+1]) count++;
		}
		
		System.out.println(count);
		br.close();
	}
}
