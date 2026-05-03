class Solution {
    public boolean check(int a){
        boolean flag=true;
        if(a<=1){
            return false;
        }
for(int j=2;j<=Math.sqrt(a);j++){
    if(a%j==0){
flag=false;
    }
}
return flag;
    }

    public int rever(int a){

    int rev=0;
    while(a!=0){
        int b=a%10;
        rev=rev*10+b;
        a/=10;

    }
    System.out.println(rev);
    return rev;
    }
    public int sumOfPrimesInRange(int n) {
        
    int sum=rever(n);
    int result=0;
    for(int i=Math.min(n,sum);i<=Math.max(n,sum);i++){
        if(check(i)){
            System.out.println(i);
           result+=i;
        }
    }
    return result;
    }
}