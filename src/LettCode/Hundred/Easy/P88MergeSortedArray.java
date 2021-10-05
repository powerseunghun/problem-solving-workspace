package LettCode.Hundred.Easy;

public class P88MergeSortedArray {
	static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m+n];
        int idx1 = 0, idx2 = 0, idx = 0;
        while (m != 0 && n != 0) {
            if (nums1[idx1] <= nums2[idx2]) {
                tmp[idx++] = nums1[idx1++];
                m--;
            }
            else {
                tmp[idx++] = nums2[idx2++];
                n--;
            }
        }
        while (m != 0) {
            tmp[idx++] = nums1[idx1++];
            m--;
        }
        while (n != 0) {
            tmp[idx++] = nums2[idx2++];
            n--;
        }
        
        for (int i = 0; i < tmp.length; i++) {
            nums1[i] = tmp[i];
        }
    }
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
		int m = 3, n = 3;
		merge(nums1, m, nums2, n);
		for (int el : nums1) {
			System.out.print(el + " ");
		}
	}
}
