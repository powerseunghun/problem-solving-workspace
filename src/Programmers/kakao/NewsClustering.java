package Programmers.kakao;

import java.util.ArrayList;

public class NewsClustering {
	static ArrayList<String> makeMultiSet(String str) {
		ArrayList<String> list = new ArrayList<>();
		str = str.toUpperCase();
		String tmp = null;
		for (int i = 0; i < str.length()-1; i++) {
			tmp = str.substring(i, i+2);
			if (!(tmp.charAt(0) >= 'A' && tmp.charAt(0) <= 'Z')) continue;
			if (!(tmp.charAt(1) >= 'A' && tmp.charAt(1) <= 'Z')) continue;
			list.add(str.substring(i, i+2));
		}
		return list;
	}
	static int solution(String str1, String str2) {
        double answer = 0;
        ArrayList<String> list1 = makeMultiSet(str1);
        ArrayList<String> list2 = makeMultiSet(str2);
        
        if (list1.size() == 0 && list2.size() == 0) return 65536;
        
        int n1 = list1.size(), n2 = list2.size(), n3 = 0;
        for (int i = 0; i < list2.size(); i++) {
        	if (list1.contains(list2.get(i))) {
        		list1.remove(list2.get(i));
        		n3++;
        	}
        }
        answer = (double)n3 / (n1+n2-n3);
        
        return (int)(answer * 65536);
    }
	public static void main(String[] args) {
		String str1 = "E=M*C^2", str2 = "e=m*c^2";
		
		System.out.println(solution(str1, str2));
	}
}
