package Acmicpc.As.B3.TenThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NoParenthesisFormula16503 {
	static int[] arr = new int[3];
	static char[] cArr = new char[2];
	static int calc(int a, char op, int b) {
		int res = 0;
		switch(op) {
		case '+':
			res = a+b;
			break;
		case '-':
			res = a-b;
			break;
		case '*':
			res = a*b;
			break;
		case '/':
			res = a/b;
			break;
		}
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arrIdx = 0, cArrIdx = 0, tmp1 = 0, tmp2 = 0;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				arr[arrIdx++] = Integer.parseInt(st.nextToken());
			}
			else {
				cArr[cArrIdx++] = st.nextToken().charAt(0);
			}
		}
		tmp1 = calc(calc(arr[0], cArr[0], arr[1]), cArr[1], arr[2]);
		tmp2 = calc(arr[0], cArr[0], calc(arr[1], cArr[1], arr[2]));
		
		System.out.println(Math.min(tmp1, tmp2));
		System.out.println(Math.max(tmp1, tmp2));
		br.close();
	}
}
