class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),2);
            }
            else map.put(s.charAt(i),1);
        }

        for(int i=0;i<s.length();i++){
            if(1==map.get(s.charAt(i))){
                return i;
            }
        }
    return -1;
    }
    
}