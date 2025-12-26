class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
int count=0;
        for(int i=0;i<n;i++){
            if(customers.charAt(i)=='Y'){
                count++;
            }
        }
int no=0;
int result=0;
int prepen=count;
for(int i=0;i<n;i++){
   if(customers.charAt(i)=='Y'){
    count--;
   } 
   else if(customers.charAt(i)=='N'){
    no++;
   }
int res=count+no;
if(res<prepen){
    prepen=res;
    result=i+1;
}
}
return result;
    }
}