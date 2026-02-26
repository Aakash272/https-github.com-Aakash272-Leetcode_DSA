import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        int n=s.length();
       BigInteger res=new BigInteger(s,2);
        int count=0;
        while(res.compareTo(BigInteger.ONE)>0){
      if(res.mod(BigInteger.TWO).equals(BigInteger.ONE)){
        res = res.add(BigInteger.ONE);
      }
      else{
        res = res.divide(BigInteger.valueOf(2));
      }
            count++;
        }
        return count;
    }
}