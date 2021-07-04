package CodeUp.FourThousandth.Six;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Top4654 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n], t = new int[n];
		Stack<Integer> top = new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			top.push(arr[i]);
		}
		for (int i = t.length-1; i >= 0; i--) {
			int val = top.pop();
			for (int j = i; j >= 0; j--) {
				if (val < arr[j]) {
					t[i] = j+1;
					break;
				}
			}
		}
		
		for (int i = 0; i < t.length; i++) {
			System.out.print(t[i] + " ");
		}
	}
}
