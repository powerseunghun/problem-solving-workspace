package Acmicpc.OrderSubmit.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoSubmitWork5597 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[31];
		
		for (int i = 0; i < 28; i++) {
			arr[Integer.parseInt(br.readLine())] = 1;
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > 0) continue;
			sb.append(i + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
