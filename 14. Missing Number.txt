class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++) {
            res += nums[i];
        }
        int n = nums.length+1;
        return (n*(n-1)/2)-res;
    }
}