class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> hp=new HashMap<>();
        int n=s.length();
        int l=0;
        int result=0;
        for(int i=0;i<n;i++){
            hp.put(s.charAt(i),hp.getOrDefault(s.charAt(i),0)+1);
           while(hp.get(s.charAt(i))>2){
      char c=s.charAt(l);
      hp.put(s.charAt(l),hp.get(s.charAt(l))-1);
      if(hp.get(s.charAt(l))==0){
        hp.remove(s.charAt(l));
      }
      l++;
           }
           result=Math.max(result,i-l+1);
        }

        if(hp.size()==0) return 0;
        // for(Map.Entry<Character,Integer> x:hp.entrySet()){
        //     result+=x.getValue();
        // }
        return result;
    }
}