class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int sum;
        while(low< high){
            sum = nums[low]+nums[high];
            if(sum == target) {
                return new int[]{low + 1, high + 1};
            }
            else if (sum<target) low++;
            else high--;
        }
        return new int[]{-1, -1};
    }
}