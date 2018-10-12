/*Given an index k, return the kth row of the Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Input : k = 3

Return : [1,3,3,1]
*/

public class Solution {
    public ArrayList<Integer> getRow(int n) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        int prev=1;
        int temp;
        for(int i=1;i<=n+1;i++){
            for(int j=1;j<i;j++){
                if(j==i-1){
                    arr.add(1);
                }
                else{
                    temp=arr.get(j);
                    arr.set(j,arr.get(j)+prev);
                    prev=temp;
                }
            }
            prev=1;
        }
        return arr;
    }
}
