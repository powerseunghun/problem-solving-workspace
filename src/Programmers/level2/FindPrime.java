package Programmers.level2;

public class FindPrime {
	boolean check(int i, int nums[]) {
		boolean flag = true;
		while (i != 0) {
			nums[i % 10]--;
			if (nums[i % 10] < 0) {
				flag = false;
				break;
			}
			i /= 10;
		}
		return flag;
	}
	public int solution(String numbers) {
        int answer = 0, count = 0;
        int[] nums = new int[10];
        boolean flag = true;
        StringBuffer number = new StringBuffer(numbers);
        
        for (int i = 0; i < number.length() - 1; i++) {
        	for (int j = 0; j < number.length(); j++) {
        		if (number.charAt(i) <= number.charAt(j)) {
        			char tmp = number.charAt(i);
        			number.setCharAt(i, number.charAt(j));
        			number.setCharAt(j, tmp);
        		}
        	}
        }
        
        for (int i = 2; i < Integer.parseInt(number.toString()); i++) {
        	count = 0;
        	for (int j = 1; j <= i; j++) {
        		if (i % j == 0) count++;
        	}
        	
        	if (count == 2) {
        		for (int k = 0; k < number.length(); k++) {
        			nums[number.charAt(k) - '0']++;
        		}
        		int tmp = i;
        		if (this.check(tmp, nums)) answer++;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(new FindPrime().solution("17"));
	}
}

