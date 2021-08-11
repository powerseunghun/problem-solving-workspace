package Acmicpc.BruteForceAlgorithm.TenThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PutOperator15658 {
	static char[] myOp = null;
	static int[] arr = null;
	static int[] opCount = new int[4];
	static char[] operator = {'+', '-', '*', '/'};
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static void calc() {
		int tmp = 0, opIdx = 0;
		switch(myOp[opIdx++]) {
		case '+':
			tmp = arr[0] + arr[1];
			break;
		case '-':
			tmp = arr[0] - arr[1];
			break;
		case '*':
			tmp = arr[0] * arr[1];
			break;
		case '/':
			tmp = arr[0] / arr[1];
			break;
		}
		for (int i = 2, tmp2 = 0; i < arr.length; i++) {
			tmp2 = arr[i];
			switch(myOp[opIdx++]) {
			case '+':
				tmp += tmp2;
				break;
			case '-':
				tmp -= tmp2;
				break;
			case '*':
				tmp *= tmp2;
				break;
			case '/':
				tmp /= tmp2;
				break;
			}
		}
		max = Math.max(max, tmp);
		min = Math.min(min, tmp);
	}
	static void dfs(int n, int d, int[] ops) {
		if (d >= n) {
			for (int i = 0; i < opCount.length; i++) {
				if (ops[i] > opCount[i]) return;
			}
			calc();
			return;
		}
		
		for (int i = 0, myIdx = 0; i < operator.length; i++) {
			myOp[d] = operator[i];
			switch(operator[i]) {
			case '+':
				myIdx = 0;
				break;
			case'-':
				myIdx = 1;
				break;
			case '*':
				myIdx = 2;
				break;
			case '/':
				myIdx = 3;
				break;
			}
			ops[myIdx]++;
			dfs(n, d+1, ops);
			ops[myIdx]--;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		myOp = new char[N-1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < opCount.length; i++) {
			opCount[i] = Integer.parseInt(st.nextToken());
		}
		dfs(N-1, 0, new int[4]);
		
		System.out.println(max);
		System.out.println(min);
	}
}
