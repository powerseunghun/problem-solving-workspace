package Acmicpc.As.B5.TwentyThousandth.Nine.Six;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Разрезаниезаготовки29648 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int s = Integer.parseInt(str.split(" ")[2]), res = -1;
		
		for (int i = Math.max(a,b); (i-a)*(i-b)<=s; i++) {
			if ((i-a)*(i-b) == s) {
				res = i;
				break;
			}
		}
		System.out.println(res);
		br.close();
	}
}
