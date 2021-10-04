package LettCode.Hundred.Easy;

public class P7ReverseInteger {
	static int reverse(int x) {
		StringBuilder sb = new StringBuilder();
		if (x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE) return 0;
		if (x < 0) {
			x = Math.abs(x);
			sb.append("-");
		}
		
        while (x != 0) {
            sb.append(x % 10);
            x /= 10;
        }
        if (Long.parseLong(sb.toString()) <= Integer.MIN_VALUE || Long.parseLong(sb.toString()) >= Integer.MAX_VALUE) return 0;
        return Integer.parseInt(sb.toString());
    }
	public static void main(String[] args) {
		System.out.println(reverse(123));
	}
}
