class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        for(int i=0; i<nums.length; i++)
        {
            if((i+1)!=nums[i]){
                k= i+1;
            }
        }
        
       
        return k;
    }
}