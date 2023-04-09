package Acmicpc.As.B2.TwentyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SeniorCitizenFunk25205 {
	static Set<Character> set = new HashSet<>(Arrays.asList('q','w', 'e', 'r', 't', 
			'a', 's', 'd', 'f', 'g', 'z', 'x', 'c', 'v'));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String s = br.readLine();
		
		System.out.println(set.contains(s.charAt(s.length()-1)) ? "1" : "0");
		br.close();
	}
}
