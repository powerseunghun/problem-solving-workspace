package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FillTile {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int[] arr = new int[n+1];
		
		arr[0] = 0; arr[1] = 1; arr[2] = 3;
		
		for (int i = 3; i < arr.length; i++) {
			arr[i] = (arr[i-1] + (arr[i-2] * 2)) % m;
		}
		
		System.out.println(arr[n]);
	}
}
