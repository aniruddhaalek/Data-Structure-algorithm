/* Given a list of non negative integers, arrange them such that they form the largest number.

For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> a) {
ArrayList sArr = new ArrayList();
StringBuilder result = new StringBuilder();
StringBuilder s = new StringBuilder();
 
    for(int i=0; i<a.size(); i++){
        s=s.append(Integer.toString(a.get(i)));
        sArr.add(s);
        s = new StringBuilder();
    }
    
    Collections.sort(sArr, new Comparator<StringBuilder>(){
        @Override
       public int compare(StringBuilder x,StringBuilder y){
            StringBuilder xy=new StringBuilder();
            xy.append(x);
            xy.append(y);
            StringBuilder yx=new StringBuilder();
            yx.append(y);
            yx.append(x);
            if(xy.toString().compareTo(yx.toString())>0){
                return -1;
            }
            else if(xy.toString().compareTo(yx.toString())<0){
                return 1;
            }
            return 0;
        }
        
    });
    
    for(int i=0; i<sArr.size(); i++){
        
        result.append(sArr.get(i));
    }
    
    if(result.charAt(0) == '0')
        return "0";
    
    return result.toString();
}
}
