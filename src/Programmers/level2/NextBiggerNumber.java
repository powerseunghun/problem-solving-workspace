package Programmers.level2;

public class NextBiggerNumber {
	static int solution(int n) {
		int baseCount = Integer.toBinaryString(n).replace("0", "").length();
		int answer = 0;
		
		while (true) {
			n++;
			if (Integer.toBinaryString(n).replace("0", "").length() == baseCount) {
				answer = n;
				break;
			}
		}
		return answer;
    }
	public static void main(String[] args) {
		int n = 78;
		System.out.println(solution(n));
	}
}
