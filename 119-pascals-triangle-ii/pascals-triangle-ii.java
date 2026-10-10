class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        long prev =1;
        for(int i = 1;i<rowIndex;i++){
            long next = prev * (rowIndex - i + 1);
            next /= i;
            row.add((int) next);
            prev = next;
        }
        if(rowIndex>0)row.add(1);
        return row;

    }
}