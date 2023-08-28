package searchDeleteInsert;

public class searchArray {
    public static void main(String[] args) {
        int[] A = { 1,2,3,4,5,6,7,8,9 };
        int N = A.length;
        int key = 7;
        int position = searchArray1(A,N,key);
        if(position == -1){
            System.out.println("Element ios not found");
        }else{
            System.out.println(key);
        }
    }
    static int searchArray1(int[] A, int N , int key ){
        for ( int i =0 ; i < N ; i ++){
            if(A[i]== A[key]){
                return A[i];
            }
        }
        return -1;
    }
}
