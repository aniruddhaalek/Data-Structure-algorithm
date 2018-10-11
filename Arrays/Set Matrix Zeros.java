/* Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.

Do it in place.

Example

Given array A as

1 0 1
1 1 1 
1 1 1
On returning, the array A should be :

0 0 0
1 0 1
1 0 1
*/

public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    boolean colflag=false;
        boolean rowflag=false;
	    int m=a.size();
	    int n=a.get(0).size();
	     for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0&&a.get(i).get(j)==0){
                    colflag=true;
                }
                if(j==0&&a.get(i).get(j)==0){
                    rowflag=true;
                }
                if(a.get(i).get(j)==0){
                    a.get(i).set(0,0);
                    a.get(0).set(j,0);
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(a.get(0).get(j)==0||a.get(i).get(0)==0){
                    a.get(i).set(j,0);
                }
            }
        }
        if(colflag==true){
            for(int j=0;j<n;j++){
                a.get(0).set(j,0);
            }
        }
        if(rowflag==true){
            for(int i=0;i<m;i++){
                a.get(i).set(0,0);
            }
        }
	    
	}
}
