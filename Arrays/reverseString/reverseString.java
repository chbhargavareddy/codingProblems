package reverseString;
public class reverseString {
    public static void main(String[] args) {
    int A[]={9,8,7,6,5,4,3};
    System.out.println("Initial Values of the Array are");
    print(A,6);
    reverse(A,0,6);
    System.out.println("The Reverse of the Array is");
    print(A,6);
}

static void reverse (int A[], int start,int end){
    int temp;
    while(start<end){
        temp = A[start];
        A[start]=A[end];
        A[end]=temp;
        start ++;
        end --;
    }
}
static void print(int A[],int size){
    for (int i = 0; i <=size; i++) {
        System.out.print(A[i]);
        System.out.println();
    }
}
}