class Solution {
    public int maxPoints(int[][] p) {
        int n = p.length;
        if (n <= 2) return n;
        int ans = 0;
        for(int i = 0;i<n;i++){
            HashMap<String,Integer> map = new HashMap<>();
            for(int j = i+1;j<n;j++){
                int dx = p[j][0] - p[i][0];
                int dy = p[j][1] - p[i][1];

                int g = gcd(dy,dx);
                dy /= g;
                dx /= g;
                if(dx<0){
                    dx = -dx;
                    dy = -dy;
                }
                if(dx == 0) dy=1;

                String slope = dy + "/" + dx; // coz if int 2/3 = 0, 1/3 = 0...
                map.put(slope,map.getOrDefault(slope,0)+1);

                ans = Math.max(ans , map.get(slope)+1);
            }
        }
        return ans;
    }
    int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return Math.abs(a);
}
}