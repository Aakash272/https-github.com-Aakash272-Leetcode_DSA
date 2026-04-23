class Solution {

    public boolean helper(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        int l=0;
        int r=0;
        int count=0;
        while(l<a.length() && r<b.length()){
            if(a.charAt(l)!=b.charAt(r)){
                count++;
            }
            l++;
            r++;
        }
        if(count<=2){
            return true;
        }
        return false;
    }
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int n=queries.length;
        int m=dictionary.length;
        List<String> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            String b=queries[i];
            for(int j=0;j<m;j++){
                String a=dictionary[j];
                if(helper(b,a)){
                    res.add(b);
                    break;
                }
            }
        }
        return res;
    }
}