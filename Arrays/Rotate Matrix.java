/* You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note that if you end up using an additional array, you will only receive partial score.
*/

public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
	    int length=a.size()-1;
	    for(int i=0;i<=(length)/2;i++){
            for(int j=i;j<length-i;j++){
                int p=a.get(i).get(j);
                int q=a.get(j).get(length-i);
                int r=a.get(length-i).get(length-j);
                int s=a.get(length-j).get(i);
                a.get(i).set(j,s);
                a.get(j).set(length-i,p);
                a.get(length-i).set(length-j,q);
                a.get(length-j).set(i,r);
            }
	    }
	}
}
