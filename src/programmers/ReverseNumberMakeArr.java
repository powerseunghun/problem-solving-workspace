package programmers;

import java.util.ArrayList;

public class ReverseNumberMakeArr {
	public ArrayList<Integer> solution(long n) {
		StringBuffer s = new StringBuffer(String.valueOf(n)).reverse();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i) - 48);
		}
		return list;
	}
	
//	public int[] solution(int n) {
//		int[] answer = new int[(n + "").length()];
//		
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = n % 10;
//			n /= 10;
//		}
//		return answer;
//	}
	public static void main(String[] args) {
//		System.out.println(Arrays.toString(new ReverseNumberMakeArr().solution(12345)));
		System.out.println(new ReverseNumberMakeArr().solution(12345));
	}
}
