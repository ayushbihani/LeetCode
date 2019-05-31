/**
 * Reverse String
 * @link https://leetcode.com/problems/reverse-string/
 */
class Solution {
    public void reverseString(char[] s) {
        reverse(s,0);
    }
    
    public void reverse(char[] s, int i){
        if(i==s.length/2)
            return;
        char temp = s[i];
        s[i]=s[s.length-i-1];
        s[s.length-i-1] = temp;
        reverse(s,++i);
        return;
    }
}