class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
   
      int l=0;
      List<String> res=new ArrayList<>();
      HashMap<Character,Integer> hp=new HashMap<>();
      for(int i=0;i<n;i++){
        hp.put(s.charAt(i),hp.getOrDefault(s.charAt(i),0)+1);
        while(hp.getOrDefault('1', 0) >= k){
               String str=s.substring(l,i+1);
            res.add(str);
            char a=s.charAt(l);
            hp.put(a,hp.get(a)-1);
            if(hp.get(a)==0){
                hp.remove(a);
            }
            l++;
        }
      }
      if(res.size()==0) return "";
      String r=res.get(0);
      for(int i=1;i<res.size();i++){
        if(r.length()>res.get(i).length() || (r.length()==res.get(i).length() && r.compareTo(res.get(i))>0)){
            r=res.get(i);
        }
      }
return r;

    
    }
}