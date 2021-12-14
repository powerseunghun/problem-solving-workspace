package Programmers.kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Tuple {
	static String[] splitProcess(String s) {
		String[] splits = s.split("},");
        for (int i = 0; i < splits.length; i++) {
        	splits[i] = splits[i].replace("{", "").replace("}", "");
        }
        Arrays.sort(splits, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
        
        return splits;
	}
	static int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        String[] sp = splitProcess(s);
        int[] answer = new int[sp.length];
        StringTokenizer st = null;
        
        for (int i = 0, val = 0; i < sp.length; i++) {
        	st = new StringTokenizer(sp[i], ",");
        	if (i == 0) {
        		val = Integer.parseInt(st.nextToken());
        		list.add(val);
        		continue;
        	}
        	
        	while (st.hasMoreTokens()) {
        		val = Integer.parseInt(st.nextToken());
        		if (!list.contains(val)) {
        			list.add(val);
        			break;
        		}
        	}
        }
        list.forEach(value -> {answer[list.indexOf(value)] = value;});
        return answer;
    }
	public static void main(String[] args) {
//		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
		int[] ans = solution(s);
		for (int el : ans) {
			System.out.println(el);
		}
	}
}
