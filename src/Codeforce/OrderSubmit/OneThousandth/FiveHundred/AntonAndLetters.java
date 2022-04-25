package Codeforce.OrderSubmit.OneThousandth.FiveHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class AntonAndLetters {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().replaceAll("\\{", "").replaceAll("\\}", "");
		Set<Character> set = new HashSet<>();
		StringTokenizer st = null;
		
		if (str.equals("")) {
			System.out.println("0");
			return;
		}
		st = new StringTokenizer(str, ", ");
		
		while (st.hasMoreTokens()) {
			set.add(st.nextToken().charAt(0));
		}
		
		System.out.println(set.size());
		br.close();
	}
}
