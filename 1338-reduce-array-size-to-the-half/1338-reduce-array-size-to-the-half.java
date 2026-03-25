class Solution {
    public int minSetSize(int[] arr) {
       int n=arr.length;
       HashMap<Integer,Integer> ap=new HashMap<>();
       for(int i=0;i<n;i++){
        ap.put(arr[i],ap.getOrDefault(arr[i],0)+1);
       }
       int sum=0;
       int count=0;
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(Map.Entry<Integer,Integer> x:ap.entrySet()){
       pq.offer(x.getValue());
       } 
       for(int i=0;i<pq.size();i++){
        if(sum>=n/2){
return count;
        }
        sum+=pq.poll();
        count++;
       }
       return count;
    }
}