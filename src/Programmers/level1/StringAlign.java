package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StringAlign {
	class Comp implements Comparator<String> {
		private int n;
		public Comp(int n) {
			this.n = n;
		}
		
		@Override
		public int compare(String o1, String o2) {
			if (o1.charAt(n) == o2.charAt(n)) {
				return o1.compareTo(o2);
			}
			return (o1.charAt(this.n) + "").compareTo((o2.charAt(this.n) + ""));
		}
	}
	public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(strings, new Comp(n));
        for (int i = 0; i < strings.length; i++) {
        	answer[i] = strings[i];
        }
        return answer;
    }
	public static void main(String[] args) {
//		String[] strings = {"sun", "bed", "car"};
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		new StringAlign().solution(strings, n);
		
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + " ");
		}
	}
}
