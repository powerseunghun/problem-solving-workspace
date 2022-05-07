package Codeforce.OrderSubmit.OneThousandth.FiveHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DesignTutorialLearnFromMath {
	static int[] arr = {4, 9};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(arr[n%2] + " " + (n-arr[n%2]));
		br.close();
	}
}
