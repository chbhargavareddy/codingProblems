package containsDuplicate;

import java.util.HashMap;


public class containsDuplicate {
    class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap< Integer,Integer> value = new HashMap<>();
        for(int n: nums){
            if(value.containsKey(n) && value.get(n)>=1) {
                return true;
            }
            value.put(n,value.getOrDefault(n,0)+1);
        }
        return false;
    }
}
}
