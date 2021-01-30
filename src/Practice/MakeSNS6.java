package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeSNS6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), femaleCount = 0, maleCount = 0;
		String name = "";
		String[] strs = null;
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		name = sc.next();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).split(",")[0].equals(name)) {
				strs = list.get(i).split(",");
				break;
			}
		}
		for (int i = 3; i < strs.length; i++) {
			for (int j = 0; j < list.size(); j++) {
				if (strs[i].equals(list.get(j).split(",")[0])) {
					if (list.get(j).split(",")[1].equals("F")) femaleCount++;
					else maleCount++;
				}
			}
		}
		
		System.out.println(maleCount);
		System.out.println(femaleCount);
	}
}
