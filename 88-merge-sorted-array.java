class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] resultArray = new int[nums1.length];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < m && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                resultArray[k++] = nums1[i++];
            } else {
                resultArray[k++] = nums2[j++];   
            }
        }
        
        while (i < m) {
            resultArray[k++] = nums1[i++];
        }
        
        while (j < nums2.length) {
            resultArray[k++] = nums2[j++];
        }
        
        for (int l = 0; l < resultArray.length; l++) {
            nums1[l] = resultArray[l];
        }
    }
}
