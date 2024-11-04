package Acmicpc.As.B3.TwentyThousandth.Nine.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Обучениевойск29064 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v = 0, c = 0;
		int res = N%2 == 0 ? N/2 : N/2+1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			if (v == 1) c++;
		}
		
		System.out.println(res-c < 0 ? 0 : res-c);
		br.close();
	}
}
