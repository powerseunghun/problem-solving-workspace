package LettCode.Hundred.Medium;

import java.util.ArrayList;
import java.util.List;

public class P17LetterCombinationsOfPhoneNumber {
    static List<String> list = new ArrayList<>();
    static char[][] letter = {
        {},
        {},
        {'a', 'b', 'c'},
        {'d', 'e', 'f'},
        {'g', 'h', 'i'},
        {'j', 'k', 'l'},
        {'m', 'n', 'o'},
        {'p', 'q', 'r', 's'},
		{'t', 'u', 'v'},
		{'w', 'x', 'y', 'z'},
	};
    static char[] arr = null;
    	static void dfs(int n, int d, String digits) {
		if (d >= n) {
			String str = "";
			for (int i = 0; i < arr.length; i++) {
				str += arr[i];
			}
			list.add(str);
			return;
		}
		int idx = digits.charAt(d)-'0';
		for (int i = 0; i < letter[idx].length; i++) {
			arr[d] = letter[idx][i];
			dfs(n, d+1, digits);
		}
	}
    static List<String> letterCombinations(String digits) {
        if (digits.equals("")) return new ArrayList<>();
        arr = new char[digits.length()];
        list.clear();
        dfs(digits.length(), 0, digits);
        
        return list;
    }
	public static void main(String[] args) {
		arr = new char[1];
		list.clear();
		dfs(arr.length, 0, "2");
		List<String> printList = letterCombinations("");
		
		for (int i = 0; i < printList.size(); i++) {
			System.out.print(printList.get(i) + " ");
		}
		System.out.println();
	}
}
