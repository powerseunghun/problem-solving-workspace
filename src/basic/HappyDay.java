package basic;

import java.util.Scanner;

public class HappyDay {
	public boolean checkConstruct(int[] year, int[] dayDate) {
		boolean flag = true;
		for (int i = 0; i < year.length; i++) {
			if (year[i] != dayDate[i]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		int[] year = new int[10];
		int[] dayDate = new int[10];
		
		for (int i = 0; i < s.length();i ++) {
			if (s.charAt(i) != '/') {
				if (i < 4) {
					year[s.charAt(i) - 48]++;
				}
				else {
					dayDate[s.charAt(i) - 48]++;
				}
			}
		}
		if (new HappyDay().checkConstruct(year, dayDate)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
