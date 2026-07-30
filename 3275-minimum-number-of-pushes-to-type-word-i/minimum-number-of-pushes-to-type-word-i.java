class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int quo = n/8;

        return(4*quo*(quo+1)+((n%8)*(quo+1)));
    }
}