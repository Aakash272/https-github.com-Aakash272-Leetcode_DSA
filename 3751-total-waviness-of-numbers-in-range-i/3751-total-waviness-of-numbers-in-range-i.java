class Solution {

    public int res(String a){
        int sum=0;
    for(int i=1;i<a.length()-1;i++){
      int m=a.charAt(i-1)-'0';
      int b=a.charAt(i)-'0';
      int c=a.charAt(i+1)-'0';
      if(m<b && b>c || b<m && b<c){
        sum++;
      }
    }
    return sum;
    }
    public int totalWaviness(int num1, int num2) {
int result=0;
    for(int i=num1;i<=num2;i++){
        String re=String.valueOf(i);
       int r=res(re);
       result+=r;
    }  
    return result;  
    }
}