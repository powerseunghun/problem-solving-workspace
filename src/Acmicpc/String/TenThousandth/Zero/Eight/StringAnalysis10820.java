package Acmicpc.String.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringAnalysis10820 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		int[] arr = new int[4];
		
		while ((s = br.readLine()) != null) {
			Arrays.fill(arr, 0);
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					arr[0]++;
				}
				else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
					arr[1]++;
				}
				else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					arr[2]++;
				}
				else if (s.charAt(i) == ' ') {
					arr[3]++;
				}
			}
			for (int el : arr) {
				System.out.print(el + " ");
			}
			System.out.println();
		}
		
	}
}
