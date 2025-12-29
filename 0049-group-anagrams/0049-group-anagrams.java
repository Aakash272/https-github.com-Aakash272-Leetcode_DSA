class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
int n=strs.length;
Map<List<Character>,List<String>> ap=new HashMap<>();
for(String str:strs){
    List<Character> rp=new ArrayList<>();
    for(char c:str.toCharArray()){
        rp.add(c);
    }
    Collections.sort(rp);
       ap.putIfAbsent(rp, new ArrayList<>());
            ap.get(rp).add(str);
}
return new ArrayList<>(ap.values());
    }
}