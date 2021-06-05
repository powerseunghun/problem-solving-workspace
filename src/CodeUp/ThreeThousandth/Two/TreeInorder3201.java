package CodeUp.ThreeThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TreeInorder3201 {
	static void inOrder(String str, int idx) {
		if (idx > str.length()) return;
		inOrder(str, 2 * idx);
		System.out.print(str.charAt(idx-1));
		inOrder(str, 2 * idx + 1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] parent = new char[str.length()];
		Arrays.fill(parent, ' ');
		
		inOrder(str, 1);
	}
}
