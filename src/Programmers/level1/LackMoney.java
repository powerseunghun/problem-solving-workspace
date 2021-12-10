package Programmers.level1;

public class LackMoney {
	static long getSum(int n) {
		return (n * (2 + (n-1))) / 2;
	}
	static long solution(int price, int money, int count) {
        long sum = getSum(count);
        long res = money - (price * sum);
        return res > 0 ? 0 : Math.abs(res);
    }
	public static void main(String[] args) {
		int price = 3, money = 20, count = 4;
		System.out.println(solution(price, money, count));
	}
}
