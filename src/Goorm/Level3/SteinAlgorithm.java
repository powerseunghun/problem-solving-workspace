package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SteinAlgorithm {
	static int steinAlgorithm(int A, int B) {
		int a = 0, b = 0;
		while (A != 0 && B != 0) {
			if (A % 2 == 0 && B % 2 == 0) {
				A /= 2;
				B /= 2;
				a++;
			}
			else if (A % 2 == 0 || B % 2 == 0) {
				A = A % 2 == 0 ? A / 2 : A;
				B = B % 2 == 0 ? B / 2 : B;
			}
			else if (A % 2 != 0 && B % 2 != 0) {
				if (A > B) {
					A -= B;
				}
				else B -= A;
			}
		}
		b = A == 0 ? B : A;
		return (int)(Math.pow(2, a) * b);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(steinAlgorithm(A, B));
	}
}
