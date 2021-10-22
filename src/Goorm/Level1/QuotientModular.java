package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuotientModular {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(A/B);
		System.out.println(A%B);
	}
}
