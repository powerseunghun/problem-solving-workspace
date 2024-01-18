package Acmicpc.As.S5.FourThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JumpHappy4383 {
	static int[] arr = new int[3001];
	static boolean[] check = new boolean[3001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int n = 0;
		boolean flag = true;
		
		while ((str = br.readLine()) != null) {
			n = Integer.parseInt(str.split(" ")[0]);
			arr = new int[n];
			check = new boolean[n];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(str.split(" ")[i+1]);
			}
			
			flag = false;
			for (int i = 1, v = 0; i < arr.length; i++) {
				v = Math.abs(arr[i]-arr[i-1]);
				if (v <= 0 || v >= n || check[v]) {
					flag = true;
					break;
				}
				check[v] = true;
			}
			sb.append(flag ? "Not jolly" : "Jolly").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
