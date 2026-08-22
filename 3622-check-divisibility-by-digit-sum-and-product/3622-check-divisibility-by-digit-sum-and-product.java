class Solution {

boolean helper(int a){
    int og=a;
    int sum=0;
    int prd=1;
    while(og!=0){
        int b=og%10;
        sum=sum+b;
        prd*=b;
        og/=10;
    }

    int res=sum+prd;
    if(a%res==0){
        return true;
    }
    return false;
}
    public boolean checkDivisibility(int n) {

      return helper(n);  
    }
}