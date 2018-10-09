//Given a non-negative number represented as an array of digits,

//add 1 to the number ( increment the number represented by the digits ).

//The digits are stored such that the most significant digit is at the head of the list.

//Example:

//If the vector has [1, 2, 3]

//the returned vector should be [1, 2, 4]

//as 123 + 1 = 124.

public class Solution {
    public int[] plusOne(int[] A) {
        int n=A.length;
        if(A[n-1]!=9){
            A[n-1]=A[n-1]+1;
            return trim(A);
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(A[i]==9){
                    A[i]=0;
                }
                else{
                    A[i]=A[i]+1;
                    return trim(A);
                }
            }
        }
       if(A[0]==0){
            int[] t=new int [A.length+1];
            t[0]=1;
            return t;
        }
        else{
            return A;
        }
    }
    public int[] trim(int[] A){
        int count=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                count++;
            }
            else{
                break;
            }
        }
        int[] c=new int[A.length-count];
        for(int i=0;i<c.length;i++){
            c[i]=A[i+count];
        }
        return c;
    }
}