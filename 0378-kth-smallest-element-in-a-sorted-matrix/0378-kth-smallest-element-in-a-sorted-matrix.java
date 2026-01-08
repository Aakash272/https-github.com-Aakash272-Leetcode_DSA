class Solution {
    public int kthSmallest(int[][] matrix, int k) {

//      int  n=matrix.length;
//      int result=n;
//      for(int i=0;i<n;i++){
//    int l=0;
//    int h=n-1;
//    while(l<h){
//     int mid=l+(h-l)/2;
//     if(result<k){
//         break;
//     }

// if(natrix[i][mid])
//    }
//    result+=n;
//      }   
int n=matrix.length;
int arr[]=new int[n*n];
int m=0;
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
  arr[m++]=matrix[i][j];
    }
}
Arrays.sort(arr);
int result=0;
for(int i=0;i<arr.length;i++){
  if(i==k-1){
    result=arr[i];
    break;
  }
}
return result;
    }
}