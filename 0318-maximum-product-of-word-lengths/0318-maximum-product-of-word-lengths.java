class Solution {
public boolean helper(String a, String b) {
    int[] arr = new int[26];
    for (int i = 0; i < a.length(); i++) {
        arr[a.charAt(i) - 'a'] = 1;
    }

    for (int j = 0; j < b.length(); j++) {
        if (arr[b.charAt(j) - 'a'] == 1) {
            return false; 
        }
    }

    return true;
}
    public int maxProduct(String[] words) {
        int n=words.length;
        int max=0;
   for(int i=0;i<n-1;i++){
    String a=words[i];
    for(int j=i+1;j<n;j++){
    String b=words[j];
    if(helper(a,b)){
        max=Math.max(max,a.length()*b.length());
    }
    }
   }
   return max;
    }
}