class Solution {
    public int bitwiseComplement(int n) {
      String res=Integer.toBinaryString(n);
      StringBuilder ans=new StringBuilder();
      for(int i=0;i<res.length();i++){
     if(res.charAt(i)=='0'){
        ans.append('1');
     }
     else{
        ans.append('0');
     }
      }
      String a=ans.toString();
      int b=Integer.parseInt(a,2);
      return b;
    }
}