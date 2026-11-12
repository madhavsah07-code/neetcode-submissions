class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> perv = new ArrayList<>();


        for(int i = 0;i<numRows;i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 0;j<perv.size()-1;j++){
                int sum = perv.get(j) +perv.get(j+1);
                curr.add(sum);
            }
            if(i>0) curr.add(1);
            al.add(curr);
            perv = curr;

        }
        return al;
    }
}