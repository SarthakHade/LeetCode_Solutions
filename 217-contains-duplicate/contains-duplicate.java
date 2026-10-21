class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        if(nums.length<2) return false;

        for(int i : nums){
            if(set.contains(i)) return true;
            set.add(i);
        }
        return false;
        
    }
}