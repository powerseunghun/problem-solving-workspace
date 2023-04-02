package Acmicpc.As.B2.SixThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexadecimalConversion6040 {
	static int charParse(char c) {
		return c >= '0' && c <= '9' ? c-'0' : c-55;
	}
	static int getVal(String str) {
		int sum = 0;
		for (int i = str.length()-1, idx = 0; i >= 0; i--) {
			sum += charParse(str.charAt(i)) * Math.pow(2, idx++);
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  String str = br.readLine(), res = "";
		  int idx = str.length()-1;
		  long sum = 0;
		  
		  for (int i = 0; i < str.length(); i++) {
			  sum += charParse(str.charAt(i)) * Math.pow(16, idx--);
		  }
		  
		  while (sum > 0) {
			  res = sum % 8 + res;
			  sum /= 8;
		  }
		  
		  System.out.println(res.equals("") ? "0" : res);
		  br.close();
	}
}
