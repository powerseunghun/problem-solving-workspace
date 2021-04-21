package Acmicpc.Step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snail2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double A = 0, B = 0, V = 0;
		int d = 0;
		String tmp = br.readLine();
		A = Double.parseDouble(tmp.split(" ")[0]);
		B = Double.parseDouble(tmp.split(" ")[1]);
		V = Double.parseDouble(tmp.split(" ")[2]);
		
		d = (int)(V-B-1) / (int)(A-B) + 1;
		
		System.out.println(d);
	}
}
