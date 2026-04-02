class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char result=keysPressed.charAt(0);
        int max=releaseTimes[0];
        for(int i=1;i<releaseTimes.length;i++){
            int a=releaseTimes[i]-releaseTimes[i-1];
            if(a == max){
                max=a;
                int c=Math.max((int)result,(int)keysPressed.charAt(i));
                  result=(char)c; 
            }
            else if(a>max){
                max=a;
                result=keysPressed.charAt(i);

            }
            System.out.println(result);
        }
        return result;
    }
}