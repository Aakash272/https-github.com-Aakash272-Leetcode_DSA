class Solution {
    public int minOperations(int n) {

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(2*i)+1;
        }
        int l=0;
        int r=n-1;
        int result=0;
        if(n%2==1){
            int mid=(l+r)/2;
 result=mid*(mid+1);
        }
        else{
        int mid =(l+r)/2;
            result=(mid+1)*(mid+1);
        }
        return result;
    }
}