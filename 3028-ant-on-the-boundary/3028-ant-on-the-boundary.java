class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum = 0;
        int count=0;
        for(int i : nums){
            sum = sum+i;
            
            if(sum==0){
              count++;  
            }
        }
        return count;
    }
}