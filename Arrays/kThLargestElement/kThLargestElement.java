package kThLargestElement;

import java.util.PriorityQueue;

public class kThLargestElement{

public static int findKthLargest(int[] nums, int k) {

        PriorityQueue <Integer> minHeap = new PriorityQueue<>();
        int n = nums.length;
        // let nums = [ ]3,2,1,5,6,4 ] and if k = 2 Max second is 5

        for ( int i =0; i < n ; i ++){
            minHeap.add(nums[i]);
            // Here the elements of the array are being added to the priority queue

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }    
        return minHeap.peek();     
        
}

    public static void  main(String[] args) {
        int [] nums = {1, 3, 8, 9, 4, 7, 6};
        System.out.println(kThLargestElement.findKthLargest(nums , 3));
        int [] array = {1, 3, 8, 9, 4, 7, 6 , 2 , 3 , 4 , 6 , 7 , 8};
        System.out.println(kThLargestElement.findKthLargest(array , 6));
    }
}