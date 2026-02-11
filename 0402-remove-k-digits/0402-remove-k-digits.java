class Solution {
    public String removeKdigits(String num, int k) {
       int n=num.length();
Stack<Integer> st=new Stack<>();
for(int i=0;i<n;i++){
    char c=num.charAt(i);
    int a=c-'0';
    while(!st.isEmpty() && a <  st.peek() && k>0){
        st.pop();
        k--;
    }
    st.push(a);
} 
  
  while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

StringBuilder res=new StringBuilder();
while(!st.isEmpty()){
    res.append(st.pop());
}
 res.reverse();
  while (res.length() > 1 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }
        return res.length()==0 ? "0" : res.toString();
    }
}