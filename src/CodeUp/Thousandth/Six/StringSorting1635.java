package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringSorting1635 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = new String[Integer.parseInt(br.readLine())];
		
		for (int i = 0; i < strs.length; i++) {
			strs[i] = br.readLine();
		}
		Arrays.sort(strs);
		
		for (String str : strs) {
			System.out.println(str);
		}
		
	}
}
