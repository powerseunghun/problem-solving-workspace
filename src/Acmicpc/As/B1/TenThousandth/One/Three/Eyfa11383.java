package Acmicpc.As.B1.TenThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eyfa11383 {
	static char[][] origin = null, expand = null;
	static boolean check() {
		for (int i = 0; i < origin.length; i++) {
			for (int j = 0; j < origin[i].length; j++) {
				if (origin[i][j] != expand[i][j]) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		
		origin = new char[N][M*2];
		expand = new char[N][M*2];
		
		for (int i = 0; i < origin.length; i++) {
			str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				origin[i][j*2] = str.charAt(j);
				origin[i][j*2+1] = str.charAt(j);
			}
		}
		for (int i = 0; i < expand.length; i++) {
			str = br.readLine();
			for (int j = 0; j < expand[i].length; j++) {
				expand[i][j] = str.charAt(j);
			}
		}
		
		System.out.println(check() ? "Eyfa" : "Not Eyfa");
		br.close();
	}
}
