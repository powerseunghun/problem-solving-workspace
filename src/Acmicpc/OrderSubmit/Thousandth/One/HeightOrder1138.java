package Acmicpc.OrderSubmit.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class HeightOrder1138 {
	static int[] arr = null;
//	static int[] res = null;
//	static int getIdx(int idx) {
//		while (res[idx] != 0) {
//			idx++;
//		}
//		return idx;
//	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 2 1 1 0
		// 4 2 3 1
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		arr = new int[N];
//		res = new int[N];
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
//		for (int i = N-1; i >= 0; i--) {
//			res[getIdx(arr[i])] = (i+1);
//		}
//		for (int el : res) {
//			sb.append(el + " ");
//		}
		for (int i = N-1; i >= 0; i--) {
			list.add(arr[i], i+1);
		}
		for (int el : list) {
			sb.append(el + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
