class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int n = nums.length;
        boolean nonzero = false;
        for(int num : nums){
            xor ^= num;
            if(num != 0) nonzero = true; 
        }
        if(xor!=0) return n;
        if(nonzero) return n-1;
        
        return 0;

    }
}