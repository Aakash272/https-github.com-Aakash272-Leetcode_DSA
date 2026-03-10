class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        int m=queries.length;
for(int i=0;i<m;i++){
int l=queries[i][0];
int r=queries[i][1];
int k=queries[i][2];
int v=queries[i][3];
int idex=l;
while(idex<=r){
   nums[idex] = (int)((nums[idex] * 1L * v) % 1000000007);
    idex+=k;
}
}
int sum=nums[0];
for(int i=1;i<n;i++){
sum^=nums[i];
}
return sum;
    }
}