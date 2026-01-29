class Solution {
    public boolean check(int arr[],int t){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==t){
                return true;
            }
            else if(arr[mid]<t){
                l=mid+1;
            }
            else{
              r=mid-1;  
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;

for(int i=0;i<n;i++){
    if(check(matrix[i],target)){
        return true;
    }
}
return false;
    }
}