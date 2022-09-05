package Acmicpc.As.B3.TenThousandth.Seven.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Elder17042 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char cur = br.readLine().charAt(0), Z1 = ' ', Z2 = ' ';
		int N = Integer.parseInt(br.readLine());
		Set<Character> set = new HashSet<>();
		String tmp = null;
		set.add(cur);
		
		while(N-- > 0) {
			tmp = br.readLine();
			Z1 = tmp.split(" ")[0].charAt(0);
			Z2 = tmp.split(" ")[1].charAt(0);
			if (Z2 == cur) {
				cur = Z1;
				set.add(cur);
			}
		}
		
		System.out.println(cur);
		System.out.println(set.size());
		br.close();
	}
}
