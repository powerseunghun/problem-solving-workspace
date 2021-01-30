package basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AscDesc {
	public boolean check(int[] list, int[] checkList) {
		boolean flag = true;
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] != checkList[i]) {
				flag = false;
				break;
			}
		}
		
//		System.out.println("list");
//		for (int i = 0; i < list.length; i++) {
//			System.out.print(list[i] + " ");
//		}
//		System.out.println();
//		System.out.println("checkList");
//		for (int i = 0; i < checkList.length; i++) {
//			System.out.print(checkList[i] + " ");
//		}
		return flag;
	}
	public static void main(String[] args) {
		AscDesc ad = new AscDesc();
		Scanner sc = new Scanner(System.in);
		int[] list = new int[sc.nextInt()];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		
		int[] asc = list.clone();
		Arrays.sort(asc);
		Integer[] tmp = Arrays.stream(list).boxed().toArray(Integer[]::new);
		Arrays.sort(tmp, Collections.reverseOrder());
		int[] desc = Arrays.stream(tmp).mapToInt(Integer::intValue).toArray();
		
		if (ad.check(list, asc)) {
			System.out.println("오름차순");
		}
		else if (ad.check(list, desc)) {
			System.out.println("내림차순");
		}
		else {
			System.out.println("섞임");
		}
	}
}
