class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        long sum = 0;
        while(low<high){
            sum += nums[high];
            sum -= nums[low];
            low++;
            high--;
        }
        if (low == high) {
            sum += nums[low]; 
        }

        return sum;
    }
}