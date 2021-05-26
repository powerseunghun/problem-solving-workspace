package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class IntersectionUnion2765 {
	static boolean check(int[] arr1, int n) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == n) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean interFlag = false;
		int[] arr1 = null;
		int[] arr2 = null;
		ArrayList<Integer> union = null;
		Set<Integer> set = new HashSet<>();
		StringTokenizer st = null;
		
		arr1 = new int[Integer.parseInt(br.readLine())];
		st = new StringTokenizer(br.readLine());
		for (int i = 0, val = 0; i < arr1.length; i++) {
			val = Integer.parseInt(st.nextToken());
			arr1[i] = val;
			set.add(val);
		}
		
		arr2 = new int[Integer.parseInt(br.readLine())];
		st = new StringTokenizer(br.readLine());
		for (int i = 0, val = 0; i < arr2.length; i++) {
			val = Integer.parseInt(st.nextToken());
			if (check(arr1, val)) {
				interFlag = true;
				System.out.print(val + " ");
			}
			arr2[i] = val;
			set.add(val);
		}
		if (!interFlag) System.out.println("0");
		else System.out.println();
		
		union = new ArrayList<>(set);
		Collections.sort(union);
		
		for (int i = 0; i < union.size(); i++) {
			System.out.print(union.get(i) + " ");
		}
	}
}
