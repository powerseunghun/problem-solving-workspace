package Programmers.kakao;

import java.util.ArrayList;
import java.util.List;

public class GroupPhoto {
	static boolean[] check = new boolean[8];
	static String[] arr = {"A", "C", "F", "J", "M", "N", "R", "T"};
	static List<String> possibleArr = new ArrayList<>();
	static void dfs(int n, int d, String str) {
		if (d >= n) {
			possibleArr.add(str);
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (!check[i]) {
				check[i] = true;
				dfs(n, d+1, str + arr[i]);
				check[i] = false;
			}
		}
	}
	static int solution(int n, String[] data) {
        int answer = 0, interval = 0, need = 0;
        boolean flag = false;
        dfs(8, 0, "");
        
        for (int i = 0; i < possibleArr.size(); i++) {
        	String str = possibleArr.get(i);
        	flag = false;
        	// condition check if all condition true = one count
        	for (int j = 0, f1 = 0, f2 = 0, start = 0, end = 0; j < data.length; j++) {
        		f1 = str.indexOf(data[j].charAt(0));
        		f2 = str.indexOf(data[j].charAt(2));
        		start = Math.min(f1, f2)+1;
        		end = Math.max(f1, f2);
        		interval = str.substring(start, end).length();
        		need = data[j].charAt(4) - '0';
        		switch(data[j].charAt(3)) {
        		case '=':
        			if (interval == need) flag = true;
        			else flag = false;
        			break;
        		case '<':
        			if (interval < need) flag = true;
        			else flag = false;
        			break;
        		case '>':
        			if (interval > need) flag = true;
        			else flag = false;
        			break;
        		}
        		if(!flag) break;
        	}
        	if (flag) answer++;
		}
        return answer;
    }
	public static void main(String[] args) {
		String[] data = {"N~F=0", "R~T>2"};
//		String[] data = {"M~C<2", "C~M>1"};
		int n = 2;
		System.out.println(solution(n, data));
	}
}
