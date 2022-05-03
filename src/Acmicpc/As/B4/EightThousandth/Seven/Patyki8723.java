package Acmicpc.As.B4.EightThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Patyki8723 {
	static int[] arr = new int[3];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		arr[0] = Integer.parseInt(tmp.split(" ")[0]);
		arr[1] = Integer.parseInt(tmp.split(" ")[1]);
		arr[2] = Integer.parseInt(tmp.split(" ")[2]);
		Arrays.sort(arr);
		
		if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
			System.out.println("1");
		}
		else if ((arr[0] == arr[1]) && (arr[1] == arr[2])) {
			System.out.println("2");
		}
		else System.out.println("0");
		
		br.close();
	}
}
