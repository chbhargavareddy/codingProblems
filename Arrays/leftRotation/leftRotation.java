package leftRotation;

import java.util.ArrayDeque;
import java.util.Deque;

public class leftRotation {
    public static void main(String[] args) {
        int[] A = { 1,2,3,4,5,6,7,8,9 }; // Declaring an Array
        int N = A.length; //Length of the array
        int d = 5;//rotion pointer
        leftArrayRotation(A,d,N);
        printArray(A,N);
        useCollectionDeque(A,5);
    }
    static void leftArrayRotation(int A[], int d ,int n){
        int[] temp = new int[n];
        int k = 0;
        for (int i = d ; i< n ;i++){
            temp[k]= A[i]; 
            k++;
        }
        for ( int i =0 ; i <d ; i++){
            temp[k]=A[i];
            k++;
        }
        for( int i =0 ; i < n ; i++){
            A[i]=temp[i];
        }
    }
    static void printArray(int A[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+ " ");
        }
    }
    static void useCollectionDeque(int A[],int d){
        Deque<Integer> deq = new ArrayDeque<>();
        for( int i : A ){
            deq.add(i);
        }
        for(int i =0 ; i < d ;i++){
            int temp = deq.remove();
            deq.addLast(temp);
        }
        System.out.println(deq);
    }
}
