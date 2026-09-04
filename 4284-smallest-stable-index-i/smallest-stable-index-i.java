class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] suffix = new int[n];
        int mini = Integer.MAX_VALUE;
        for(int i = n-1;i>=0;i--){
            mini = Math.min(mini,nums[i]);
            suffix[i] = mini;
        }
        int maxi = 0;
        for(int i = 0;i<n;i++){
            maxi = Math.max(maxi,nums[i]);
            int score = maxi - suffix[i];
            if(score<=k) return i;
        }
        return -1;
    }
}