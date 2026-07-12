class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;

        int ans[]=new int[n];
    for(int i=0;i<n;i++){
ans[i]=arr[i];
    }
        Arrays.sort(arr);
        int count=1;
        HashMap<Integer,Integer> ap=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!ap.containsKey(arr[i])){
           ap.put(arr[i],count);
            count++;
            }
     
        }
           int result[]=new int[n];
        for(int i=0;i<n;i++){
            result[i]=ap.get(ans[i]);
        }
        return result;
    }
}