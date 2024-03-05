class Solution {
    public int[] twoSum(int[] numbers, int target) {
         Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            int k = target-numbers[i];
            
            if(map.containsKey(k)){
                 return new int[] { map.get(k), i+1 };
            }else{
                map.put(numbers[i],i+1);
            }
            
        }
        return null; 
    }
}