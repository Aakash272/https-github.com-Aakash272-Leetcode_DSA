class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        if(n==2 || n==1 || n==3) return s;
String result="";

if(n%2!=0){
       TreeMap<Character,Integer> res=new TreeMap<>();
       for(int i=0;i<n/2;i++){

        res.put(s.charAt(i),res.getOrDefault(s.charAt(i),0)+1);
       }
StringBuilder ap=new StringBuilder();
  for(Map.Entry<Character,Integer> x:res.entrySet()){
    for(int i=0;i<x.getValue();i++){
   ap.append(x.getKey());
    }
  }
  char c=s.charAt(n/2);
  String K=ap.toString()+c;
  String L=ap.reverse().toString();
  result=K+L;
}
else{
       TreeMap<Character,Integer> res=new TreeMap<>();
       for(int i=0;i<n/2;i++){
        res.put(s.charAt(i),res.getOrDefault(s.charAt(i),0)+1);
       }
       StringBuilder ap=new StringBuilder();
  for(Map.Entry<Character,Integer> x:res.entrySet()){
    for(int i=0;i<x.getValue();i++){
   ap.append(x.getKey());
    }
  }
   String K=ap.toString();
  String L=ap.reverse().toString();
  result=K+L;
}
return result;
    }
//     }       StringBuilder ans=new StringBuilder();
//        char r=' ';
//        for(Map.Entry<Character,Integer> x:res.entrySet()){
//         if(x.getValue()%2!=0 && x.getValue()>2){
//         r=x.getKey();
//         }
//         ans.append(x.getKey());
//     }
//     System.out.println(r);

//     String K="";
//     String L=" ";
//         System.out.println(L);
//     if(n%2!=0){
//      K=ans.toString()+String.valueOf(r);
//          System.out.println(K);
//     }
//     else{
//   K=ans.toString();
//     }
//     L=ans.reverse().toString();
//   return K+L;

}