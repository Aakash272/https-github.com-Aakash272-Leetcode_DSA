class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        
        int n=s1.length();
        int m=s2.length();
      
        List<List<String>> res=new ArrayList<>();
        
        for(int i=0;i<n;i++){
         StringBuilder s=new StringBuilder();
         StringBuilder r=new StringBuilder();
    
             while (i < n && i < m && s1.charAt(i) != s2.charAt(i)) {

                s.append(s1.charAt(i));
                r.append(s2.charAt(i));
                i++;
            }
        
            if (s.length() > 0) {
                List<String> ans = new ArrayList<>();
                ans.add(s.toString());
                ans.add(r.toString());
                res.add(ans);
            }
        }
        return res;

    }
}