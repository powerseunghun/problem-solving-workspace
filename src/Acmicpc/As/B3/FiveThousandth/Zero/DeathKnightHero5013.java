package Acmicpc.As.B3.FiveThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeathKnightHero5013 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), cnt = T, li = 0;
		String tmp = null;
		
		while (T-- > 0) {
			tmp = br.readLine();
			li = tmp.lastIndexOf('C');
			if (li == tmp.length()-1 || li == -1) continue;
			if (tmp.charAt(li+1) == 'D') cnt--;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
