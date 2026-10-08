class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;

        // 1. Find pivot
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                idx = i;
                break;
            }
        }

        // Already the largest permutation
        if(idx == -1){
            reverse(nums, 0);
            return;
        }

        // 2. Find number just greater than pivot
        for(int i = n - 1; i > idx; i--){
            if(nums[i] > nums[idx]){
                swap(nums, i, idx);
                break;
            }
        }

        // 3. Make suffix smallest
        reverse(nums, idx + 1);
    }

    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length - 1;

        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}