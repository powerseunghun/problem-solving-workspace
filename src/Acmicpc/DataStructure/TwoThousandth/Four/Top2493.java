package Acmicpc.DataStructure.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Top2493 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<int[]> top = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			while(!top.isEmpty()) {
				if (top.peek()[0] < arr[i]) top.pop();
				else {
					sb.append(top.peek()[1] + " ");
					break;
				}
			}
			if (top.empty()) {
				sb.append("0 ");
			}
			top.push(new int[] {arr[i], i+1});
		}
		System.out.println(sb.toString());
	}
}
