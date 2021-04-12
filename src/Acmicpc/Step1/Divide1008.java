package Acmicpc.Step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divide1008 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println((double)A/B);
	}
}
