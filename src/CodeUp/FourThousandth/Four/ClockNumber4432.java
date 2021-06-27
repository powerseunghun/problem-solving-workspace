package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ClockNumber4432 {
	static boolean check(int n) {
		int[] arr = new int[4];
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		int count = 0, clockNumber = 10001;
		String str = n + "";
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i) - '0';
		}
		while (list.size() < 4) {
			for (int i = 0; i < 4; i++) {
				sb = new StringBuilder();
				count = 0;
				for (int j = i; ; j++) {
					sb.append(arr[j%4]);
					count++;
					if (count == 4) {
						break;
					}
				}
				int t = Integer.parseInt(sb.toString());
				list.add(t);
				clockNumber = t >= clockNumber ? clockNumber : t;
			}
		}
		if (clockNumber != n) {
			return false;
		}
		else return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[4];
		int count = 0, clockNumber = 10000;
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		StringBuilder sb = null;
		
		while (list.size() < 4) {
			for (int i = 0; i < 4; i++) {
				sb = new StringBuilder();
				count = 0;
				for (int j = i; ; j++) {
					sb.append(arr[j%4]);
					count++;
					if (count == 4) {
						break;
					}
				}
				int t = Integer.parseInt(sb.toString());
				list.add(t);
				clockNumber = t >= clockNumber ? clockNumber : t;
			}
		}
		count = 0;
		for (int i = 1111; i <= clockNumber; i++) {
			if ((i+"").contains("0") || !check(i)) {
				continue;
			}
			count++;
		}
		System.out.println(count);
	}
}
