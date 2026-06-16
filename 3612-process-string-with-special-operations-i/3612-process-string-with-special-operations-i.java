class Solution {
    public String processStr(String s) {
    int n=s.length();
    StringBuilder res=new StringBuilder();  
    for(int i=0;i<n;i++){
        if((int)s.charAt(i) >= 97  && (int)s.charAt(i)<=122 ){
          res.append(s.charAt(i));
        }
        else if(s.charAt(i)=='#'){
          res.append(res);
        }
        else if(s.charAt(i)=='%'){
            res.reverse();
        }
        else{
            if(res.length()>=1){
      res.deleteCharAt(res.length() - 1);
            }
       
        }
    }
    return res.toString();
    }
}