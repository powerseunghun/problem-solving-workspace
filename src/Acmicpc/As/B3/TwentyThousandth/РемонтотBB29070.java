package Acmicpc.As.B3.TwentyThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class РемонтотBB29070 {
	static int func(int a, int b) {
		return (a+b-1)/b;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int h = Integer.parseInt(str.split(" ")[2]);
		int w = Integer.parseInt(str.split(" ")[3]);
		
		System.out.println(func(h, a) * func(w, b));
		br.close();
	}
}
