class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> countmap = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            countmap.put(nums[i],countmap.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        int threshold = nums.length / 3;

        for(Map.Entry<Integer,Integer> entry :countmap.entrySet()){

            if(entry.getValue()>threshold) ans.add(entry.getKey());
        }
        return ans;
    }
}