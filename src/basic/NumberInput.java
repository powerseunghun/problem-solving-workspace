package basic;

import java.util.Scanner;

public class NumberInput {
	public int getLength(int n) {
		if (n == 1) return 2;
		else {
			return getLength(n - 1) + (int)(Math.pow(2.0, n-2));
		}
	}
	public void makeArr(int[] beforeArr, int[] afterArr) {
		int index = 0;
		for (int i = 0; i < beforeArr.length; i++) {
			afterArr[index] = beforeArr[i];
			index += 2;
		}
		
		
		for (int i = 0; i < afterArr.length; i++) {
			if (afterArr[i] == 0) {
				afterArr[i] = afterArr[i-1] + afterArr[i+1]; 
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		NumberInput ni = new NumberInput();
		int[] beforeArr = new int[] {1, 1};
		int[] afterArr = null;
		
		for (int i = 1; i < m; i++) {
			afterArr = new int[ni.getLength(i+1)];
			ni.makeArr(beforeArr, afterArr);
			beforeArr = afterArr.clone();
			for (int j = 0; j < afterArr.length; j++) {
				afterArr[j] = 0;
			}
		}
		
		System.out.println(beforeArr[n - 1]);
	}
}
