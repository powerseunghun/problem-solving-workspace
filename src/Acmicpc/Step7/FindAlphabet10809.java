package Acmicpc.Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindAlphabet10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int[] count = new int[26];
		Arrays.fill(count, -1);
		
		tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			if (count[tmp.charAt(i) - 97] == -1) {
				count[tmp.charAt(i) - 97] = i;
			}
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}
	}
}
