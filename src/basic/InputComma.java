package basic;

import java.util.Scanner;

public class InputComma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;
		sc.nextLine();
		int[] arr = new int[n];
		boolean flag = true;
		String tmp = sc.nextLine(), s = "";
		for (int i = 0; i < n; i++) {
			arr[i] = tmp.charAt(i) - 48;
		}
		
		if (arr.length < 4) {
			for (int i = 0; i <arr.length; i++) {
				s += arr[i];
			}
		}
		else {
			if (arr.length % 3 == 0) flag = false;
			for (int i = 0; i < arr.length; i++) {
				s += arr[i];
				count++;
				if (i == arr.length - 1) break;
				
				if (flag) {
					if (count == arr.length % 3) {
						s += ",";
						count = 0;
						flag = false;
					}
				}
				else {
					if (count == 3) {
						s += ",";
						count = 0;
					}
				}
			}
		}
		
		System.out.println(s);
	}
}
