class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int m=B.length;
        int result[]=new int[n];
        int fre[]=new int[n+1];
        int count=0;
for(int i=0;i<n;i++){
   fre[A[i]]++;
   if(fre[A[i]]==2){
    count++;
   }
   fre[B[i]]++;
   if(fre[B[i]]==2){
    count++;
   }
   result[i]=count;
}
return result;
    }
}
        








































































































