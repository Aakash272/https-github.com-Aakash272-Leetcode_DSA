class Solution {
    public int mirrorFrequency(String s) {

        int n = s.length();
        int result = 0;

        HashMap<Character, Integer> hp = new HashMap<>();
        for(int i = 0; i < n; i++){
            hp.put(s.charAt(i), hp.getOrDefault(s.charAt(i), 0) + 1);
        }
        HashSet<Character> visited = new HashSet<>();

        for(char c : hp.keySet()){

            if(visited.contains(c)) continue;

            if(Character.isDigit(c)){
                int a = c - '0';
                int b = 9 - a;

                char ch2 = (char)(b + '0');

                int e = hp.getOrDefault(c, 0);
                int d = hp.getOrDefault(ch2, 0);

                result += Math.abs(e - d);

                visited.add(c);
                visited.add(ch2);
            }
            else{
                char res = (char)('a' + 'z' - c);

                int p = hp.getOrDefault(res, 0);
                int q = hp.getOrDefault(c, 0);

                result += Math.abs(p - q);

                visited.add(c);
                visited.add(res);
            }
        }

        return result;
    }
}