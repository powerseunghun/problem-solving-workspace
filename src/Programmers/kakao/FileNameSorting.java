package Programmers.kakao;

import java.util.Arrays;
import java.util.Comparator;

public class FileNameSorting {
	static int getHeadIdx(String str) {
		int idx = 0;
		while (!(str.charAt(idx) >= '0' && str.charAt(idx) <= '9')) {
			idx++;
		}
		return idx;
	}
	static int getNumber(int headIdx, String str) {
		String tmp = "";
		
		for (int i = headIdx; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				tmp += str.charAt(i);
				continue;
			}
			break;
		}
		return Integer.parseInt(tmp);
	}
	static String[] solution(String[] files) {
        String[] answer = null;
        Arrays.sort(files, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				o1 = o1.toUpperCase();
				o2 = o2.toUpperCase();
				int headIdx1 = getHeadIdx(o1);
				int headIdx2 = getHeadIdx(o2);
				String str1 = o1.substring(0, headIdx1);
				String str2 = o2.substring(0, headIdx2);
				
				if (str1.equals(str2)) {
					return getNumber(headIdx1, o1) - getNumber(headIdx2, o2);
				}
				return str1.compareTo(str2);
			}
		});
        answer = files.clone();
        
        return answer;
    }
	public static void main(String[] args) {
//		String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		String[] files = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
		String str = null;
		String[] answer = solution(files);
		
		for (String ans : answer) {
			System.out.println(ans);
		}
//		for (int i = 0, head = 0; i < files.length; i++) {
//			head = getHeadIdx(files[i]);
//			str = files[i].substring(0, head);
//			System.out.println(getNumber(head, files[i]));
//		}
		
		
		
//		for (int i = 0; i < files.length; i++) {
//			System.out.println(files[i]);
//		}
		
		
		
//		String str = "foo010bar020";
//		int headIdx = getHeadIdx(str);
//		System.out.println(str.substring(0, headIdx));
//		System.out.println(getNumber(headIdx, str));
		
	}
}
