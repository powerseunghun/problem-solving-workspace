package LettCode.Hundred.Medium;

public class P11ContainerWithMostWater {
    static int maxArea(int[] height) {
    	int s = 0, e = height.length-1, max = 0;
    	while (s < e) {
    		max = Math.max((e-s) * Math.min(height[s], height[e]), max);
    		if (height[s] <= height[e]) s++;
    		else e--;
    	}
    	return max;
    }
	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(height));
	}
}
