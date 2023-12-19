package Acmicpc.As.S5.TwentyThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SkillMaster25497 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		int l = 0, s = 0, res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case 'L':
				l++;
				break;
			case 'S':
				s++;
				break;
			case 'R':
				if (l == 0) {
					i = str.length()+1;
					break;
				}
				res++;
				l--;
				break;
			case 'K':
				if (s == 0) {
					i = str.length()+1;
					break;
				}
				res++;
				s--;
				break;
			default:
				res++;
				break;
			}
		}
		System.out.println(res);
		br.close();
	}
}
