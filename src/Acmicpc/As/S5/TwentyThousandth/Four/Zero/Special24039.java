package Acmicpc.As.S5.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Special24039 {
	static int[] arr = new int[10001];
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) continue;
			for (int j = i*2; j < arr.length; j+=i) {
				arr[j] = 0;
			}
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] != 0) list.add(arr[i]);
		}
		
		for (int i = 0; i < list.size()-1; i++) {
			if (list.get(i) * list.get(i+1) > N) {
				res = list.get(i) * list.get(i+1);
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//		int result = 0, i, j;
//		ArrayList<Integer> list = new ArrayList<Integer>();
//
//		// 10000까지의 소수를 구하는 코드
//		for (i = 2; i <= 10000; i++) {
//			for (j = 2; j < i; j++) {
//				if (i % j == 0) {
//					break;
//				}
//			}
//
//			if (i == j) {
//				list.add(i);
//			}
//		}
//
//		
//		for (i = 0; i < list.size(); i++) {
//			result = list.get(i) * list.get(i + 1);
//			if (result > n) {
//				System.out.println(result);
//				System.exit(0);
//			}
//		}
//	}
//}