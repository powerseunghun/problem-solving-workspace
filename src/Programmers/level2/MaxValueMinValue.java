package Programmers.level2;

import java.util.StringTokenizer;

public class MaxValueMinValue {
	public String solution(String s) {
		StringTokenizer st = new StringTokenizer(s);
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, val = 0;
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			max = Math.max(max, val);
			min = Math.min(min, val);
		}
		
        return min + " " + max;
    }
	public static void main(String[] args) {
		
	}
}
