class Solution {
    public boolean wordPattern(String pattern, String s) {
      int n=pattern.length();
      String str[]=s.split("\\s");
      int m=str.length;
     if(n!=m){
        return false;
     }
      HashMap<Character,String> ap=new HashMap<>();
      HashMap<String,Character> rp=new HashMap<>();
      for(int i=0;i<n;i++){
        char r=pattern.charAt(i);
        String a=str[i];
        if(ap.containsKey(r) && !ap.get(r).equals(a)){
            return false;
        }
        else if(rp.containsKey(a) && !rp.get(a).equals(r)){
            return false;
        }
         ap.put(r,a);
         rp.put(a,r);
      }
    return true;
    }
}