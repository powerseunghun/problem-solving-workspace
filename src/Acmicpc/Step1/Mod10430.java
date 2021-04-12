package Acmicpc.Step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mod10430 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int C = Integer.parseInt(tmp.split(" ")[2]);
		
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
	}
}
