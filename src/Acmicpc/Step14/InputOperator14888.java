package Acmicpc.Step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class InputOperator14888 {
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int[] nums = null;
	static int[] baseOperators = null;
	static char[] myOperators = null;
	static char[] opers = {'+', '-', '*', '/'};
	static int calc() {
		int sum = 0;
		switch(myOperators[0]) {
		case '+':
			sum = nums[0] + nums[1];
			break;
		case '-':
			sum = nums[0] - nums[1];
			break;
		case '*':
			sum = nums[0] * nums[1];
			break;
		case '/':
			sum = nums[0] / nums[1];
			break;
		}
		for (int i = 1; i < myOperators.length; i++) {
			switch(myOperators[i]) {
			case '+':
				sum += nums[i+1];
				break;
			case '-':
				sum -= nums[i+1];
				break;
			case '*':
				sum *= nums[i+1];
				break;
			case '/':
				sum /= nums[i+1];
				break;
			}
 		}
		return sum;
	}
	static void bt(int n, int d, int[] myOperCounts) {
		if (d >= (n-1)) {
			for (int i = 0; i < baseOperators.length; i++) {
				if (baseOperators[i] != myOperCounts[i]) return;
			}
//			for (int i = 0; i < myOperators.length; i++) {
//				System.out.print(myOperators[i] + " ");
//			}
//			System.out.println();
			int sum = calc();
			max = sum >= max ? sum : max;
			min = sum >= min ? min : sum;
			return;
		}
		
		int idx = 0;
		for (int i = 0; i < opers.length; i++) {
			myOperators[d] = opers[i];
			switch(opers[i]) {
			case '+':
				idx = 0;
				break;
			case '-':
				idx = 1;
				break;
			case '*':
				idx = 2;
				break;
			case '/':
				idx = 3;
				break;
			}
			myOperCounts[idx]++;
			bt(n, d+1, myOperCounts);
			myOperCounts[idx]--;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		nums = new int[N];
		myOperators = new char[N-1];
		baseOperators = new int[4];
		int[] myOperCounts = new int[baseOperators.length];
		Arrays.fill(myOperCounts, 0);
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < baseOperators.length; i++) {
			baseOperators[i] = Integer.parseInt(st.nextToken());
		}
		
		bt(N, 0, myOperCounts);
		
		System.out.println(max);
		System.out.println(min);
	}
}
