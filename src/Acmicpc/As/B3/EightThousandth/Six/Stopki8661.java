package Acmicpc.As.B3.EightThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stopki8661 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int x = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		int a = Integer.parseInt(tmp.split(" ")[2]);
		
		System.out.println(k > x%(k+a) ? 1 : 0);
		br.close();
	}
}
