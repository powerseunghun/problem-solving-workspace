package Acmicpc.As.S5.TwentyThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class MiniGame25757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new HashSet<>();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		char c = str.split(" ")[1].charAt(0);
		
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		
		System.out.println(c == 'Y' ? set.size() : c == 'F' ? set.size()/2 : set.size()/3);
		br.close();
	}
}
