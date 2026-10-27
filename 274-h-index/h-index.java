class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        
        for(int i = 0;i<n;i++){
            int ans = n-i;
            if(citations[i]>=ans){
                return ans; 
            }
        }
        return 0;
    }
}