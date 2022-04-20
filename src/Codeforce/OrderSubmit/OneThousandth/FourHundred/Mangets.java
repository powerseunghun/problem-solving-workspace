package Codeforce.OrderSubmit.OneThousandth.FourHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Mangets {
	static String[] strs = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), cnt = 1;
		strs = new String[N];
		
		for (int i = 0; i < strs.length; i++) {
			strs[i] = br.readLine();
		}
		for (int i = 0; i < strs.length-1; i++) {
			if (!strs[i].equals(strs[i+1])) cnt++;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
