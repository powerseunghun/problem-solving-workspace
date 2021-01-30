package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Participant {
	
}
public class MakeStudentList {
	public static void main(String[] args) {
		int[] nums = new int[10001];
		int[] unums = null;
		Map<Integer, String> list = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), num = 0, idx = 0, find;
		String flag = "", name = "";
		
		for (int i = 0; i < n; i++) {
			flag = sc.next(); num = sc.nextInt(); name = sc.next();
			switch(flag) {
			case "I":
				if (nums[num] == 0) {
					nums[num] = 1;
					list.put(num, name);
				}
				break;
			case "D":
				if (nums[num] != 0) {
					nums[num] = 0;
					list.remove(num);
				}
				break;
			}
		}
		unums = new int[list.size()];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				unums[idx++] = i;
			}
		}
		for (int i = 0; i < 5; i++) {
			find = sc.nextInt();
			System.out.println(unums[find - 1] + " " + list.get(unums[find - 1]));
		}
	}
}
