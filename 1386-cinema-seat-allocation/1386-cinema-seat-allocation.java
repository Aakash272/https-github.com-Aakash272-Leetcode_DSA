class Solution {
    // int helper( List<List<Integer>> ls ){
    //     for(i)
    // }
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int k=reservedSeats.length;
        int m=reservedSeats[0].length;
        // List<List<Integer>> ls=new ArrayList<>();
        // ls.add(Array.asList(2,3,4,5));
        // ls.add(Array.asList(4,5,6,7));
        // ls.add(Array.asList(6,7,8,9));
        HashSet<Integer> ap=new HashSet<>();
        ap.add(2);
        ap.add(3);
        ap.add(4);
        ap.add(5);
         HashSet<Integer> res=new HashSet<>();
         res.add(4);
         res.add(5);
         res.add(6);
         res.add(7);
         HashSet<Integer> bh=new HashSet<>();
         bh.add(6);
         bh.add(7);
         bh.add(8);
         bh.add(9);
   HashMap<Integer,List<Integer>> hp=new HashMap<>();
   for(int i=0;i<k;i++){
    int a=reservedSeats[i][0];
    int b=reservedSeats[i][1];
    if(!hp.containsKey(a)){
        hp.put(a,new ArrayList<>());
    }
    hp.get(a).add(b);
   }
 
int result=0;
   for(Map.Entry<Integer,List<Integer>> x:hp.entrySet()){
List<Integer> a=x.getValue();
  boolean l=true;
  boolean r=true;
  boolean mid=true;
for(int i=0;i<a.size();i++){
  int b=a.get(i); 
System.out.println(b);
  if(ap.contains(b)){
     l=false; 
  }
 if(res.contains(b)){
    mid=false; 
  }
  if(bh.contains(b)){
  r=false;
 
  } 

}
if(l  && r){
    result+=2;
}
else if(l || r || mid){
    result++;
}
   }
//    System.out.println(result);
   result=result+(n-hp.size())*2;
   return result;
    }
}