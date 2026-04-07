class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
  int n=hand.length;
  PriorityQueue<Integer> pq=new PriorityQueue<>();
  for( int x:hand){
    pq.add(x);
  }
  while(!pq.isEmpty()){
    int first=pq.poll();
    for(int i=1;i<groupSize;i++){
    int b=first+i;
    if(!pq.remove(b)){
        return false;
    }
    }
  }
  return true;

    }
}