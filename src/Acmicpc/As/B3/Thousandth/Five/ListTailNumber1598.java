package Acmicpc.As.B3.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ListTailNumber1598 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		
		x1 = A % 4 == 0 ? A / 4 : (A/4) + 1;
		y1 = A % 4 == 0 ? 1 : 5 - (A % 4);
		x2 = B % 4 == 0 ? B / 4 : (B/4) + 1;
		y2 = B % 4 == 0 ? 1 : 5 - (B % 4);
		
		System.out.println(Math.abs(x1-x2)+Math.abs(y1-y2));
		br.close();
	}
}
