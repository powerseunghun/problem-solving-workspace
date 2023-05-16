package Acmicpc.As.B2.FiveThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BadRandomNumbers5948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Set<String> set = new HashSet<>();
		int res = 0, w = 0;
		boolean flag = false;
		
		while (str.length() != 1) {
			str = str.substring(Math.max(str.length()/2-1, 0), str.length()-1);
			w = Integer.parseInt(str);
			str = String.valueOf((int)Math.pow(w, 2));
			
			if (set.contains(str)) {
				flag = true;
				break;
			}
			set.add(str);
			res++;
		}
		
		System.out.println(flag ? res+1 : res+2);
		br.close();
	}
}