package Programmers.level2;

public class UnderDiffTwoBit {
	static long getDiff(String str1, String str2) {
		int idx1 = str1.length()-1, idx2 = str2.length()-1, count = 0;
		while (idx1 >= 0 && idx2 >= 0) {
			if (str1.charAt(idx1) != str2.charAt(idx2)) {
				count++;
			}
			idx1--;
			idx2--;
		}
		return count + Math.abs(str1.length()-str2.length());
	}
	static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        int weight = 0;
        String str1 = null, str2 = null;
		for (int i = 0; i < numbers.length; i++) {
			long base = numbers[i];
			weight = 1;
			while(true) {
				str1 = Long.toBinaryString(base);
				str2 = Long.toBinaryString(base + weight);
				if (getDiff(str1, str2) <= 2) {
					answer[i] = base + weight;
					break;
				}
				weight++;
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		long[] numbers = {2, 7}, answer = new long[numbers.length];
		answer = solution(numbers);
		for (long el : answer) {
			System.out.print(el + " ");
		}
		System.out.println();
	}
}
