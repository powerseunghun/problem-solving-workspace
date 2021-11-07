package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfOne {
	static int getOneCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count += str.charAt(i) == '1' ? 1 : 0;
		}
		return count;
	}
	static int toHexNumber(int N) {
		String str = N+"";
		int w = 0, sum = 0;
		
		for (int i = str.length()-1; i >= 0; i--) {
			sum += (str.charAt(i)-'0') * Math.pow(16, w++);
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		sb.append(getOneCount(Integer.toBinaryString(N)) + " ");
		N = toHexNumber(N);
		sb.append(getOneCount(Integer.toBinaryString(N)));
		
		System.out.print(sb.toString());
		br.close();
	}
}
