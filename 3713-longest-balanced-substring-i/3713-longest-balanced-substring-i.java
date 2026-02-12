class Solution {
public boolean balance(int freq[]){
    int c=0;
    for(int i=0;i<26;i++){
        if(freq[i]==0) continue;
        if(c==0){
            c=freq[i];
        }
       else if(freq[i]!=c){
            return false;
        }
    }
return true;
}
    public int longestBalanced(String s) {
int n=s.length();
int max=0;
for(int i=0;i<n;i++){
    int freq[]=new int[26];
    for(int j=i;j<n;j++){
   freq[s.charAt(j)-'a']++;
   if(balance(freq)){
   max=Math.max(max,j-i+1);
     }
    }
}
return max;

    }
}