package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
	public static int solution(int n) {
		int answer = 0, base = 1;
		while (true) {
			if (Math.pow(5, base) > n) {
				break;
			}
			else {
				base++;
			}
 		}
		for (int i = 1; i < base; i++) {
			answer += (n / Math.pow(5, i));
		}
		
		return answer;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(solution(n));
	}
}
