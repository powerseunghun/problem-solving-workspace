package Acmicpc.String.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevSum1357 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb1 = new StringBuilder(s.split(" ")[0]);
		StringBuilder sb2 = new StringBuilder(s.split(" ")[1]);
		StringBuilder sb3 = null;
		s = (Integer.parseInt(sb1.reverse().toString()) + Integer.parseInt(sb2.reverse().toString()))+"";
		sb3 = new StringBuilder(s);
		System.out.println(Integer.parseInt(sb3.reverse().toString()));
		
	}
}
