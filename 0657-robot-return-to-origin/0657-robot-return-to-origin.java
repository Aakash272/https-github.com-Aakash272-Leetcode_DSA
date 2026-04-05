class Solution {
    public boolean judgeCircle(String moves) {

        HashMap<Character,Integer> ap = new HashMap<>();

        for(int i = 0; i < moves.length(); i++){
            ap.put(moves.charAt(i), ap.getOrDefault(moves.charAt(i), 0) + 1);
        }

        int a = 0, b = 0, c = 0, d = 0;

        for(Map.Entry<Character,Integer> x : ap.entrySet()){
            if(x.getKey() == 'L'){
                a = x.getValue();
            }
            else if(x.getKey() == 'R'){
                b = x.getValue();
            }
            else if(x.getKey() == 'U'){
                c = x.getValue();
            }
            else if(x.getKey() == 'D'){
                d = x.getValue();
            }
        }
        if(a == b && c == d){
            return true;
        }

        return false;
    }
}