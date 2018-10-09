/*Given numRows, generate the first numRows of Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]
*/
public class Solution {
    static ArrayList<ArrayList<Integer>> res;
    public ArrayList<ArrayList<Integer>> solve(int n) {
        res=new ArrayList<ArrayList<Integer>>();
        constr(1,n);
        return res;
    }
    public void constr(int ind,int n){
        if(ind>n){
            return;
        }
        if(ind==1){
            ArrayList<Integer> sub=new ArrayList<Integer>();
            sub.add(1);
            res.add(new ArrayList<Integer>(sub));
        }
        else{
            ArrayList<Integer> sub=new ArrayList<Integer>();
            for(int i=0;i<=res.get(ind-2).size();i++){
                if(i==0||i==(res.get(ind-2).size())){
                    sub.add(1);
                }
                else{
                    sub.add(res.get(ind-2).get(i)+res.get(ind-2).get(i-1));
                }
            }
            res.add(new ArrayList<Integer>(sub));
        }
        constr(ind+1,n);
    }
}
