package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().replace("x", "").replace("y", "").replace("=", " ");
		System.out.println(str);
		
		String tmp = str.split(" ")[0];
		System.out.println(tmp);
		char op = ' ';
		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) >= '0' && tmp.charAt(i) <= '9') {
				op = tmp.charAt(i+1);
				break;
			}
		}
		String o1 = tmp.replace("+", " ").split(" ")[0];
//		String o2 = tmp.split("//.")[1];
		System.out.println(o1);
//		System.out.println(o2);
		
//		if (str.split(" ")[0].contains("+")) {
//			System.out.println("+");
//		}
//		else if (str.split(" ")[0].contains("-")) {
//			System.out.println("-");
//		}
	}
}
