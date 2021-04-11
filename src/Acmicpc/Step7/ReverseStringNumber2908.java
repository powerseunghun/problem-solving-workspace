package Acmicpc.Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseStringNumber2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), tmp = null, tmp2;
		StringTokenizer st = new StringTokenizer(str);
		int answer = 0;
		
		while(st.hasMoreElements()) {
			tmp = st.nextToken();
			tmp2 = "";
			for (int i = tmp.length()-1; i >= 0; i--) {
				tmp2 += tmp.charAt(i);
			}
			
			if (Integer.parseInt(tmp2) >= answer) {
				answer = Integer.parseInt(tmp2);
			}
		}
		
		System.out.println(answer);
	}
}
