package Acmicpc.As.B2.EightThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Las8669 {
	static Set<Integer> set = new HashSet<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), r = 0;
		String str = null;
		
		while(n-- > 0) {
			str = br.readLine();
			r = Integer.parseInt(str.split(" ")[1]);
			set.add(r);
		}
		
		System.out.println(set.size());
		br.close();
	}
}
