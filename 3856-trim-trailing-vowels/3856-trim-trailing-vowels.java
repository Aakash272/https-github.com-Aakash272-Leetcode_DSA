class Solution {
    public String trimTrailingVowels(String s) {
    int n=s.length();
    StringBuilder res=new StringBuilder(s);
    for(int i=n-1;i>=0;i--){
if ("aeiou".indexOf(s.charAt(i)) == -1) {
    return res.toString();
} else {
    res.deleteCharAt(i);
}
    }  
    return res.toString();  
    }
}