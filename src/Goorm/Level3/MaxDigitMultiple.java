package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MaxDigitMultiple {
	static int digitMultiple(int N) {
		int sum = 1;
		while (N != 0) {
			sum *= N%10;
			N /= 10;
		}
		System.out.println("sum : " + sum);
		return sum;
	}
	static int getMaxMultiple(int N) {
		int max = Integer.MIN_VALUE;
		String str = N+"", tmp = null;
		List<Integer> possibleNumber = new ArrayList<>();
		
		System.out.println("E");
		for (int i = 0; i < str.length(); i++) {
			tmp = "";
			System.out.println("i : " + i);
			for (int j = 0; j < str.length(); j++) {
				System.out.println("j : " + j);
				if (i == str.length()-1) tmp = str;
				else if (i == j) tmp += (char)(str.charAt(i)-1);
				else if (i < j) tmp += "9";
				else tmp += str.charAt(j);
			}
			System.out.println("D");
			System.out.println("tmp : " + tmp);
			possibleNumber.add(Integer.parseInt(tmp));
		}
		System.out.println("EN");
		for (int i = 0; i < possibleNumber.size(); i++) {
			max = Math.max(max, digitMultiple(possibleNumber.get(i)));
		}
		return max;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(getMaxMultiple(N));
	}
}
