class Solution {
    public String customSortString(String order, String s) {
        int n=order.length();
        int m=s.length();
        HashMap<Character,Integer> ap=new HashMap<>();
        for(char x:s.toCharArray()){
            ap.put(x,ap.getOrDefault(x,0)+1);
        }
        StringBuilder res=new StringBuilder();
       for (char r : order.toCharArray()) {
    if (ap.containsKey(r)) {
        int mo = ap.get(r);

        for (int i = 0; i < mo; i++) {  
            res.append(r);
        }

        ap.remove(r);   
    }
}
for(Map.Entry<Character,Integer> x:ap.entrySet()){
    char a=x.getKey();
    int b=x.getValue();
    for(int i=0;i<b;i++){
        res.append(a);
    }
}
      return res.toString();
    }
}