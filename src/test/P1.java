package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		long sum = 0;
		
		for (long i = n+1; i < n*n; i+=(n+1)) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
