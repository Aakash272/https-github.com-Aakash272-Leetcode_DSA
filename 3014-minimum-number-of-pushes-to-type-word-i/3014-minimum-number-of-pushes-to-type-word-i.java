class Solution {
    public int minimumPushes(String word) {
     int n=word.length();
     HashMap<Character,Integer> ap=new HashMap<>();
     int result=0;
     int count=0;
     for(int i=0;i<n;i++){
   
    if(count < 8){
        result+=1;
        count++;
    }
    else if(count>=8 && count<16){
        result+=2;
        count++;
    }
    else if(count>=16 && count<24){
        result+=3;
        count++;
    }
    else{
        result+=4;
        count++;
    }
     } 
    return result; 
    }
   
}