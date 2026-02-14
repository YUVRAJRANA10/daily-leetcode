import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            
            List<Integer> row = new ArrayList<>();

            // First element is always 1
            row.add(1);

            // Middle elements
            for (int j = 1; j < i; j++) {
                int val = result.get(i - 1).get(j - 1) 
                        + result.get(i - 1).get(j);
                row.add(val);
            }

            // Last element (if row > 0)
            if (i > 0) {
                row.add(1);
            }

            result.add(row);
        }

        return result;
    }
}
