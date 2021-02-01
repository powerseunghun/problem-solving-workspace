package programmers;

public class GetDay {
	public String solution(int a, int b) {
		int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] d = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int sum = 0;
		for (int i = 1; i < a; i++) {
			sum += days[i - 1];
		}
		sum += (b - 1);
		
		return d[sum % 7];
	}
	public static void main(String[] args) {
		System.out.println(new GetDay().solution(5, 24));
	}
}
