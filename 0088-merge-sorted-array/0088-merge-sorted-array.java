import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] ans = new int[m + n];

        // Copy nums1 elements
        for (int i = 0; i < m; i++) {
            ans[i] = nums1[i];
        }

        // Copy nums2 elements
        for (int j = 0; j < n; j++) {
            ans[m + j] = nums2[j];
        }

        // Sort the merged array
        Arrays.sort(ans);

        // Copy back to nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = ans[i];
        }
    }
}