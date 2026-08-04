class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int min = 100;
        int max = 0;
        boolean[] contains = new boolean[101];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max) max = nums[i];

            if(nums[i]<min) min = nums[i];
            contains[nums[i]] = true;
        }
        for(int i = min;i<=max;i++){
            if(!contains[i]) res.add(i);

        }
        return res;
    }
    
    
}