class Solution {
    public int[] sortByBits(int[] arr) {
 return Arrays.stream(arr).boxed().sorted((a, b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a - b : Integer.bitCount(a) - Integer.bitCount(b)).mapToInt(Integer::intValue).toArray();


    }
    //         Integer[] result= new Integer[n];
    // for(int i=0;i<n;i++){
    //     result[i]=arr[i];
    // } 
    // Arrays.sort(result,(a,b)->Integer.compare(Integer.bitCount(a),Integer.bitCount(b)));
    // int []ans=new int[n];
    // int count=0;
    // for(int i=0;i<n;i++){
    //     if(Integer.bitCount(result[i])==1){
    //         count++;
    //     }
    //     ans[i]=result[i];
    // }
    // if(count==n){
    //  Arrays.sort(ans);
    //  return ans;
    // }
    // return ans;
}