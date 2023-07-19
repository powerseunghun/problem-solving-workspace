package Acmicpc.As.B2.TenThousandth.Five.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion25501 {
	static int res = 0;
	static int recursion(String s, int l, int r){
		res++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
	static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String s = null;
		
		while(T-- > 0) {
			s = br.readLine();
			res = 0;
			sb.append(isPalindrome(s) + " " + res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
