package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        //Response array
        List<List<Integer>> target = new ArrayList<>();
        int n = nums.length;
        if( n==0 || nums.length <3){
            return target;
        }
        // SORT THE ARRAY
        Arrays.sort(nums);
        // -4,-1,-1,0,1,2

        for(int i = 0; i< n -2; i ++)
        {
            //remove duplicates 
            if(i ==0 || nums[i]!= nums[i-1])
            {
                //declare left and right pointers 
                int leftPointer = i+1;
                int rightPointer = n-1;

                //checking if the array is complete
                while (leftPointer<rightPointer){
                    if( nums[i] + nums[leftPointer] + nums[rightPointer]== 0){
                        //adding to the respose array 
                        target.add(Arrays.asList(nums[i] , nums[leftPointer] , nums[rightPointer]));
                        while(leftPointer < rightPointer && nums[leftPointer]== nums[leftPointer+1]){
                            leftPointer++;
                        }
                        while(leftPointer < rightPointer && nums[rightPointer]== nums[rightPointer-1]){
                            rightPointer--;
                        }
                        leftPointer++;
                        rightPointer--;
                    }  else if ( nums[i] + nums[leftPointer] + nums[rightPointer] < 0 ){
                        leftPointer++;
                    } else rightPointer--;
                }


            }


        }
        return new ArrayList <> (target);
    }
}
