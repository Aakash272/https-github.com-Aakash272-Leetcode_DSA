class Solution {
    public String reverseWords(String s) {
       int n=s.length();
       String str[]=s.trim().split("\\s+");
      List<String> ap=new ArrayList<>();
       for(int i=str.length-1;i>=0;i--){
          ap.add(str[i]);
       } 
       StringBuilder res=new StringBuilder();
       for(int i=0;i<ap.size();i++){
        res.append(ap.get(i));
        if(i<ap.size()-1){
           res.append(" ");
        }

       }
       return res.toString();
    }
}