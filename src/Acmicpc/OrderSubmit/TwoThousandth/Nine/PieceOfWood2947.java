package Acmicpc.OrderSubmit.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PieceOfWood2947 {
	static int[] arr = new int[5];
	static int[] goal = {1,2,3,4,5};
	static boolean check() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != goal[i]) return false;
		}
		return true;
	}
	static void printArr() {
		for (int el : arr) {
			System.out.print(el + " ");
		}
		System.out.println();
	}
	static void func() {
		for (int i = 0, tmp = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i+1]) {
				tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
				printArr();
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		do {
			func();
		}while(!check());
		br.close();
	}
}
