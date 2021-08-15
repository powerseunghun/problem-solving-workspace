package Acmicpc.Sorting.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SerialNumber1431 {
	static int getNum(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				sum += s.charAt(i) - '0';
			}
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() != o2.length()) {
					return o1.length()-o2.length();
				}
				else {
					int t1 = getNum(o1);
					int t2 = getNum(o2);
					if (t1 == t2) return o1.compareTo(o2);
					else return Integer.compare(t1, t2);
				}
			}
		});
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]+"\n");
		}
		System.out.print(sb.toString());
	}
}
