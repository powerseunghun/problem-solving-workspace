package Programmers.level2;

public class StockPrice {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		int time = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			time = 0;
			for (int j = i + 1; j < prices.length; j++) {
				time++;
				if (prices[i] > prices[j]) break;
			}
			answer[i] = time;
		}
		return answer;
	}
	public static void main(String[] args) {
	}
}
