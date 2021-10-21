package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountOfWord {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		
		while (st.hasMoreTokens()) {
			count++;
			st.nextToken();
		}
		System.out.println(count);
	}
}
