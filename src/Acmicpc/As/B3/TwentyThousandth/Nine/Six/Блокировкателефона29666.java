package Acmicpc.As.B3.TwentyThousandth.Nine.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Блокировкателефона29666 {
	static boolean func(String str) {
		return str.equals("123") || str.equals("456") || 
				str.equals("789") || str.equals("147") || 
				str.equals("258") || str.equals("369") || str.equals("058");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] cArr = str.toCharArray();
		Arrays.sort(cArr);
		
		System.out.println(func(new String(cArr)) ? "Unlocked" : "Locked");
		br.close();
	}
}
