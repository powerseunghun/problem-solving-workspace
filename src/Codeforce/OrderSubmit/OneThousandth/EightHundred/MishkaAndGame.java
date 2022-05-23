package Codeforce.OrderSubmit.OneThousandth.EightHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MishkaAndGame {
	static int[] arr = new int[2];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String tmp = null;
		
		for (int i = 0, m = 0, c = 0; i < n; i++) {
			tmp = br.readLine();
			m = Integer.parseInt(tmp.split(" ")[0]);
			c = Integer.parseInt(tmp.split(" ")[1]);
			if (m > c) arr[0]++;
			else if (m < c) arr[1]++;
		}
		if (arr[0] > arr[1]) System.out.println("Mishka");
		else if (arr[0] < arr[1]) System.out.println("Chris");
		else System.out.println("Friendship is magic!^^");
		
		br.close();
	}
}
