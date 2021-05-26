package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Operation2761 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int[] arr = new int[3];
		arr[0] = a+b;
		arr[1] = a-b;
		arr[2] = a*b;
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
	}
}
