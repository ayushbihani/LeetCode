
/** 
 * Valid Anagram
 * @link https://leetcode.com/problems/valid-anagram/
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        if(s.length()!=t.length())
            return false;
        if(s.length() == 0 && t.length()==0)
            return true;
        long a=(int)arr[0],b=(int)arr1[0];
        for(int i=1;i<arr.length;i++){
            a^=(int)arr[i];
        }
        for(int j=1;j<arr1.length;j++){
            b^=(int)arr1[j];
        }
        if(a==b)
            return true;
        return false;
    }
}