class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet <Integer> set = new HashSet<>();
        for(int num : nums){
            if(num%k == 0){
                set.add(num);
            }
        }

        int a = k;
        while(set.contains(a)){
            a += k; 
        }
        return a;
    }
}