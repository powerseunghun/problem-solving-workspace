package Codeforce.OrderSubmit.OneThousandth.FiveHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Expression {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[3];
		int tmp1 = 0, tmp2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		tmp1 = Math.max(arr[0]+arr[1]*arr[2], arr[0]*(arr[1]+arr[2]));
		tmp2 = Math.max(arr[0]*arr[1]*arr[2], (arr[0]+arr[1])*arr[2]);
		
		System.out.println(Math.max(Math.max(tmp1, tmp2), arr[0]+arr[1]+arr[2]));
		br.close();
	}
}