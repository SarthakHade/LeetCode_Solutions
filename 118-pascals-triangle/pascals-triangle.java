import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans_list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ans_list.add(pascal(i));
        }
        return ans_list;
    }

    public List<Integer> pascal(int row) {
        long ans = 1; 
        List<Integer> ans_row = new ArrayList<>();
        
        ans_row.add((int) ans); 

        for (int i = 1; i < row; i++) {
            ans = ans * (row - i);
            ans = ans / i;
            ans_row.add((int) ans);
        }
        return ans_row;
    }
}
