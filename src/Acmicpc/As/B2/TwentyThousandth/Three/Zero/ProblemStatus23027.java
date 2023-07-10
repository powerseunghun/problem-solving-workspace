package Acmicpc.As.B2.TwentyThousandth.Three.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemStatus23027 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		if (str.contains("A")) {
			str = str.replaceAll("B|C|D|F", "A");
		}
		else {
			if (str.contains("B")) {
				str = str.replaceAll("C|D|F", "B");
			}
			else {
				if (str.contains("C")) {
					str = str.replaceAll("D|F", "C");
				}
				else {
					str = str.replaceAll("[A-Z]", "A");
				}
			}
		}
		
		System.out.println(str);
		br.close();
	}
}
