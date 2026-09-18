class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Long,Integer> presum = new HashMap<>();
        long sum = 0;
        int count = 0;
        presum.put(0L,1);

        for(int i = 0;i<nums.length;i++){
            sum += nums[i];

            if(presum.containsKey(sum-k)) count += presum.get(sum-k);

            presum.put(sum,presum.getOrDefault(sum,0)+1);
        }
        return count;
    }
}