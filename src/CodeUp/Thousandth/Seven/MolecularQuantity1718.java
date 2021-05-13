package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MolecularQuantity1718 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(tmp, "'C'|'H'");
		boolean flag = false;
		int c = 0;
		
		while (st.hasMoreTokens()) {
			st.nextToken();
			flag = true;
		}
		if (!flag) {
			System.out.println(13);
			return;
		}
		
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) == 'C') {
				if (tmp.charAt(i+1) >= '1' && tmp.charAt(i+1) <= '9') {
					c = 1;
				}
			}
			else if (tmp.charAt(i) == 'H') {
				if (i != tmp.length()-1) {
					if (c == 1) c = 3;
					else c = 2;
				}
			}
		}
		st = new StringTokenizer(tmp, "'C'|'H'");
		switch(c) {
		case 1:
			System.out.println(12 * Integer.parseInt(st.nextToken()) + 1);
			break;
		case 2:
			System.out.println(1 * Integer.parseInt(st.nextToken()) + 12);
			break;
		case 3:
			System.out.println((12 * Integer.parseInt(st.nextToken())) + (1 * Integer.parseInt(st.nextToken())));
			break;
		}
	}
}
