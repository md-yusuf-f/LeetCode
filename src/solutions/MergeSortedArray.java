package solutions;

import java.util.Arrays;


public class MergeSortedArray {

    /**
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
     * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergedArray = Arrays.copyOf(nums1, m + n);

        int i = 1;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            mergedArray[k++] = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
        }

        while (i < m) {
            mergedArray[k++] = nums1[i++];
        }

        while (j < n) {
            mergedArray[k++] = nums2[j++];
        }

        System.arraycopy(mergedArray, 0, nums1, 0, m + n);
    }
    public static void main(String[] args) {

        // Test Case 1
        int[] nums1Case1 = {1, 2, 3, 0, 0, 0};
        int mCase1 = 3;
        int[] nums2Case1 = {2, 5, 6};
        int nCase1 = 3;
        merge(nums1Case1, mCase1, nums2Case1, nCase1);
        System.out.println("Merged Array Case 1: " + Arrays.toString(nums1Case1));

        // Test Case 2
        int[] nums1Case2 = {1, 2, 3, 0, 0, 0};
        int mCase2 = 3;
        int[] nums2Case2 = {4, 5, 6};
        int nCase2 = 3;
        merge(nums1Case2, mCase2, nums2Case2, nCase2);
        System.out.println("Merged Array Case 2: " + Arrays.toString(nums1Case2));

        // Test Case 3
        int[] nums1Case3 = {4, 5, 6, 0, 0, 0};
        int mCase3 = 3;
        int[] nums2Case3 = {1, 2, 3};
        int nCase3 = 3;
        merge(nums1Case3, mCase3, nums2Case3, nCase3);
        System.out.println("Merged Array Case 3: " + Arrays.toString(nums1Case3));

        // Test Case 4 (Different Array Sizes)
        int[] nums1Case4 = {7, 8, 9, 0, 0, 0, 0, 0, 0};
        int mCase4 = 3;
        int[] nums2Case4 = {1, 2, 3, 4, 5, 6};
        int nCase4 = 6;
        merge(nums1Case4, mCase4, nums2Case4, nCase4);
        System.out.println("Merged Array Case 4: " + Arrays.toString(nums1Case4));
    }

}
