class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int maxSum = n * (n + 1) / 2;
        int elementSum = 0;
        for ( int i = 0; i < n; i++){
            elementSum = elementSum + nums[i];
        }
        return maxSum - elementSum;
    }
}
