class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> ap=new HashMap<>();
        int n=word.length();
        for(int i=0;i<n;i++){
            ap.put(word.charAt(i),i);
        }

        int count=0;
        for(Map.Entry<Character,Integer> x:ap.entrySet()){
            char a=x.getKey();
            int b=x.getValue();
          
           if(Character.isLowerCase(a)){
    char upper = Character.toUpperCase(a);
    if(ap.containsKey(upper) && b < ap.get(upper)){
        int inde=word.lastIndexOf(a);
        int las=word.indexOf(Character.toUpperCase(a));
        if(las-inde >0){
         count++;
        }

    }
        }
        }
        return count;
    }
}