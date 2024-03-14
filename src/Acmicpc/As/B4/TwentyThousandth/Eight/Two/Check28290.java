package Acmicpc.As.B4.TwentyThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Check28290 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), res = null;
		if (str.equals("fdsajkl") || str.equals("jkl;fdsa")) {
			res = "in-out";
		}
		else if (str.equals("asdf;lkj")) {
			res = "asdfjkl;";
		}
		else if (str.equals(";lkjfdsa")) {
			res = "reverse";
		}
		else res = "molu";
		
		System.out.println(br.readLine());
		br.close();
	}
}
