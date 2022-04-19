package Codeforce.OrderSubmit.OneThousandth.ThreeHundered;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BoyOrGirl {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		Set<Character> disChar = new HashSet<>();
		
		for (int i = 0; i < tmp.length(); i++) {
			disChar.add(tmp.charAt(i));
		}
		
		System.out.println(disChar.size()%2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
		br.close();
	}
}
