package Acmicpc.As.B2.SixThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SimpleEncryption6890 {
	static char[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String header = br.readLine();
		String str = br.readLine().replaceAll("[^A-Z]", "");
		int w = str.length()%header.length() == 0 ? str.length()/header.length() : str.length()/header.length()+1, idx = 0, v = 0;
		
		arr = new char[w][header.length()];
		
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], '.');
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = str.charAt(idx++);
				if (idx >= str.length()) {
					i = arr.length+1;
					break;
				}
			}
		}
		
		idx = 0;
		for (char c[] : arr) {
			for (char a : c) {
				if (a == '.') break;
				v = a + header.charAt(idx % header.length()) - 65;
				v = v > 90 ? v -= 26 : v;
				idx++;
				sb.append((char)v);
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
