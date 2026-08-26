class Solution {
    public boolean checkDivisibility(int n) {
        int a = n;
        int sum = 0;
        int add = 0;
        int prod = 1;
        while(n>0){
            int rem = n%10;
            add += rem;
            prod *= rem;
            n = n/10;
        }
        sum = add + prod;
        if(a % sum == 0) return true;
        return false;
    }
}