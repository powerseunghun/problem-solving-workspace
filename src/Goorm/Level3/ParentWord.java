package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParentWord {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String A = tmp.split(" ")[0], B = tmp.split(" ")[1];
		
		for (int i = 0; i < B.length(); i++) {
			if (!A.contains(B.charAt(i)+"")) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		
		br.close();
	}
}
