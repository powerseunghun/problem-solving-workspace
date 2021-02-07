package Programmers.level1;

public class StringDescending2 {
	public long solution(long n) {
		long answer = 0;
		long[] count = new long[10];
		String str = "";
		
		while (n != 0) {
			count[(int) (n % 10)]++;
			n /= 10;
		}
		for (int i = 9; i >= 0; i--) {
			if (count[i] != 0) {
				for (int j = 0; j < count[i]; j++) {
					str += i + "";
				}
			}
		}
		answer = Long.parseLong(str);
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(new StringDescending2().solution(118372));
	}
}
