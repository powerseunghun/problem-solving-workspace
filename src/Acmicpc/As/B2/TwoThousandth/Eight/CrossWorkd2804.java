package Acmicpc.As.B2.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrossWorkd2804 {
	static int getIdx(String A, String B) {
		for (int i = 0; i < A.length(); i++) {
			if (B.contains(A.charAt(i)+"")) {
				return A.indexOf(A.charAt(i));
			}
		}
		return -1;
	}
	static int getIdx(String A, char c) {
		return A.indexOf(c);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		String A = tmp.split(" ")[0], B = tmp.split(" ")[1];
		int c = getIdx(A, B), r = getIdx(B, A.charAt(c));
		
		System.out.println("r : " + r + " , c : " + c);
		for (int i = 0; i < B.length(); i++) {
			for (int j = 0; j < A.length(); j++) {
				if (i == r) {
					sb.append(A);
					break;
				}
				else if (i == r && j == c) {
					sb.append(A.charAt(c));
				}
//				else if (i == r) {
//					sb.append(A);
//					break;
//				}
				else if (j == c) {
					sb.append(B.charAt(i));
				}
				else sb.append(".");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
